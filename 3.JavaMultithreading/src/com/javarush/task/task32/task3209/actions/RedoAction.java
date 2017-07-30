package com.javarush.task.task32.task3209.actions;//Created by Vitaly Yakovlev on 25.07.2017.

import com.javarush.task.task32.task3209.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RedoAction extends AbstractAction {
    private View view;

    public RedoAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.redo();
    }
}
