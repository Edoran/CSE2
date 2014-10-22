//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Number Stack Java Program
//
import java.util.Scanner ;
public class NumberStack{
    public static void main (String[]args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter an int between 1 and 9 ");
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
        if(nStars > 9) {
            System.out.println("You did not enter an int < 9");
            return;  //terminate the program
        }
        
        System.out.println("using for loops");
        int start=nStars-1; //set value to increment in inner while loop
        int stop=start; //set value to increment in inner while loop
        int start2=0;
        int x=0; //set value to increment in outer while loop
        for (x=1; x<nStars+1; x++){
            start=nStars-2*x+1;
            for(stop=nStars-x-1;stop<nStars-1; stop++){
                for(start2=nStars-x;start2>0; start2--){
                    System.out.print(" ");
                }
                for(start=nStars-2*x+1;start<nStars; start++){
                    System.out.print(x);
                }
                System.out.print('\n');
            }
        }
        
        System.out.println("using do-while loops");
        start=nStars-1; //set value to increment in inner while loop
        stop=start; //set value to increment in inner while loop
        x=0; //set value to increment in outer while loop
        do{
            x++;
            start=nStars-2*x+1;
            do{
                start2=nStars-x;
                if(start2<1){
                }
                else{
                    do{
                        System.out.print(" ");
                        start2--;
                    }while(start2>0);
                }
                do{
                    System.out.print(x);
                    start++;
                }while(start<nStars);
                start=nStars-2*x+1;
                System.out.print('\n');
                stop++;
            }while(stop<nStars);
            stop=nStars-x-1;
        }while(x<nStars);
                
        System.out.println("using while loops");       
        start=nStars-1; //set value to increment in inner while loop
        stop=start; //set value to increment in inner while loop
        x=0; //set value to increment in outer while loop
    
        while (x<nStars){
            x++;
            start=nStars-2*x+1;
            
            while(stop<nStars){
                start2=nStars-x;
                while(start2>0){
                    System.out.print(" ");
                    start2--;
                }
                while(start<nStars){
                    System.out.print(x);
                    start++;
                }
                start=nStars-2*x+1;
                System.out.print('\n');
                stop++;
            }
            stop=nStars-x-1;
        }
    }
}
