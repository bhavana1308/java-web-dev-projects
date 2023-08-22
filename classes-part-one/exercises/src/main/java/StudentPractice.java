package main.java;

import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args) {

        Student student = new Student("Bhavana", 123, 1, 4.0);
        //insantiate your Student class below
        System.out.println(student);

        Teacher teacher = new Teacher("Mike", "Tully", "Java", 5);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Abc", 1, 1, 3.5));
        students.add(new Student("Bbb", 2, 1, 4.0));

        Course course = new Course("Java", teacher, students);
        System.out.println(course);

    }
}
