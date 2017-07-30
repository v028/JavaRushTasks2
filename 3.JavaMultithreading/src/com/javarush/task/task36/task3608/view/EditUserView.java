package com.javarush.task.task36.task3608.view;//Created by Vitaly Yakovlev on 23.07.2017.

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

public class EditUserView implements View {

    private Controller controller;
    private ModelData modelData;

    public void setModelData(ModelData modelData) {
        this.modelData = modelData;
    }

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("User to be edited:");
        System.out.println("\t" + modelData.getActiveUser());
        System.out.println("===================================================");

    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventUserDeleted(long id) { controller.onUserDelete(id); }

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }
}
