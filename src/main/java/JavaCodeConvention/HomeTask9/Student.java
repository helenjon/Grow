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


    @Override
    public void addStaff(String firstName, String lastName, char sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        int idRandom = ((int)(Math.random()*10000));
        String id = "S"+Integer.toString(idRandom);
        this.sex = sex;
        this.age = age;
    }


    @Override
    public void removeStaff(String firstName, String lastName, String id) {


    }


    @Override
    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public void setFaculty(final String facultyName) {
        this.facultyName = facultyName;
    }


    public void setGroup(String groupName) {
        this.groupName = groupName;
    }
}
