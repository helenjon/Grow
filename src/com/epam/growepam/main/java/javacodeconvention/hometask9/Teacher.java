package javacodeconvention.hometask9;

public class Teacher implements UniversityStaff {

    String id;
    int income;
    String facultyName;
    private String firstName;
    private String lastName;
    private int yearsOfWork = 1;

    public Teacher(final String firstName, final String lastName, final char sex, final int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        int idRandom = ((int) (Math.random() * 10000));
        id = "T" + idRandom;

    }

    @Override
    public void removeStaff() {
        firstName = null;
        lastName = null;
    }

    @Override
    public void setIncome(int income) {

        this.income = income * yearsOfWork;
    }


    public void setFaculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void updateYearsOfWork(int updateYearsOfWork) {
        this.yearsOfWork = updateYearsOfWork;
    }


}
