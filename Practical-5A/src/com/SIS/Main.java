package com.SIS;
public class Main {
 public static void main(String[] args) {
     Student student1 = new Student("S001", "Balaji Naidu");
     Student student2 = new Student("S002", "Veera Balaji");

     Course course1 = new Course("C001", "Computer Science");
     Course course2 = new Course("C002", "Mathematics");

     EnrollmentService enrollmentService = new BasicEnrollmentService();
     enrollmentService.enroll(student1, course1);
     enrollmentService.enroll(student2, course2);

     System.out.println(course1);
     System.out.println(course2);
 }
}
