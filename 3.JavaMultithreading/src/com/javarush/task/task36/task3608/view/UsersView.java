package com.javarush.task.task36.task3608.view;//Created by Vitaly Yakovlev on 23.07.2017.

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

import java.util.List;

public class UsersView implements View {

    private Controller controller;
    private ModelData modelData;

    public void setModelData(ModelData modelData) {
        this.modelData = modelData;
    }

    @Override
    public void refresh(ModelData modelData) {
        if(!modelData.isDisplayDeletedUserList()) {
            System.out.println("All users:");
        } else {
            System.out.println("All deleted users:");
        }
        for (User user : modelData.getUsers()) {
            System.out.println("\t" + user);
        }
        System.out.println("===================================================");

    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }

    public void fireEventOpenUserEditForm(long id) { controller.onOpenUserEditForm(id); }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }
}
