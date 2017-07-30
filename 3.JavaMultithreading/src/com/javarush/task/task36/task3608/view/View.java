package com.javarush.task.task36.task3608.view;//Created by Vitaly Yakovlev on 23.07.2017.

import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
