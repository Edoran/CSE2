//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Income Tax Java Program
//
import java.util.Scanner ;
public class IncomeTax{
    public static void main (String[]args) { // main method required for every Java program
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter an int giving the number of thousands- ");
        if(myScanner.hasNextInt()){ 
        }    
        else{
            System.out.println("You did not enter an int");
            return;  //terminate the program
        }
        int Thousands = myScanner.nextInt();
        if(Thousands < 0) {
            System.out.println("You did not enter an int > 0");
            return;  //terminate the program
        }
        double taxRate;
        if(Thousands < 20) {
            taxRate = 5;
        }
        else if(Thousands < 40){
            taxRate = 7;
        }
        else if(Thousands < 78){
            taxRate = 12;
        }
        else {
            taxRate =14;
        }
        float taxRate2 = (float) taxRate/100;
        int income = Thousands * 1000;
        float taxPaid = income * taxRate2;
        System.out.println("The tax rate on $"+income+" is "+taxRate+"%, and the tax is $"+taxPaid);
        
    }
}