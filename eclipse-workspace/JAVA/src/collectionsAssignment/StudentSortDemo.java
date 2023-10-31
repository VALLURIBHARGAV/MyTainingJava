/*
 *4. Create a class Student which should implement Comparable interface of type
Student having following members:
private int rollNo;
private String name;
Include a parameterized constructor to initialize instance variables
Add Getter methods for all instance variables
Override toString( ) to return rollNo and name
Override compareTo( ) to compare names of student
Create a class StudentSortDemo having main method.
 Create an array list of type Student.
 Store 5 student data in arraylist.
 Print all student data. Observe the unsorted data.
 Call the sort ( ) of Collections class to sort student data
 Again print all student data. Observe the sorted data. */package collectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;

class Student3 implements Comparable<Student3> {
    private int rollNo;
    private String name;

    public Student3(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }

    @Override
    public int compareTo(Student3 other) {
        return this.name.compareTo(other.name);
    }
}

public class StudentSortDemo {
    public static void main(String[] args) {
       
        ArrayList<Student3> studentList = new ArrayList<>();
        
        studentList.add(new Student3(10123, "Bhargav"));
        studentList.add(new Student3(10233, "Krishna"));
        studentList.add(new Student3(10333, "Manoj"));
        studentList.add(new Student3(10323, "Tarun"));
        studentList.add(new Student3(10335, "Nikhil"));

        System.out.println("Unsorted Student Data:");
        for (Student3 student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList);

        System.out.println("\nSorted Student Data:");
        for (Student3 student : studentList) {
            System.out.println(student);
        }
    }
}
