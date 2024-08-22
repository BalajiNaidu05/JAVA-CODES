package com.SIS;
//Filename: BasicEnrollmentService.java
public class BasicEnrollmentService implements EnrollmentService {
 @Override
 public void enroll(Student student, Course course) {
     course.enrollStudent(student);
     System.out.println("Enrolled " + student.getName() + " in " + course.getCourseName());
 }
}

