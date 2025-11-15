package computechange.java;

import java.util.Scanner;
public class ComputeChangeJava {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter an amount in Double");
    double amount = input.nextDouble();
    int rimainingAmount = (int)(amount*100);
    int numberofOneDollars = rimainingAmount/100;
        
    rimainingAmount = rimainingAmount%100;
    int numberofOneQuarters = rimainingAmount/25;
    rimainingAmount = rimainingAmount%25;
    int numberofOneDimes = rimainingAmount/10;
    rimainingAmount = rimainingAmount%10;
    int numberofOneNickels = rimainingAmount/5;
    rimainingAmount = rimainingAmount%5;
    int numberofOnePennies = rimainingAmount;
    System.out.println("Your amount "+amount+" consist of");
    System.out.println(""+numberofOneDollars+" Dollars");
    System.out.println(""+numberofOneQuarters+" Quarters");
    System.out.println(""+numberofOneDimes+" Dimes");
        System.out.println(""+numberofOneNickels+" Nickels");
     System.out.println(""+numberofOnePennies+" Pemmies");
    
        
    }
    
}
