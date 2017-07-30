package com.javarush.task.task30.task3008.client;//Created by Vitaly Yakovlev on 24.07.2017.

import java.util.HashSet;
import java.util.Set;

public class ClientGuiModel {

    private final Set<String> allUserNames = new HashSet<>();
    private String newMessage;

    public String getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }

    public Set<String> getAllUserNames() {
        return allUserNames;
    }

    public void addUser(String newUserName) {
        if (!allUserNames.contains(newUserName)) allUserNames.add(newUserName);
    }

    public void deleteUser(String userName) {
        if (allUserNames.contains((userName))) allUserNames.remove(userName);
    }
}
