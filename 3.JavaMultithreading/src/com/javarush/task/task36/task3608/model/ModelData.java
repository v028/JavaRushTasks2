package com.javarush.task.task36.task3608.model;//Created by Vitaly Yakovlev on 23.07.2017.

import com.javarush.task.task36.task3608.bean.User;

import java.util.List;

public class ModelData {
    private List<User> users;
    private User activeUser;
    private boolean displayDeletedUserList;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) { this.activeUser = activeUser; }

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }
}