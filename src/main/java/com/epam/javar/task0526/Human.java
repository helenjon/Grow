package com.epam.javar.task0526;

public class Human {

    private String name;
    private Integer age;
    private String address;

    private Human(HumanBuilder humanBuilder) {
        this.name = humanBuilder.name;
        this.age = humanBuilder.age;
        this.address = humanBuilder.address;
    }

    public Human() {
    }

    @Override
    public String toString(){
        return name + " " + age + " " + address;
    }


    public static class HumanBuilder {
        private String name;
        private int age;
        private String address;

        public HumanBuilder name (String name){
            this.name = name;
            return this;
        }

        public HumanBuilder age (int age){
            this.age = age;
            return this;
        }

        public HumanBuilder address (String address){
            this.address = address;
            return this;
        }

        public Human build() {
           return new Human(this);
        }

    }

}
