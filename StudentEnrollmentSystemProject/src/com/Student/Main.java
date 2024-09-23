package com.Student;
public class Main {
public static void main(String[] args) {
    EnrollmentSystem system = new EnrollmentSystem();

    // Add students
    system.addStudent("S001", "Balaji");
    system.addStudent("S002", "Veera");

    // Add courses
    system.addCourse("C101", "Math 101");
    system.addCourse("C102", "Physics 101");

    // Enroll students in courses
    system.enrollStudentInCourse("S001", "C101");
    system.enrollStudentInCourse("S001", "C102");
    system.enrollStudentInCourse("S002", "C101");

    // List student courses
    System.out.println("Courses for Balaji: " + system.getStudentCourses("S001"));
    System.out.println("Courses for Veera : " + system.getStudentCourses("S002"));

    // List students in a course
    System.out.println("Students enrolled in Math 101: " + system.getCourseStudents("C101"));
}
}