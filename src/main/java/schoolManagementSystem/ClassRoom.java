package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {

    private List<Students> students = new ArrayList<>();
    private int id;
    private String className;
    private String classTeacher;
    private int numberOfStudents;

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "students=" + students +
                ", id=" + id +
                ", className='" + className + '\'' +
                ", classTeacher='" + classTeacher + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }

    public ClassRoom(List<Students> students, int id, String className, String classTeacher, int numberOfStudents) {
        this.students = students;
        this.id = id;
        this.className = className;
        this.classTeacher = classTeacher;
        this.numberOfStudents = numberOfStudents;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
