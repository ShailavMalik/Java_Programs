//* program to display name and age of n students using constructor

import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + "& Age: " + age);
    }
}

public class p15_Student_Detail {

    public static void main(String[] args) {
        System.out.print("Enter the no. of students: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] s = new Student[n];

        // input student data
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.next();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            s[i] = new Student(name, age);
        }

        // display student data
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        sc.close();
    }
}