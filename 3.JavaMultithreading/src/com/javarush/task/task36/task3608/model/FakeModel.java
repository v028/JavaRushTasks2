package com.javarush.task.task36.task3608.model;//Created by Vitaly Yakovlev on 23.07.2017.

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = new ArrayList<>();
        User us1 = new User("Vitaly", 1, 1);
        User us2 = new User("Ivan", 2, 5);
        User us3 = new User("Victor", 3, 9);
        users.add(us1);
        users.add(us2);
        users.add(us3);

        modelData.setUsers(users);
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }
}
