package schoolManagementSystem;

import java.time.LocalDateTime;

import java.util.ArrayList;

import java.util.List;

public class Teachers extends Staff implements StaffAction{

    private List<Course> courses = new ArrayList<>();

    private String subjectSpecification;

    private String qualificationSpecification;

    public String getSubjectSpecification() {
        return subjectSpecification;
    }

    public void setSubjectSpecification(String subjectSpecification) {
        this.subjectSpecification = subjectSpecification;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "subjectSpecification='" + subjectSpecification + '\'' +
                ", qualificationSpecification='" + qualificationSpecification + '\'' +
                ", assignedClass='" + assignedClass + '\'' +
                ", yearsOfExperienceSpecification='" + yearsOfExperienceSpecification + '\'' +
                '}';
    }

    public Teachers(int id, String firstName, String lastName, String role, String gender, int age, String email, String phoneNumber, String address, float salary, LocalDateTime dateHired, String subjectSpecification, String qualificationSpecification, String assignedClass, String yearsOfExperienceSpecification) {
        super(id, firstName, lastName, role, gender, age, email, phoneNumber, address, salary, dateHired);
        this.subjectSpecification = subjectSpecification;
        this.qualificationSpecification = qualificationSpecification;
        this.assignedClass = assignedClass;
        this.yearsOfExperienceSpecification = yearsOfExperienceSpecification;
    }

    public String getQualificationSpecification() {
        return qualificationSpecification;
    }

    public void setQualificationSpecification(String qualificationSpecification) {
        this.qualificationSpecification = qualificationSpecification;
    }

    public String getAssignedClass() {
        return assignedClass;
    }

    public void setAssignedClass(String assignedClass) {
        this.assignedClass = assignedClass;
    }

    public String getYearsOfExperienceSpecification() {
        return yearsOfExperienceSpecification;
    }

    public void setYearsOfExperienceSpecification(String yearsOfExperienceSpecification) {
        this.yearsOfExperienceSpecification = yearsOfExperienceSpecification;
    }

    private String assignedClass;

    private String  yearsOfExperienceSpecification;

    public Teachers(int id, String firstName, String lastName, String role, String gender, int age, String email, String phoneNumber, String address, float salary, LocalDateTime dateHired) {
        super(id, firstName, lastName, role, gender, age, email, phoneNumber, address, salary, dateHired);
    }


    public void teachCourse(Course course) {

        courses.add(course);

        System.out.println("Teaching course: " + course.getCourseName());

    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public void performDuty() {
        System.out.println("Teacher is preparing lesson note");
    }
}
