package com.javarush.task.task30.task3008;//Created by Vitaly Yakovlev on 22.07.2017.

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException {
        ConsoleHelper.writeMessage("Input server port:");

        try (ServerSocket newSocket = new ServerSocket(ConsoleHelper.readInt())) {
            ConsoleHelper.writeMessage("Server started...");
            while (true) new Handler(newSocket.accept()).start();

        } catch (Exception e) {
            ConsoleHelper.writeMessage("Something wrong with Socket listener...");
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            ConsoleHelper.writeMessage("Connection installed with " + socket.getRemoteSocketAddress());
            String nameOfNewClient = null;
            try (Connection connection = new Connection(socket);)
            {
                nameOfNewClient = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, nameOfNewClient));
                sendListOfUsers(connection, nameOfNewClient);
                serverMainLoop(connection, nameOfNewClient);

            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Your connection falled");
            } finally {
                if (nameOfNewClient != null) {
                    connectionMap.remove(nameOfNewClient);
                    Message lostUser = new Message(MessageType.USER_REMOVED, nameOfNewClient);
                    sendBroadcastMessage(lostUser);
                    ConsoleHelper.writeMessage("Connection with " + socket.getRemoteSocketAddress() + "closed.");
                }
            }
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message answer = connection.receive();
                if (answer.getType() == MessageType.USER_NAME) {
                    if (!answer.getData().isEmpty()) {
                        if (!connectionMap.containsKey(answer.getData())) {
                            connectionMap.put(answer.getData(), connection);
                            connection.send(new Message(MessageType.NAME_ACCEPTED));
                            return answer.getData();
                        }
                    }
                }
            }
        }

        private void sendListOfUsers(Connection connection, String userName) throws IOException {
            for (Map.Entry<String, Connection> entry : connectionMap.entrySet()) {
                if (!entry.getKey().equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, entry.getKey()));
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message != null && message.getType() == MessageType.TEXT) {
                    Message chatMessage = new Message(MessageType.TEXT, userName + ": " + message.getData());
                    sendBroadcastMessage(chatMessage);
                } else {
                    ConsoleHelper.writeMessage("Error message (Server Main Loop)");
                }
            }
        }

    }

    public static void sendBroadcastMessage(Message message) {
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Error send message...");
            }
        }
    }
}
