
package sumofdigits;

import java.util.Scanner;


public class SumofDigits {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for sum of Digits");
        int number =input.nextInt();
        int digit1 = number%10;
        int digit2 = (number/10)%10;
         int digit3 = (number/100)%10;
          int digit4 = (number/1000)%10;
          int sum = digit1+digit2+digit3+digit4;
          System.out.println(sum);
                  
    }
    
}
