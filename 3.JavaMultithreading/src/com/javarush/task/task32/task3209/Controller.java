package com.javarush.task.task32.task3209;//Created by Vitaly Yakovlev on 25.07.2017.

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import java.io.*;

public class Controller {
    private View view;
    private HTMLDocument document;
    private File currentFile;

    public Controller(View view) {
        this.view = view;
    }

    public HTMLDocument getDocument() {
        return document;
    }

    public static void main(String[] args) {
        View createView = new View();
        Controller createController = new Controller(createView);

        createView.setController(createController);
        createView.init();
        createController.init();
    }

    public void init() {
        createNewDocument();
    }

    public void exit() {
        System.exit(0);
    }

    //Сброс документа
    public void resetDocument() {
        if (document != null)
            document.removeUndoableEditListener(view.getUndoListener());

        document = (HTMLDocument) new HTMLEditorKit().createDefaultDocument();
        document.addUndoableEditListener(view.getUndoListener());

        view.update();
    }

    //передача кода в HTML-document
    public void setPlainText(String text) {
        resetDocument();
        StringReader code = new StringReader(text);
        try {
            new HTMLEditorKit().read(code, document, 0);
        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
    }

    //Передача из HTML в текст
    public String getPlainText() {
        StringWriter code = new StringWriter();
        try {
            new HTMLEditorKit().write(code, document, 0, document.getLength());
        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
        return code.toString();
    }

    //Создание нового документа
    public void createNewDocument() {
        view.selectHtmlTab();
        resetDocument();
        view.setTitle("HTML редактор");
        view.resetUndo();
        currentFile = null;
        init();
    }

    //Открытие документа
    public void openDocument() {
        view.selectHtmlTab();
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileFilter(new HTMLFileFilter());
        int choose = jFileChooser.showOpenDialog(view);
        if (choose == JFileChooser.APPROVE_OPTION) {
            currentFile = jFileChooser.getSelectedFile();
            resetDocument();
            view.setTitle(currentFile.getName());
            try {
                FileReader fileReader = new FileReader(currentFile);
                new HTMLEditorKit().read(fileReader, document, 0);
                view.resetUndo();
                fileReader.close();

            } catch (Exception e) {
                ExceptionHandler.log(e);
            }
        }
    }

    //Сохранить
    public void saveDocument() {
        if (currentFile == null) saveDocumentAs();
        else {
            view.selectHtmlTab();
            view.setTitle(currentFile.getName());

            try {
                FileWriter fileWriter = new FileWriter(currentFile);
                new HTMLEditorKit().write(fileWriter, document, 0, document.getLength());
                fileWriter.flush();
                fileWriter.close();

            } catch (Exception e) {
                ExceptionHandler.log(e);
            }

        }
    }

    //Сохранить как
    public void saveDocumentAs() {
        view.selectHtmlTab();
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileFilter(new HTMLFileFilter());
        int choose = jFileChooser.showSaveDialog(view);
        if (choose == JFileChooser.APPROVE_OPTION) {
            currentFile = jFileChooser.getSelectedFile();
            view.setTitle(currentFile.getName());
            try {
                FileWriter fileWriter = new FileWriter(currentFile);
                new HTMLEditorKit().write(fileWriter, document, 0, document.getLength());
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                ExceptionHandler.log(e);
            }
        }

    }


}
