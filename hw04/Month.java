//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Income Tax Java Program
//
import java.util.Scanner ;
public class Month{
    public static void main (String[]args) { // main method required for every Java program
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter an int giving the number of the month (1-12) ");
        if(myScanner.hasNextInt()){ 
        }    
        else{
            System.out.println("You did not enter an int");
            return;  //terminate the program
        }
        int valMonth = myScanner.nextInt();
        if(valMonth < 1) {
            System.out.println("You did not enter an int > 1");
            return;  //terminate the program
        }
        if(valMonth > 12) {
            System.out.println("You did not enter an int < 12");
            return;  //terminate the program
        }
        if(valMonth == 1 || valMonth == 3 || valMonth == 5 || valMonth == 7 || valMonth == 8 || valMonth == 10 || valMonth == 12) {
            System.out.println("The month has 31 days");    
        }
        if(valMonth == 4 || valMonth == 6 || valMonth == 9 || valMonth == 11) {
            System.out.println("The month has 30 days"); 
        }
        if(valMonth == 2) {
            System.out.print("Enter an int giving the year ");
            if(myScanner.hasNextInt()){ 
            }    
            else{
                System.out.println("You did not enter an int");
            return;  //terminate the program
            }
            int year = myScanner.nextInt();
            if(year %4 == 0) {
                System.out.println("The month has 29 days");  
            }
            else {
                System.out.println("The month has 28 days");
            }
                
        }
        
    }
}