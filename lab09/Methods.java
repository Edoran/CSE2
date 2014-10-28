//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Methods Java Program
//
import java.util.Scanner;
public class Methods {
    public static int getInt(Scanner scan){
        scan = new Scanner ( System.in );
        System.out.print("Enter an int- ");
        while(!scan.hasNextInt()){
            scan.next(); //get rid of junk entered by user
            System.out.print("You did not enter an int try again- ");
        }
        return scan.nextInt();
    }
    public static int larger(int x, int y){
        if(x>y){
            return x;
        }
        else {
            return y;
        }
        
    }
    public static boolean ascending(int x, int y, int z){
        String ascending = "" + larger(x, larger(y, z)) + "";
        if(larger(x, larger(y, z))==z){
        }
        else {
            return false;
        }
        if (larger(y, x)==y){
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three ints");
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
        System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
        System.out.println("The larger of " + a + ", " + b + ", and " + c +
            " is " + larger(a, larger(b, c)));
        System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b +
            ", and " + c + " are in ascending order");
    }
}