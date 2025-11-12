
package computefor.a.number.is.even.or.odd.java;
import java.util.Scanner;

public class ComputeforANumberIsEvenOrOddJava {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for check even or odd");
        int a = input.nextInt();
        if(a%2==0){
        System.out.println("This number is even");
        }
        else{
        System.out.println("This number is odd");
        }      
    }
    
}
