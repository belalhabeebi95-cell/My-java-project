package average;

import java.util.Scanner;
public class Average {

   
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        System.out.println("Enter three Numbers");
        double number1 = output.nextDouble();
        double number2 = output.nextDouble();
        double number3 = output.nextDouble();
        double average = (number1+number2+number3)/3;
        System.out.println("The Average of "+number1+" "+number2+" "+number3+" "+""+average);
        
        
       
    }
    
}
