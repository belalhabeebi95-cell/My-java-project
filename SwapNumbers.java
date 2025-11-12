
package swapnumbers;

public class SwapNumbers {

    
    public static void main(String[] args) {
        
        int a =4;
        int b = 8;
       System.out.println("Before swap");
       System.out.println("a = "+a+",b = "+b);
       a = a+b;
       b =a-b;
       a =a-b;
        System.out.println("After swap");
        System.out.println("a = "+a+",b = "+b);
        
      
    }
    
}
