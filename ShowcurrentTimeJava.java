
package showcurrenttime.java;


public class ShowcurrentTimeJava {

    
    public static void main(String[] args) {
        
        long totalMilliseconds = System.currentTimeMillis();
        long totalseconds = totalMilliseconds/1000;
        long currentseconds = totalseconds%60;
        long totalMinutes = totalseconds/60;
        long currentMinutes = totalMinutes%60;
        long totalHour = totalMinutes/60;
        long currentHour = totalHour%24;
        System.out.println("The current Time is "+currentHour+":"+currentMinutes+":"+currentseconds+" GTM");
        
        
        
        
    }
    
}
