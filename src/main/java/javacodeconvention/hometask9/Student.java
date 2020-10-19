package javacodeconvention.hometask9;

public class Student implements UniversityStaff {


    private String firstName;
    private String lastName;


    public Student(final String firstName, final String lastName, final char sex, final int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        int idRandom = ((int) (Math.random() * 10000));
        String id = "S" + idRandom;
    }

    @Override
    public void removeStaff() {
        firstName = null;
        lastName = null;

    }


    @Override
    public void setIncome(int income) {

    }

    @Override
    public void setFaculty(String facultyName) {


    }


    public void setGroup(String groupName) {

    }
}
