/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passobjconst;
import java.io.*;

/**
 *
 * @author sergio
 */

class Polar2 {
    private double r;
    private double t;
    private double a;
    private double b;
    
    public void Setr(double rd){r = rd;}
    public void Sett(double td){t = td;}
    public void Seta(double ad){a = ad;}
    public void Setb(double bd){b = bd;}
    
    Polar2() {
        System.out.println("Polar2 default constructor ...");
        Setr(0.0);
        Sett(0.0);
        Seta(0.0);
        Setb(0.0);
    }
    
    Polar2(double ad, double bd) {
        System.out.println("Parametrized a & b constructor ...");
        Setr(0.0);
        Sett(0.0);
        Seta(ad);
        Setb(bd);        
    }
    
    Polar2(double ad, double bd, double rd,double td) {
        System.out.println("Parametrized (a,b,r,t) constructor ...");
        Setr(rd);
        Sett(td);
        Seta(ad);
        Setb(bd);                
    }
    
    public void ConvertToPolar() {
        double x = 0.0;
        r = (a*a+b*b)*0.5;
        x = Math.atan(b/a);
        t = Math.toDegrees(x);
    }
    
    public void DisplayPolar() {
        System.out.println("Inside Display Polar");
        System.out.println("magnitude<r>: " + r + " Angle<t>: " + t );
    }
}

public class PassObjConst {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Polar2 pol2 = new Polar2();
        pol2.DisplayPolar();
        
        Polar2 pol2a = new Polar2(3.0,4.0);
        pol2a.ConvertToPolar();
        pol2a.DisplayPolar();
        
        Polar2 pol2b = new Polar2(3.0,4.0,12.5,53.13);
        pol2b.DisplayPolar();
    }    
}
