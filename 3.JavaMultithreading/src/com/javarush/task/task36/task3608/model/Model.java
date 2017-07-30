package com.javarush.task.task36.task3608.model;//Created by Vitaly Yakovlev on 23.07.2017.

public interface Model {
    ModelData getModelData();
    void loadUsers();
    void loadDeletedUsers();
    void loadUserById(long userId);
    void deleteUserById(long id);
}
