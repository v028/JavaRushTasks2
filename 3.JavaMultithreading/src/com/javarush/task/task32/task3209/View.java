package com.javarush.task.task32.task3209;//Created by Vitaly Yakovlev on 25.07.2017.

import com.javarush.task.task32.task3209.listeners.FrameListener;
import com.javarush.task.task32.task3209.listeners.TabbedPaneChangeListener;
import com.javarush.task.task32.task3209.listeners.UndoListener;

import javax.swing.*;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {

    private Controller controller;
    private UndoManager undoManager = new UndoManager();
    private UndoListener undoListener = new UndoListener(undoManager);

    private JTabbedPane tabbedPane = new JTabbedPane(); // панель с 2 вкладками
    private JTextPane htmlTextPane = new JTextPane(); //панель с визуальным редактированием HTML (1-я вкладка)
    private JEditorPane plainTextPane = new JEditorPane(); //панель с редактором кода (2-я вкладка)

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Новый":
                controller.createNewDocument();
                break;
            case "Открыть":
                controller.openDocument();
                break;
            case "Сохранить" :
                controller.saveDocument();
                break;
            case "Сохранить как...":
                controller.saveDocumentAs();
                break;
            case "Выход":
                controller.exit();
                break;
            case "О программе":
                showAbout();
                break;
        }
    }

    public View() {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }

        catch (Exception e) { ExceptionHandler.log(e); }
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void init() {
        initGui();
        FrameListener listener = new FrameListener(this);
        addWindowListener(listener);
        setVisible(true);
    }

    //Инициализация меню
    public void initMenuBar() {
        JMenuBar nav = new JMenuBar();
        MenuHelper.initFileMenu(this, nav);
        MenuHelper.initEditMenu(this, nav);
        MenuHelper.initStyleMenu(this, nav);
        MenuHelper.initAlignMenu(this, nav);
        MenuHelper.initColorMenu(this, nav);
        MenuHelper.initFontMenu(this, nav);
        MenuHelper.initHelpMenu(this, nav);

        getContentPane().add(nav, BorderLayout.NORTH);

    }

    public void initEditor() {
        //Создание вкладки с визуальным редактором
        htmlTextPane.setContentType("text/html");
        JScrollPane newPlane = new JScrollPane(htmlTextPane);
        tabbedPane.addTab("HTML", newPlane);

        //Создание вкладки с кодом
        JScrollPane codePlane = new JScrollPane(plainTextPane);
        tabbedPane.addTab("Текст", codePlane);

        //Установка размеров панели
        tabbedPane.setPreferredSize(new Dimension(800, 600));

        //Прослушиватель изменений
        TabbedPaneChangeListener changesListener = new TabbedPaneChangeListener(this);
        tabbedPane.addChangeListener(changesListener);

        getContentPane().add(tabbedPane, BorderLayout.CENTER);

    }

    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }

    public boolean canUndo() {
        if (undoManager.canUndo()) return true;
        else return false;
    }

    public boolean canRedo() {
        if (undoManager.canRedo()) return true;
        else return false;
    }

    public UndoListener getUndoListener() {
        return undoListener;
    }

    //отмена последнего действия
    public void undo() {
        try {
            undoManager.undo();
        } catch (CannotUndoException e) {
            ExceptionHandler.log(e);
        }
    }

    //возврат последней отмены
    public void redo() {
        try {
            undoManager.redo();
        } catch (CannotRedoException e) {
            ExceptionHandler.log(e);
        }
    }

    //сброс всех правок
    public void resetUndo() {
        try {
            undoManager.discardAllEdits();
        } catch (CannotUndoException e) {
            ExceptionHandler.log(e);
        }
    }

    public boolean isHtmlTabSelected() {
        if (tabbedPane.getSelectedIndex() == 0) {
            return true;
        } else return false;
    }

    public void selectHtmlTab() {
        tabbedPane.setSelectedIndex(0);
        resetUndo();
    }

    //Парсинг DOM
    public void update() {
        htmlTextPane.setDocument(controller.getDocument());
    }

    //Popup programm info
    public void showAbout() {
        JOptionPane.showMessageDialog(getContentPane(), "Редактор HTML-страниц", "Информация", JOptionPane.INFORMATION_MESSAGE);
    }

    //Смена вкладок
    public void selectedTabChanged() {
        switch (tabbedPane.getSelectedIndex()) {
            case 0:
                controller.setPlainText(plainTextPane.getText());
                break;
            case 1:
                plainTextPane.setText(controller.getPlainText());
                break;
        }
        resetUndo();
    }

    public void exit() {
        controller.exit();
    }
}
