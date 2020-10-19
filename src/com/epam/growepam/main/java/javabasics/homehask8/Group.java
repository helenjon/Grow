package javabasics.homehask8;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private final List<Student> group;

    Group() {
        this.group = new ArrayList<>();
    }

    void setStudents(Student name) {
        this.group.add(name);
    }

    Student getStudents(Integer index) {
        return this.group.get(index);
    }

    public Integer groupSize() {
        return this.group.size();
    }

    //средний балл учебной группы (использовать класс Group);
    Double groupRating() {
        double groupCount = 0.0;
        double groupRating;
        for (Student student : this.group) groupCount = student.getSumRating() + groupCount;
        groupRating = groupCount / this.group.size();
        return groupRating;
    }
    //    в) число отличников;
    Integer numberOfGoodStudent() {
        Integer numberOfGoodStudent = 0;
        for (Student student : this.group) {
            if (student.getSumRating() == 5.0) numberOfGoodStudent++;
        }
        return numberOfGoodStudent;
    }
    //    г) количество студентов, имеющих "2"
    Integer numberOfBadStudent() {
        Integer numberOfBadStudent = 0;
        for (Student student : this.group) {
            if (student.getSumRating() < 3.0) numberOfBadStudent++;
        }
        return numberOfBadStudent;
    }

}
