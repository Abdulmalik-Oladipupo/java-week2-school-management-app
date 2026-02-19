package schoolManagementSystem;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Principal principal = new Principal(1001,"Mustapha","Barrie","Principla","Male",33,"barriemustapha000@gmail.com","+2349050305111","Cosa", 5000, LocalDateTime.of(2026,01,20,10,30));
        Teachers teachers = new Teachers(100,"Segun","Osiki","Teacher","Male",25,"osikisegun@gmail.com","+2349050315912","Badagry", 95000, LocalDateTime.of(2026,01,01,07,30));
        NonAcademicStaff NAS = new NonAcademicStaff(30, "Frank", "Lampard","Male","Security",29,"franklampard@gmail.com","2348081923244", "Surulere", 50000, LocalDateTime.of(2025,01,01,07,30));
        Students students = new Students(10,"Samuel","Gbenga","Male",LocalDate.of(2004,10,10), "samuelgbenga@gmail.com", "Ibadan","SSS1","Mr & Mrs Sam", "+2349098977622");
        Applicants applicants = new Applicants (10,"Frank","Balogun","Male",LocalDate.of(2000,10,10), "balogunfrank@gmail.com", "Ogun state","SSS1","Mr & Mrs Sam", "+2349098977622", LocalDate.of(2025, 10,10), "Approved");
        Course courses = new Course(101,"Math","calculation and problem solving", "Math101",20);
        principal.expelStudent(students);
        principal.admitApplicant(applicants);
        teachers.teachCourse(courses);
        students.takeCourse(courses);



    }
}
