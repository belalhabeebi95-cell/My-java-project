
package runwaylength.java;

import java.util.Scanner;
public class RunwayLengthJava {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter speed and acceleration");
       double v = input.nextDouble();
        double a = input.nextDouble();
        double length = (v*v)/(2*a);
        System.out.println("The minimun runway length for this airplane is "+length);
        
        
    }
    
}
