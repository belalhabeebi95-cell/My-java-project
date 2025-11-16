
package computethefuturedays.java;

import java.util.Scanner;
public class ComputeTheFutureDaysJava {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's day:");
        int today = input.nextInt();
        System.out.println("Enter the number of days elaosed since today:");
        int elapsed = input.nextInt();
        int future = (today+elapsed)%7;
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Turesday","Friday","Saturday"};
        System.out.println("Today is "+days[today]+" and the future day is "+days[future]);
    }
    
}
