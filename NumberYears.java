
package numberyears;

import java.util.Scanner;

public class NumberYears {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the number of minutes");
         long minutes = input.nextInt();
         long  years = minutes/(525600);
         long remaining = minutes%525600;
         long day = remaining/1440;
         System.out.println(minutes+" minutes is "+years+" years and "+day+" days");
        
    }
    
}
