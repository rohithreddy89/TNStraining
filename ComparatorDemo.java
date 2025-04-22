package com.tns.kprit.comparator;

import java.util.*;  

class Student {
    int marks;
    Student(int marks) { this.marks = marks; }

    public String toString() {
        return "Student Marks: " + marks;
    }
}


class MarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.marks - s1.marks; 
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(80));
        list.add(new Student(60));
        list.add(new Student(90));

        Collections.sort(list, new MarksComparator());

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
