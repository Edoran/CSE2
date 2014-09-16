//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Big Mac Cost Java Program
//
import java.util.Scanner ;
public class BigMac{
    public static void main (String[]args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
        int nBigMacs = myScanner.nextInt();
        System.out.print("Enter the cost per Big Mac as"+" a double ((in the form xx.xx): " )   ;     
        double bigMac$ = myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100; //user enters percent, but I want it as a proportion
        
        
        int dollars; //whole dollar amount of cost  for storing digits to the 
        //right of the decimal point for the cost$ 
        double price$ = (double) nBigMacs*bigMac$* (1.0+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int)price$;
        //get dimes amount, e.g., (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the remainder after the division:   583%100 -> 83, 27%5 -> 2 
        int dimes=(int)(price$*10)%10;
        int pennies=(int)(price$*100)%10;
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);


    }   //end of main method     
}    //end of class