package com.epam.javabasics.homehask8;

public class Student {

//    Оценки, полученные студентами в сессию, являются атрибутами класса Student.
//            Определить:
//    а) средний балл учебной группы (использовать класс Group);
//    б) средний балл каждого студента;
//    в) число отличников;
//    г) количество студентов, имеющих "2"

    private final Integer rating1;
    private final Integer rating2;
    private final Integer rating3;
    private final String name;

    Student(String name, String surname, Integer rating1, Integer rating2, Integer rating3) {
        this.name = name;
        this.rating1 = rating1;
        this.rating2 = rating2;
        this.rating3 = rating3;
    }

    public static void main(String[] args) {
        Student Margo = new Student("Margo", "MMM", 5, 5, 4);
        Student Tom = new Student("Tom", "TTT", 5, 5, 5);
        Student Din = new Student("Din", "DDD", 2, 3, 2);
        Student Dack = new Student("Dack", "DaDa", 5, 5, 5);

        Group first = new Group();
        first.setStudents(Margo);
        first.setStudents(Tom);
        first.setStudents(Din);
        first.setStudents(Dack);

        String test = first.getStudents(2).name;
        System.out.println(first.getStudents(2).name);
        //    б) средний балл каждого студента;
        System.out.println("Midiane student rate = " + first.getStudents(2).getSumRating());
        //    а) средний балл учебной группы (использовать класс Group);
        System.out.println("Midiane group rate = " + first.groupRating());
        // в) число отличников;
        System.out.println("Number of good students = " + first.numberOfGoodStudent());
        // г) количество студентов, имеющих "2"
        System.out.println("Number of good students = " + first.numberOfBadStudent());
    }

    public Integer getRating1() {
        return rating1;
    }

    public Integer getRating2() {
        return rating2;
    }

    public Integer getRating3() {
        return rating3;
    }

    double getSumRating() {
        return (this.rating1 + this.rating2 + this.rating3) / 3.0;
    }

}

