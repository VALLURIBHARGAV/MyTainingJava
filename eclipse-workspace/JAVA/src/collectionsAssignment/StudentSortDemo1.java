/*
  */
package collectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student4 implements Comparable<Student4> {
    private int rollNo;
    private String name;

    public Student4(int rollNo, String name) {
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
    public int compareTo(Student4 other) {
        return this.name.compareTo(other.name);
    }
class StudentNameComparator implements Comparator<Student4> {
        @Override
        public int compare(Student4 student1, Student4 student2) {
            return student1.getName().compareTo(student2.getName());
        }
    }
}

public class StudentSortDemo1 {
    public static void main(String[] args) {
       
        ArrayList<Student4> studentList = new ArrayList<>();
        
        studentList.add(new Student4(10123, "Bhargav"));
        studentList.add(new Student4(10234, "Krishna"));
        studentList.add(new Student4(10433, "Manoj"));
        studentList.add(new Student4(10324, "Tarun"));
        studentList.add(new Student4(10335, "Nikhil"));

        System.out.println("Unsorted Student Data:");
        for (Student4 student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList);

        System.out.println("\nSorted Student Data:");
        for (Student4 student : studentList) {
            System.out.println(student);
        }
    }
}



