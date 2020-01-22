package JavaCodeConvention.HomeTask9;

public class Teacher implements UniversityStaff {

    private String firstName;
    private String lastName;
    private char sex;
    private int age;
    private int yearsOfWork = 1;
    String id;
    int income;
    String facultyName;



    @Override
    public void addStaff(String firstName, String lastName, char sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        int idRandom = ((int)(Math.random()*10000));
        id = "T"+Integer.toString(idRandom);
        this.sex = sex;
        this.age = age;

    }


    @Override
    public void removeStaff(String firstName, String lastName, String id) {

    }

    @Override
    public void setIncome(int income) {
            this.income = income*yearsOfWork;
    }


    public void setFaculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void updateYearsOfWork(int updateYearsOfWork) {
        this.yearsOfWork = updateYearsOfWork;
    }



}
