package com.epam.javar.tasks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/*
Глубокое клонирование карты
*/

public class Task2109 implements Cloneable {

    public static void main(String[] args) {
        Task2109 solution = new Task2109();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Object clone1 = null;
        try {
            clone1 = solution.clone();
            System.out.println(solution);
            System.out.println(clone1);

            System.out.println(solution.users);
            //       System.out.println(clone1.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }


    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;
            User user = (User) o;
            return age == user.age &&
                    Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }

        public Object clone() throws CloneNotSupportedException {
            User user = new User(age, name);
            user.age = this.age;
            user.name = this.name;
            return user;
        }
    }
}
