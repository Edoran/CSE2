//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Root Java Program
//
import java.util.Scanner ;
public class MoreLoops{
    public static void main (String[]args) {
        Scanner scan = new Scanner ( System.in );
        int n = 0;
        System.out.print("Enter an int- ");
        do{
            scan.next(); //get rid of junk entered by user
            System.out.print("You did not enter an int try again- ");
        }
        while(!scan.hasNextInt());
        //
        //Insert comments
        n=scan.nextInt();
        
        
        int j = 0;
        while(j<n && j<40){
            int k = 0;
            while(k<j+1){
                System.out.print("*");
                k++;
            }
            System.out.println();
            j++;
        }
        //
        //comments dude
        
        int k = 4;
        System.out.println("k="+k);
        k++;
        while(k<4){
            System.out.println("k="+k);
            k++;
        }
        //
        //still need comments
        
        int count=0;
        while(true){
            switch (n){
                default: System.out.println(n + "is >5 or <1");
                  break;
                case 1:
                case 2: System.out.print("case 2");
                  continue;
                case 3:
                  break;
                case 4: System.out.println("case 4");
                case 5: System.out.println("case 5");
                  break;
            }
            count++;
            if(count>10){
                break;
            }
        }
        
        
        
        
        
    }
}
        
        
        
        
        