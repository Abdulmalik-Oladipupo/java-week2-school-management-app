package schoolManagementSystem;

import java.time.LocalDateTime;

public class NonAcademicStaff extends Staff {

    private String department;

    private String jobTitle;

    private LocalDateTime dutyTime;

    public NonAcademicStaff(int id, String firstName, String lastName, String gender,String role, int age, String email, String phoneNumber, String address, float salary, LocalDateTime dateHired) {
        super(id, firstName, lastName, gender,role, age, email, phoneNumber, address, salary, dateHired);
    }
}
