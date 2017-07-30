package com.javarush.task.task16.task1631;//Created by Vitaly Yakovlev on 30.07.2017.

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes type) {
        if (type == ImageTypes.BMP) {
            return new BmpReader();
        } else if (type == ImageTypes.JPG) {
            return new JpgReader();
        } else if (type == ImageTypes.PNG) {
            return new PngReader();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
