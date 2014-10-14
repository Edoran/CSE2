//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Root Java Program
//
import java.util.Scanner ;
public class Root{
    public static void main (String[]args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter a double greater then zero ");
        double input = myScanner.nextDouble(); //set variable for number of stars
        if(input < 0) {
            System.out.println("You did not enter a double > 0");
            return;  //terminate the program
        }
        double low = 0; //set initial low
        double high = input+1; //set initial high
        double midpoint =0; //initialize midpoint
        while (high-low>0.0000001*(input+1)){
            midpoint = (low+high)/2; //set midpoint between low and high
            if (midpoint*midpoint>input){
                high = midpoint; //lower high to the midpoint
            }
            if (midpoint*midpoint<input){
                low = midpoint; //raise low to the midpoint
            }
        }
        System.out.println(midpoint);
    }
}