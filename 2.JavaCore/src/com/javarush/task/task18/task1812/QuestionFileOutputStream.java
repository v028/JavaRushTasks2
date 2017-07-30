package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream amgObj;

    public QuestionFileOutputStream(AmigoOutputStream amgObj) {
        this.amgObj = amgObj;
    }

    @Override
    public void flush() throws IOException {
        amgObj.flush();
    }

    @Override
    public void write(int b) throws IOException {
        amgObj.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        amgObj.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amgObj.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String answer = r.readLine();
        if (answer.equals("Д")) {
            amgObj.close();
        } else {

        }
    }
}

