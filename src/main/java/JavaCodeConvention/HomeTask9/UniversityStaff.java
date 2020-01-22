package JavaCodeConvention.HomeTask9;

public interface UniversityStaff {


    void addStaff(String firstName, String lastName, char sex, int age);
    void removeStaff(String firstName, String lastName, String id);
    void setIncome(int income);
    void setFaculty(String facultyName);
}
