
package computeequatiom.java;

import java.util.Scanner;
public class ComputeEquatiomJava {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a,b,c,d,e,f");
       double a = input.nextDouble();
       double b = input.nextDouble();
       double c = input.nextDouble();
       double d = input.nextDouble();
       double e = input.nextDouble();
       double f = input.nextDouble();
      
       double x = (e*d/e*b*f)/(a*d-b*c);
       double y = (a*f-e*c)/(a*d-b*c);
        System.out.println("x is "+x+" and y is "+y);
        
                if((a*d-b*c)==0){
            System.out.println("This is not solves");
    }
    }
}
