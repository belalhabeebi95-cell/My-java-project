package additiomquiz2.java;

import java.util.Scanner;
public class AdditiomQuiz2Java {

   
    public static void main(String[] args) {
        int number1 = (int)(Math.random()*100);
        int number2 = (int)(Math.random()*100);
        int number3 = (int)(Math.random()*100);
        Scanner input = new Scanner(System.in);
        System.out.println("What is "+number1+"+"+number2+"+"+number3);
        int answer = input.nextInt();
        if(answer==number1+number2+number3)
            System.out.println("This answer is correct");
        else{
        System.out.println("Wrong,");
        }
       
    }
    
}
