package com.Student;
import java.util.*;

public class Student {
private String studentId;
private String name;
private Set <Course> courses;

public Student (String studentId, String name) {
	this.studentId = studentId;
	this.name = name;
	this.courses = new HashSet<>();
}
public String getStudentId() {
    return studentId;
}

public String getName() {
    return name;
}

public Set<Course> getCourses() {
    return courses;
}

public void enrollCourse(Course course) {
    courses.add(course);
}
@Override
public String toString() {
    return "Student ID: " + studentId + ", Name: " + name;
}
}