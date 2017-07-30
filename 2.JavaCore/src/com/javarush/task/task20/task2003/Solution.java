package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties;

    static {
        properties = new HashMap<>();
    }

    public static Properties props = new Properties();

    public static void main (String[] args) throws Exception
    {
        new Solution().fillInPropertiesMap();
        System.out.println(properties);
        new Solution().save(new FileOutputStream("d:/2.properties"));
    }

    public void fillInPropertiesMap() throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        InputStream fileProperties = new FileInputStream(bufferedReader.readLine());
        bufferedReader.close();
        load(fileProperties);
    }

    public void save(OutputStream outputStream) throws Exception {
        PrintWriter printWriter = new PrintWriter(outputStream);
        if (props.size() > 0)
            props.putAll(properties);
        props.store(outputStream, "");
        printWriter.close();
    }

    public void load(InputStream inputStream) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        props.load(inputStream);
        Set<String> list = props.stringPropertyNames();
        for (String current : list)
            properties.put(current, props.getProperty(current));
        bufferedReader.close();
    }
}