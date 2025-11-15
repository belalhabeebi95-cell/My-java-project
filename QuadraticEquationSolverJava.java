
package quadraticequationsolver.java;

import java.util.Scanner;
public class QuadraticEquationSolverJava {

  
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c");
        //The equation of Quadratic is a*x*x+b*x+c
        double a =input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = (b*b-4*a*c);
        if(discriminant>0){
        double r1 =(-b+Math.pow(discriminant,0.5))/(2*a);
        double r2 = (-b-Math.pow(discriminant,0.5))/(2*a);
        System.out.println("The equatiom has two roots,"+r1+" and "+r2);
               
             }
        else if(discriminant==0){
        double r = (-b/(2*a));
        System.out.println("The equation has one root,"+r);
        
        
        }
        else{
        System.out.println("The equatiom has not root");
        }
        
        
     
    }
    
}
