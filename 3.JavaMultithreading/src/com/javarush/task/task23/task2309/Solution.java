package com.javarush.task.task23.task2309;

import com.javarush.task.task23.task2309.vo.*;

import java.util.List;

/* 
Анонимность иногда так приятна!
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        print(solution.getUsers());
        print(solution.getLocations());
        print(solution.getServers());
        print(solution.getSubjects());
        print(solution.getSubscriptions());
    }

    public static void print(List list) {
        String format = "Id=%d, name='%s', description=%s";
        for (Object obj : list) {
            NamedItem item = (NamedItem) obj;
            System.out.println(String.format(format, item.getId(), item.getName(), item.getDescription()));
        }
    }

    public List<User> getUsers() {
        return new AbstractDbSelectExecutor<User>()
        {

            public String getQuery()
            {
                return "select * from USER";
            }
        }.execute();
    }

    public List<Location> getLocations() {
        return new AbstractDbSelectExecutor<Location>()
        {

            public String getQuery()
            {
                return "select * from LOCATION";
            }
        }.execute();
    }

    public List<Server> getServers() {
        return new AbstractDbSelectExecutor<Server>()
        {

            public String getQuery()
            {
                return "select * from SERVER";
            }
        }.execute();
    }

    public List<Subject> getSubjects() {
        return new AbstractDbSelectExecutor<Subject>()
        {

            public String getQuery()
            {
                return "select * from SUBJECT";
            }
        }.execute();
    }

    public List<Subscription> getSubscriptions() {
        return new AbstractDbSelectExecutor<Subscription>()
        {

            public String getQuery()
            {
                return "select * from SUBSCRIPTION";
            }
        }.execute();
    }
}

