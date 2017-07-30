package com.javarush.task.task21.task2107;

import javax.swing.text.html.HTMLDocument;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution implements Cloneable {

    public Solution clone() throws CloneNotSupportedException {
        Solution solution = new Solution();
        Iterator it = this.users.keySet().iterator();
        String key;
        while (it.hasNext()) {
            key = (String) it.next();
            solution.users.put(key, this.users.get(key));
        }
        return solution;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;

        clone = solution.clone();
        System.out.println(solution);
        System.out.println(clone);

        System.out.println(solution.users);
        System.out.println(clone.users);
    }

    protected Map<String, User> users = new LinkedHashMap();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;

        Solution solution = (Solution) o;

        return users != null ? users.equals(solution.users) : solution.users == null;
    }

    @Override
    public int hashCode() {
        return users != null ? users.hashCode() : 0;
    }

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public User clone() {
            User user = new User(this.age, this.name);
            return user;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;

            User user = (User) o;

            if (age != user.age) return false;
            return name != null ? name.equals(user.name) : user.name == null;
        }

        @Override
        public int hashCode() {
            int result = age;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }
}
