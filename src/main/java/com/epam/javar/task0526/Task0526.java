package com.epam.javar.task0526;

public class Task0526 {
    public static void main(String[] args) {

        Man onem = new Man("test1", 11, "test1");
        Man twom = new Man("test2", 22, "test2");
        Woman onew = new Woman("test3", 33, "test3");
        Woman twow = new Woman("test4", 44, "test4");
        System.out.println(onem.toString());
        System.out.println(twom.toString());
        System.out.println(onew.toString());
        System.out.println(twow.toString());

        Human nnn = new Human.HumanBuilder().name("sdsd").age(12).address("test").build();
    }

    static class Man extends Human {
        public Man(String name, int age, String address) {
            super();
            new Human.HumanBuilder()
                    .name(name)
                    .age(age)
                    .address(address)
                    .build();
        }
    }

    static class Woman extends Human {
        public Woman(String name, int age, String address) {
            super();
            new Human.HumanBuilder()
                    .name("TEST")
                    .age(21)
                    .address("asasa")
                    .build();
        }
    }

}
