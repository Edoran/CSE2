//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Big Mac Cost Java Program
//
import java.util.Scanner ;
public class FourDigits{
    public static void main (String[]args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter a double and I display the four digits to the right of the decimal point: " )   ;     
        double x = myScanner.nextDouble();  //code for inputing value
        
        int a=(int)(x*10)%10; //calculate value of tenths place
        int b=(int)(x*100)%10; //calculate value of hundreths place
        int c=(int)(x*1000)%10; //calculate value of thousanths place
        int d=(int)(x*10000)%10; //calculate value of ten thousanths place
        
        System.out.print("The four digits are "+a+b+c+d+" \n"); 
        
        
    }
}