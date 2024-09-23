package com.Student;
import java.util.*;

public class EnrollmentSystem {
    private Map<String, Student> students;
    private Map<String, Course> courses;

    public EnrollmentSystem() {
        students = new HashMap<>();
        courses = new HashMap<>();
    }

   
    public void addStudent(String studentId, String name) {
        students.put(studentId, new Student(studentId, name));
    }

    
    public void addCourse(String courseId, String courseName) {
        courses.put(courseId, new Course(courseId, courseName));
    }

   
    public void enrollStudentInCourse(String studentId, String courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        if (student != null && course != null) {
            student.enrollCourse(course);
        } else {
            System.out.println("Student or Course not found.");
        }
    }

   
    public Set<Course> getStudentCourses(String studentId) {
        Student student = students.get(studentId);
        if (student != null) {
            return student.getCourses();
        }
        return new HashSet<>();
    }

    
    public Set<Student> getCourseStudents(String courseId) {
        Set<Student> enrolledStudents = new HashSet<>();
        Course course = courses.get(courseId);

        if (course != null) {
            for (Student student : students.values()) {
                if (student.getCourses().contains(course)) {
                    enrolledStudents.add(student);
                }
            }
        }
        return enrolledStudents;
    }
}
