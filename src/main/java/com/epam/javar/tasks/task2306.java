package com.epam.javar.tasks;


public class task2306 {

        private String country;
        private String city;

        public task2306(String country, String city) {
            this.country = country;
            this.city = city;
        }

        /*т.к. модификатор иннер класса private, то чтобы вызвать метод getDescription из другого внешнего класса,
        нужно обернуть его вызов в какой-то public метод*/
        public String getUserDescription(String name) {
            return getTrickyUser(name).getDescription();
        }

        public SuperUser getTrickyUser(String name) {
            return new SuperUser(name);
        }

        private class SuperUser {
            private String name;

            //доступ к этому методу возможен только внутри класса Solution, т.к. модификатор иннер класса private
            public SuperUser(String name) {
                this.name = name;
            }


            //доступ к этому методу возможен только внутри класса Solution, т.к. модификатор иннер класса private
            public String getDescription() {
                return String.format("My name is %s. I'm from %s in %s.", this.name, city, country);

            }
        }

        public static void main(String[] args) {
            task2306 solution = new task2306("the United States", "Seattle");
            //внутри класса Solution (а сейчас мы внутри) к методу getDescription можно обращаться обоими способами
            System.out.println(solution.getTrickyUser("George").getDescription());
            //а из любого другого внешнего класса только так:
         //   System.out.println(solution.getUserDescription("George"));

        }
    }

//    My name is George. I'm from Seattle in the United States.
//    My name is George. I'm from Seattle in the United States.
