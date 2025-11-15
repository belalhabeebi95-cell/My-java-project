
package areaofhexagon.java;

import java.util.Scanner;
public class AreaOfHexagonJava {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the side");
        double s = input.nextDouble();
        double area = (3*Math.sqrt(3)*s*s)/2;
        System.out.println("The area of the hexagon is "+area);
        
        
    }
    
}
