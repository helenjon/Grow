package JavaCodeConvention.HomeTask9;

public class Student implements UniversityStaff {


    private String firstName;
    private String lastName;
    private String id;
    private char sex;
    private int age;
    private int income;
    private String groupName;
    private String facultyName;


    public Student(final String firstName, final String lastName, final char sex, final int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        int idRandom = ((int)(Math.random()*10000));
        id = "S"+Integer.toString(idRandom);
    }

    @Override
    public void removeStaff() {
            firstName = null;
            lastName = null;

    }


    @Override
    public void setIncome(int income) {

        this.income = income;
    }

    @Override
    public void setFaculty(String facultyName) {
        this.facultyName = facultyName;


    }


    public void setGroup(String groupName) {

        this.groupName = groupName;
    }
}
