package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Student {
    int id;
    String name;
    HashMap<Integer, Double> grades;
    List<Course> enrolledCourses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void displayCourses() {
        System.out.println(Arrays.toString(enrolledCourses.toArray()));

    }

    public double calculateGPA() {
        //I cannot figure out how to code this I know I have to use the get grade function somehow
        //Then I multiply it by the corresponding amount of credits before dividing by the number of grades
        //I'm not sure how to code it though
        //And, when I asked you about it I was even more confused
        return 0.0;

    }

    public void enrollCourse(Course course) {

        enrolledCourses.add(course);
    }


    public boolean setGrade(Course course, double grade) {
        if(enrolledCourses.contains(course)) {
            grades.put(course.getId(), grade);
            return true;
        }
        return false;

    }

    public List<Course> getEnrolledCourses() {

        return enrolledCourses;
    }

    public static void main(String[] args) {

    }

    public HashMap<Integer, Double> getGrades() {
        return grades;
    }
}
