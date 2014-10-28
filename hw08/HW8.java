//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Driver Java Program
//
import java.util.Scanner;
public class HW8{ 
   public static char getInput(Scanner scan, String xyz){ //first method
        String input = scan.next(); //recieve input save as string
        while(input.length()>1 || (!input.equals(String.valueOf(xyz.charAt(0))) && !input.equals(String.valueOf(xyz.charAt(1))))) {
            System.out.print("incorrect character ");
            input = scan.next(); //replace bad values
        }
        char output = input.charAt(0); //convert string to char
        return output;
    }
    public static char getInput(Scanner scan, String xyz, int attempts){ //second method
        String input = scan.next(); //recieve input save as string
        int tries = 1; //an incrementer to limit number of attempts 
        while(input.length()>1 || (!input.equals(String.valueOf(xyz.charAt(0))) && !input.equals(String.valueOf(xyz.charAt(1))) && !input.equals(String.valueOf(xyz.charAt(2))) && !input.equals(String.valueOf(xyz.charAt(3))))) {
            System.out.print("incorrect character ");
            input = scan.next(); //replace bad values
            tries++; //an incrementer to limit number of attempts 
            if (tries>=attempts){ //leave with no input if exceed number of attempts 
                input = " ";
                break;
            }
        }
        char output = input.charAt(0); //convert string to char
        return output;
    }
    public static char getInput(Scanner scan, String prompt, String xyz){ //third method
        System.out.println(prompt); // give prompt
        String input = scan.next(); //recieve input save as string
        while(input.length()>1 || (!input.equals(String.valueOf(xyz.charAt(0))) && !input.equals(String.valueOf(xyz.charAt(1))) && !input.equals(String.valueOf(xyz.charAt(2))) && !input.equals(String.valueOf(xyz.charAt(3))) && !input.equals(String.valueOf(xyz.charAt(4))) && !input.equals(String.valueOf(xyz.charAt(5))) && !input.equals(String.valueOf(xyz.charAt(6))) && !input.equals(String.valueOf(xyz.charAt(7))) && !input.equals(String.valueOf(xyz.charAt(8))) && !input.equals(String.valueOf(xyz.charAt(9))))) {
            System.out.print("incorrect character ");
            input = scan.next(); //replace bad values
        }
        char output = input.charAt(0); //convert string to char
        return output;
    }
    
    
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
	
  }  
}