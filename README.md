# School Management System (OOP Project)

## Project Description
This project models a basic school system using Object-Oriented Programming (OOP) principles.

The system includes:
- Staff
- Principal
- Teachers
- Non-Academic Staff
- Students
- Applicants
- Courses
- ClassRoom

The Principal can admit applicants based on age and expel students.
Teachers can teach courses.
Students can take courses.

---

##  OOP Concepts Used

- Encapsulation (private fields with getters/setters)
- Inheritance (Principal, Teacher, NonAcademicStaff extend Staff, while Student,Applicants extend Learner)
- Polymorphism (performDuty() method overridden)
- Abstraction (Staff class and Learner class iare abstract)
- Interfaces (StaffAction)
- Aggregation & Composition (Classroom contains Students, Staff, and Courses)

---

##  Class Structure

- ClassRoom
- Staff (abstract)
  - Principal
  - Teacher
  - NonAcademicStaff
  - Learner(abstract)
- Student
- Applicant
- Course

---

##  How It Works

1. A Classroom is created.
2. Staff and Courses are added.
3. An Applicant applies.
4. The Principal checks age and admits the applicant.
5. A Student can enroll in a Course.
6. A Teacher can teach a Course.
7. The Principal can expel a Student.

---

##  Technologies Used

- Java
- Object-Oriented Programming Principles
- java.time (LocalDate)

---

## 👨‍💻 Author
Oladis Gold

