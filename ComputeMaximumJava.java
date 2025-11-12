
package computemaximum.java;

import java.util.Scanner;
public class ComputeMaximumJava {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 System.out.println("Enrer num1");
        int num1 = input.nextInt();
        System.out.println("Enrer num2");
        int num2 = input.nextInt();
        System.out.println("The maximum bitween "+num1+ " and "+num2+" is" );
        if(num1>num2){
        System.out.println(num1);
            
        }
        else if(num2>num1){
        System.out.println(num2);
                }
        else{
        System.out.println(num1=num2);
        }
        
        
        
        
    }
    
}
