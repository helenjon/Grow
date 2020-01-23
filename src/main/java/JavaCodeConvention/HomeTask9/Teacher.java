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

    public Teacher(final String firstName, final String lastName, final char sex, final int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        int idRandom = ((int)(Math.random()*10000));
        id = "T"+Integer.toString(idRandom);

    }

    @Override
    public void removeStaff() {
          firstName = null;
          lastName = null;
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
