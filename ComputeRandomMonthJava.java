
package computerandommonth.java;

import java.util.Scanner;
public class ComputeRandomMonthJava {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number integer for month bitween 1 and 12.");
        int month = input.nextInt();
        
            if(0<=month &&month<=12){ 
    
            switch(month%12){
               
            case 1: System.out.println("حمل");
            break;
            case 2:System.out.println("ثور");
            break;
            case 3:System.out.println("جوزا");
            break;
            case 4:System.out.println("سرطان");
            break;
            case 5:System.out.println("اسد");
            break;
            case 6:System.out.println("سنبله");
            break;
            case 7:System.out.println("میزان");
            break;
            case 8:System.out.println("عقرب");
            break;
            case 9:System.out.println("قوس");
            break;
            case 10:System.out.println("جدی");
            break;
            case 11:System.out.println("دلو");
            break;
            case 12:System.out.println("حوت");
         
            }
            
                    
            }
            else{
            System.out.println("غیرممکن");
            }
        }
     
    }

