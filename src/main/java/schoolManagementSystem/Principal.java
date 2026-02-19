package schoolManagementSystem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Principal extends Staff implements StaffAction {

    private String officeNumber;

    private String qualification;

    public String getOfficeNumber() {
        return officeNumber;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "officeNumber='" + officeNumber + '\'' +
                ", qualification='" + qualification + '\'' +
                ", yearsOfExperience='" + yearsOfExperience + '\'' +
                '}';
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Principal(int id, String firstName, String lastName, String role, String gender, int age, String email, String phoneNumber, String address, float salary, LocalDateTime dateHired, String officeNumber, String qualification, String yearsOfExperience) {
        super(id, firstName, lastName, role, gender, age, email, phoneNumber, address, salary, dateHired);
        this.officeNumber = officeNumber;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
    }

    private String yearsOfExperience;

    public Principal(int id, String firstName, String lastName, String role, String gender, int age, String email, String phoneNumber, String address, float salary, LocalDateTime dateHired) {
        super(id, firstName, lastName, role, gender, age, email, phoneNumber, address, salary, dateHired);
    }


    public void expelStudent(Students students) {
        System.out.println("Student "+students.getFirstName()+" has been expelled");
    }
    public String admitApplicant(Applicants applicant) {

        LocalDate today = LocalDate.now();

        int age = Period.between(today, applicant.getBirthDate()).getYears();

        if (age <= 18){
            System.out.println("Application accepted" +age);
            return "Admitted";
        }else

          System.out.println("Application rejected" +age);
        return "Rejected: Required age not met";
        }

    @Override
    public void performDuty() {
        System.out.println("Principal managing/directing the school");
    }
}

