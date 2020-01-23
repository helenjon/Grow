package JavaCodeConvention.HomeTask9;

public class OtherStaff extends Teacher implements UniversityStaff {


    private int yearsOfWork = 2;


    public OtherStaff(final String firstName, final String lastName, final char sex, final int age, final int
            yearsOfWork) {
        super(firstName, lastName, sex, age);
        this.yearsOfWork = yearsOfWork;
        int idRandom = ((int)(Math.random()*10000));
        id = "L"+Integer.toString(idRandom);
    }

    @Override
    public void removeStaff() {

    }

    @Override
    public void setIncome(int income) {
        super.income = income*yearsOfWork;
    }

    @Override
    public void setFaculty(final String facultyName) {
        super.facultyName = facultyName;
    }



}
