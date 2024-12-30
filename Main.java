package Javaprogram;

import java.util.ArrayList;

public class Main {
    // Define the Student class inside the same file
    static class Student {
        private String name;
        private int age;

        // Constructor
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter for Name
        public String getName() {
            return name;
        }

        // Getter for Age
        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + "}";
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 student objects to the ArrayList
        students.add(new Student("Ram", 20));
        students.add(new Student("Bunny", 21));
        students.add(new Student("Neha", 22));
        students.add(new Student("Aditi", 23));
        students.add(new Student("Akshay", 21));
        students.add(new Student("John", 20));
        students.add(new Student("Geeta", 22));
        students.add(new Student("Roshan", 23));
        students.add(new Student("RAj", 24));
        students.add(new Student("Anuja", 21));

        // Use a for-each loop to print the students
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
