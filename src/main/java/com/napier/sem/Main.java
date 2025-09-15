package com.napier.sem;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Create Student objects
        Student student1 = new Student("Myo", 22, "S001");
        Student student2 = new Student("Pa Pa", 21, "S002");
        Student student3 = new Student("Kyaw", 23, "S003");

        // Display student info
        System.out.println("\nStudent Information:");
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
        System.out.println();
        student3.displayInfo();
    }
}
