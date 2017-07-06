/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polarthisdemo;
import java.io.*;

/**
 *
 * @author sergio
 */

class Polar3 {
    private double r;
    private double t;
    private double a;
    private double b;
    
    public void Setr(double r){this.r = r;}
    public void Sett(double t){this.t = t;}
    public void Seta(double a){this.a = a;}
    public void Setb(double b){this.b = b;}
    
    Polar3() {
        System.out.println("Polar3 default constructor.");
        Setr(0.0); 
        Sett(0.0);
        Seta(0.0); 
        Setb(0.0);
    }
    
    Polar3(double a, double b) {
        System.out.println("Parametrized (a,b) constructor");
        Setr(0.0); 
        Sett(0.0);
        Seta(a); 
        Setb(b);
    }
    
    public void ConvertToPolar() {
        double x = 0.0;
        r = (a*a+b*b)*0.5;
        x = Math.atan(b/a);
        t = Math.toDegrees(x);
    }
    
    public void DisplayPolar() {
        System.out.println("Inside Display Polar.");
        System.out.println("mag<r>: " + this.r + " angle<t> " + this.t);
    }
}

public class PolarThisDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Polar3 pol3a = new Polar3(3.0,4.0);
        pol3a.ConvertToPolar();
        pol3a.DisplayPolar();
    }
    
}