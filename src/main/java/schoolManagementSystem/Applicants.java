package schoolManagementSystem;

import java.time.LocalDate;

public class Applicants extends Learners {

    public LocalDate getApplicantDate() {
        return applicantDate;
    }

    public Applicants(int id, String firstName, String lastName, String gender, LocalDate birthDate, String email, String address, String className, String parentName, String parentContact, LocalDate applicantDate, String applicantStatus) {
        super(id, firstName, lastName, gender, birthDate, email, address, className, parentName, parentContact);
        this.applicantDate = applicantDate;
        this.applicantStatus = applicantStatus;
    }

    @Override
    public String toString() {
        return "Applicants{" +
                "applicantDate=" + applicantDate +
                ", applicantStatus='" + applicantStatus + '\'' +
                '}';
    }

    public void setApplicantDate(LocalDate applicantDate) {
        this.applicantDate = applicantDate;
    }

    public void setApplicantStatus(String applicantStatus) {
        this.applicantStatus = applicantStatus;
    }

    public String getApplicantStatus() {
        return applicantStatus;
    }

    private LocalDate applicantDate;

    private String applicantStatus;

    public Applicants(int id, String firstName, String lastName, String gender, LocalDate birthDate, String email, String address, String className, String parentName, String parentContact) {
        super(id, firstName, lastName, gender, birthDate, email, address, className, parentName, parentContact);
    }
}
