//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Arithmetic Java Program
//
import java.util.Scanner ;
public class LoopTheLoop{
    public static void main (String[]args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter an int between 1 and 15 ");
        if(myScanner.hasNextInt()){ 
        }    
        else{
            System.out.println("You did not enter an int");
            return;  //terminate the program
        }
        int nStars = myScanner.nextInt(); //set variable for number of stars
        if(nStars < 1) {
            System.out.println("You did not enter an int > 1");
            return;  //terminate the program
        }
        if(nStars > 15) {
            System.out.println("You did not enter an int < 15");
            return;  //terminate the program
        }
        
        
     
        int start=nStars-1; //set value to increment in inner while loop
        int x=0; //set value to increment in outer while loop
        int y=1; //increment in outer while loop to modify inner loops start point each time through
        while (x<nStars){
            y++;
            while(start<nStars){
                System.out.print('*');
                start++;
            }
            System.out.print('\n');
            start=start-y;
            x++;
        }
        
    }
}