package com.Student;

public class Course {
private String courseId;
private String courseName;

public Course (String courseId, String courseName) {
	this.courseId = courseId;
	this.courseName = courseName;
}
public String getCourseId() {
    return courseId;
}

public String getCourseName() {
    return courseName;
}

@Override
public String toString() {
    return "Course ID: " + courseId + ", Name: " + courseName;
}
@Override
public boolean equals(Object o) {
	if (this==o) return true;
	if (o==null || getClass() != o.getClass()) return false;
	Course course = (Course) o;
	return courseId.equals(course.courseId);
}
@Override
public int hashCode() {
    return courseId.hashCode();
}
}
