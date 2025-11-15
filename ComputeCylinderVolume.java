
package computecylindervolume;

import java.util.Scanner;
public class ComputeCylinderVolume {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ener the radius of the cylinder");
        double radius = input.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double height = input.nextDouble();
        double area = radius*radius*Math.PI;
        double volume = area*height;
        System.out.println("The area is "+area);
        System.out.println("The volume is "+volume);
        
    }
    
}
