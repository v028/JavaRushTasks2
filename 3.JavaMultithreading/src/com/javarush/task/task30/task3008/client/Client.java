package com.javarush.task.task30.task3008.client;//Created by Vitaly Yakovlev on 23.07.2017.

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.Buffer;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    public class SocketThread extends Thread {

        public void run() {
            try {
                String serverAddress = Client.this.getServerAddress();
                int port = Client.this.getServerPort();
                Socket socket = new Socket(serverAddress, port);
                Client.this.connection = new Connection(socket);
                clientHandshake();
                clientMainLoop();

            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Connection was interrupted. " + e.getMessage());
                notifyConnectionStatusChanged(false);
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException {
            Connection connect = Client.this.connection;
            while (true) {
                Message mess = connect.receive();
                if (mess.getType() == MessageType.NAME_REQUEST) {
                    String getName = Client.this.getUserName();
                    Message messWithName = new Message(MessageType.USER_NAME, getName);
                    connect.send(messWithName);
                } else if (mess.getType() == MessageType.NAME_ACCEPTED) {
                    notifyConnectionStatusChanged(true);
                    break;
                } else {
                    throw new IOException("Unexpected MessageType");
                }
            }
        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            Connection connect = Client.this.connection;
            while (true) {
                Message mes = connect.receive();
                if (mes.getType() == MessageType.TEXT) {
                    processIncomingMessage(mes.getData());
                } else if (mes.getType() == MessageType.USER_ADDED) {
                    informAboutAddingNewUser(mes.getData());
                } else if (mes.getType() == MessageType.USER_REMOVED) {
                    informAboutDeletingNewUser(mes.getData());
                } else {
                    throw new IOException("Unexpected MessageType");
                }
            }
        }

        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }
        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage("User " + userName + " was added to this chat.");
        }
        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage("User " + userName + "leave this chat.");
        }
        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this) {
                Client.this.notify();
            }
        }
    }

    public static void main(String[] args) {
        new Client().run();
    }

    public void run() {
        SocketThread socketThread = getSocketThread();
        socketThread.setDaemon(true);
        socketThread.start();
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                ConsoleHelper.writeMessage("Connection was interrupted. " + e.getMessage());
                System.exit(1);
            }
        }
        if (clientConnected == true) {
            ConsoleHelper.writeMessage("Соединение установлено. Для выхода наберите команду ‘exit’.");
        } else {
            ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");
        }

        while (clientConnected == true) {
            String message = ConsoleHelper.readString();
            if (message.equals("exit")) {
                break;
            }
            if (shouldSendTextFromConsole() == true) {
                sendTextMessage(message);
            }
        }
    }

    protected String getServerAddress() throws IOException {
        ConsoleHelper.writeMessage("Input server address:");
        return ConsoleHelper.readString();
    }

    protected int getServerPort() throws IOException {
        ConsoleHelper.writeMessage("Input server port (integer):");
        return ConsoleHelper.readInt();
    }

    protected String getUserName() throws IOException {
        ConsoleHelper.writeMessage("Input your name:");
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            System.out.println("Connection error...");
            clientConnected = false;
        }
    }
}
