package com.tns.kprit.comparator;

import java.util.*;

class StudentA implements Comparable<StudentA> {
    int marks;

    StudentA(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentA other) {
        return other.marks - this.marks;
    }

    @Override
    public String toString() {
        return "Student Marks: " + marks;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<StudentA> list = new ArrayList<>();
        list.add(new StudentA(50));
        list.add(new StudentA(80));
        list.add(new StudentA(70));

        Collections.sort(list); 

        for (StudentA s : list) {
            System.out.println(s);
        }
    }
}
