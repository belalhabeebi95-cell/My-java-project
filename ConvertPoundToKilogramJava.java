
package convertpoundtokilogram.java;

import java.util.Scanner;
public class ConvertPoundToKilogramJava {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a number in pounds");
       double pounds = input.nextDouble();
       double kilogram = 0.454*pounds;
       System.out.println(pounds+" pounds is "+kilogram+" kilogram");
       
    }
    
}
