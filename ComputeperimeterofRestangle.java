
package computeperimeterofrestangle;

import java.util.Scanner;
public class ComputeperimeterofRestangle {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number for Length");
        int length =input.nextInt();
          System.out.println("enter a number for Wedth");
        int wedth =input.nextInt();
        length = length*2;
                wedth=wedth*2;
        
        int perimeterrestangle = length*wedth;
        
        System.out.println("Perimeter of Restangle  "+perimeterrestangle);
        
        
}
}