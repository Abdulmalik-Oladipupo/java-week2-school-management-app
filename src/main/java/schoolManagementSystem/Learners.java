package schoolManagementSystem;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

abstract public class Learners {

    //Field

    private int id;

    private String firstName;

    private String lastName;

    private String gender;

    private LocalDate birthDate;

    private String email;

    private String address;

    private String className;

    private String parentName;

    private String parentContact;


        //@Constructor

    public Learners(int id, String firstName, String lastName, String gender, LocalDate birthDate, String email, String address, String className, String parentName, String parentContact) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
        this.className = className;
        this.parentName = parentName;
        this.parentContact = parentContact;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", className='" + className + '\'' +
                ", parentName='" + parentName + '\'' +
                ", parentContact='" + parentContact + '\'' +
                '}';
    }

    //getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentContact() {
        return parentContact;
    }

    public void setParentContact(String parentContact) {
        this.parentContact = parentContact;
    }
}
