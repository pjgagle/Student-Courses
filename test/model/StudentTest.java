package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void enrollCourse() {
        Course aCourse = new Course(2, 2, "test", "test", 2);
        Student aStudent = new Student(1, "Gagle");
        aStudent.enrollCourse(aCourse);
        assertEquals(1, aStudent.getEnrolledCourses().size());
    }

    @Test
    void setGrade() {
        Course bCourse = new Course(3, 3, "test2", "test2", 4);
        Student bStudent = new Student (2, "PGagle");
        bStudent.enrollCourse(bCourse);

    }
}