//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Big Mac Cost Java Program
//
import java.util.Scanner ;
public class BigMacAgain{
    public static void main (String[]args) { // main method required for every Java program
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter the number of Big Macs: ");
        if(myScanner.hasNextInt()){ 
        }    
        else{
            System.out.println("You did not enter an int");
            return;  //terminate the program
        }
        int nBigMacs = myScanner.nextInt();
        if(nBigMacs < 0) {
            System.out.println("You did not enter an int > 0");
            return;  //terminate the program
        }
        double bigMac$= 2.22 ;
        double taxRate= 7 ;
        taxRate/=100; //tax rate is 7%, but I want it as a proportion
        //whole dollar amount of cost  for storing digits to the 
        //right of the decimal point for the cost$ 
        double price$ = (double) nBigMacs*bigMac$* (1.0+taxRate);
        int dollars=(int)price$;
        int dimes=(int)(price$*10)%10;
        int pennies=(int)(price$*100)%10;
        System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of "+nBigMacs+"x"+bigMac$+" = $"+dollars+'.'+dimes+pennies);
        
        System.out.print("Do you want an order of fries (Y/y/N/n)? ");
        
        String fries = myScanner.next();
        if(fries.equals("Y")) {
            //get the whole amount, dropping decimal fraction
            dollars=(int)(price$+2.15); //whole dollar amount of cost for storing digits to the 
            //get dimes amount, e.g., (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
            //where the % (mod) operator returns the remainder after the division:   583%100 -> 83, 27%5 -> 2 
            dimes=(int)((price$+2.15)*10)%10; //number of dimes
            pennies=(int)((price$+2.15)*100)%10; //number of pennies
            System.out.println("The total cost of the meal is "+dollars+'.'+dimes+pennies);
        }
        else if (fries.equals("y")) {
            //get the whole amount, dropping decimal fraction
            dollars=(int)(price$+2.15); //whole dollar amount of cost for storing digits to the 
            //get dimes amount, e.g., (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
            //where the % (mod) operator returns the remainder after the division:   583%100 -> 83, 27%5 -> 2 
            dimes=(int)((price$+2.15)*10)%10; //number of dimes
            pennies=(int)((price$+2.15)*100)%10; //number of pennies
            System.out.println("The total cost of the meal is "+dollars+'.'+dimes+pennies);
        }
        else if (fries.equals("N")) {
            //get the whole amount, dropping decimal fraction
            dollars=(int)(price$); //whole dollar amount of cost for storing digits to the 
            //get dimes amount, e.g., (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
            //where the % (mod) operator returns the remainder after the division:   583%100 -> 83, 27%5 -> 2 
            dimes=(int)((price$)*10)%10; //number of dimes
            pennies=(int)((price$)*100)%10; //number of pennies
            System.out.println("The total cost of the meal is "+dollars+'.'+dimes+pennies);
        }
        else if (fries.equals("n")){
            //get the whole amount, dropping decimal fraction
            dollars=(int)(price$); //whole dollar amount of cost for storing digits to the 
            //get dimes amount, e.g., (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
            //where the % (mod) operator returns the remainder after the division:   583%100 -> 83, 27%5 -> 2 
            dimes=(int)((price$)*10)%10; //number of dimes
            pennies=(int)((price$)*100)%10; //number of pennies
            System.out.println("The total cost of the meal is "+dollars+'.'+dimes+pennies);
        }
        else{
                System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
   
        }
        
    }//end of main method 
} //end of class
