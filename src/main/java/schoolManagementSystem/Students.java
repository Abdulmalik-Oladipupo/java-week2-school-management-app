package schoolManagementSystem;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class Students extends Learners {

    private List<Course> courses = new ArrayList<>();

    private String className;

    private LocalDate enrollmentDate;

    public Students(int id, String firstName, String lastName, String gender, LocalDate birthDate, String email, String address, String className, String parentName, String parentContact) {
        super(id, firstName, lastName, gender, birthDate, email, address, className, parentName, parentContact);
    }

    public void takeCourse(Course course) {
        courses.add(course);
        System.out.println("Taking course " + course.getCourseName());

    }
    public List<Course> getCourses() {
        return courses;
    }
}
