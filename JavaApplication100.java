/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication100;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class JavaApplication100 {

   
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for feet");
        double feet = input.nextDouble();
        double meters = 0.305*feet;
        System.out.println(meters);
    }
    
}
