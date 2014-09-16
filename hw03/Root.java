//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Big Mac Cost Java Program
//
import java.util.Scanner ;
public class Root{
    public static void main (String[]args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter a double and I print its cube root " )   ;     
        double x = myScanner.nextDouble(); //code for inputing value
        double guess = x/3; //initial guess of cube root
        guess = (2*guess*guess*guess+x)/(3*guess*guess); //second guess of cube root
        guess = (2*guess*guess*guess+x)/(3*guess*guess); //third guess of cube root
        guess = (2*guess*guess*guess+x)/(3*guess*guess); //fourth guess of cube root
        guess = (2*guess*guess*guess+x)/(3*guess*guess); //fifth guess of cube root  
        guess = (2*guess*guess*guess+x)/(3*guess*guess); //final guess of cube root
        System.out.print("The cube root is "+guess+":\n");
        //print cube root guess
        System.out.print(guess+"*"+guess+"*"+guess+"=\n");
        //print cube of cube root guess
        System.out.print(guess*guess*guess+" \n");
        //print cube of cube root guess
    }
}
        