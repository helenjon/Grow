package lesson6;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Student> group;
    Integer index;

    public Group() {
        this.group = new ArrayList<>();
    }

    public void setStudents(Student name) {

        this.group.add(name);
    }

    public Student getStudents(Integer index) {

        return this.group.get(index);
    }

    public Integer groupSize() {
        return this.group.size();
    }

    //средний балл учебной группы (использовать класс Group);

    public Double groupRating() {
        Double groupCount = 0.0;
        Double groupRating;

        for (Student student : this.group)     groupCount = student.getSumRating() + groupCount;

        groupRating = groupCount / this.group.size();
        return groupRating;
    }

    //    в) число отличников;
    public Integer numberOfGoodStudent() {

        Integer numberOfGoodStudent = 0;

        for (Student student : this.group) {
                if (student.getSumRating() == 5.0) numberOfGoodStudent++;
        }
        return numberOfGoodStudent;
    }


    //    г) количество студентов, имеющих "2"
    public Integer numberOfBadStudent(){

        Integer numberOfBadStudent = 0;

        for (Student student : this.group){
            if (student.getSumRating() < 3.0) numberOfBadStudent++;
        }
        return numberOfBadStudent;
    }
}
