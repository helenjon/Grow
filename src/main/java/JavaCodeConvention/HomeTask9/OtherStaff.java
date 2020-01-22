package JavaCodeConvention.HomeTask9;

public class OtherStaff extends Teacher implements UniversityStaff {


    private int yearsOfWork = 2;


    @Override
    public void addStaff(String firstName, String lastName, char sex, int age) {
        super.addStaff(firstName, lastName,sex,age);
        int idRandom = ((int)(Math.random()*10000));
        id = "L"+Integer.toString(idRandom);

    }

    @Override
    public void removeStaff(final String firstName, final String lastName, final String id) {

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
