package schoolManagementSystem;

public class Course {

    private int id;

    private String courseName;

    private String courseDescription;

    private String courseCode;

    private int creditUnit;

    public Course(int id, String courseName, String courseDescription, String courseCode, int creditUnit) {
        this.id = id;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseCode = courseCode;
        this.creditUnit = creditUnit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCreditUnit() {
        return creditUnit;
    }

    public void setCreditUnit(int creditUnit) {
        this.creditUnit = creditUnit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", creditUnit=" + creditUnit +
                '}';
    }
}

