
package computeandinterpretbmi.java;

import java.util.Scanner;
public class ComputeAndInterpretBmiJava {

    
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();
        System.out.println("Enter feet:");
        double feet = input.nextDouble();
        System.out.println("Enter inches:");
        double inches = input.nextDouble();
        double totalinches = feet*12+inches;
        double weightInKg = weight*0.45359237;
        double heightInMeters = totalinches*0.0254;
        double bmi = (weightInKg)/(heightInMeters*heightInMeters);
        if(bmi<18.5){
        System.out.println("Underweight");
        }
        else if(bmi<25){
        System.out.println("Normal");
        
        }
        else if(bmi<30){
        System.out.println("Overweight");
        }        
        else if(bmi<=30){
        System.out.println("Obese");
        }
        
       
    }
    
}
