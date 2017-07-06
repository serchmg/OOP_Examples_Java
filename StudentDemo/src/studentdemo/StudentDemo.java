/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;
import java.io.*;

/**
 *
 * @author sergio
 */

class Student1 {
    String name = "";
    int rollNo;
    double totalMarks;
    String grade = "";
}

public class StudentDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student1 std = new Student1();
        std.name = "Gautam";
        std.rollNo = 6274;
        std.totalMarks = 98.78;
        
        if(std.totalMarks >= 80.0) {
            std.grade = "A";
        } else if (std.totalMarks >= 60.0) {
            std.grade = "B";
        } else if (std.totalMarks >= 50.0) {
            std.grade = "C";
        } else {
            std.grade = "D";
        }
        
        System.out.println("Student details are ...");
        System.out.println("Roll Number: " + std.rollNo);
        System.out.println("Name: " + std.name);
        System.out.println("Total marks: " + std.totalMarks);
        System.out.println("Grade: " + std.grade);
    }
}
