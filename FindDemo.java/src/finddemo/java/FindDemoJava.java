/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finddemo.java;
import java.io.*;

/**
 *
 * @author sergio
 */

class OverLoadedFind {
    public double Find(double side){return side*side;}
    public double Find(double l, double b){return l*b;}
    public double Find(double l, double b, double h){return l*b*h;}
}


public class FindDemoJava {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OverLoadedFind ovrFind = new OverLoadedFind();
        System.out.println("Area of square: " + ovrFind.Find(10.0));
        System.out.println("Area of rectangle: " + ovrFind.Find(10,20.0));
        System.out.println("Vol of cube: " + ovrFind.Find(10.0,20.0,30.0));
    }    
}
