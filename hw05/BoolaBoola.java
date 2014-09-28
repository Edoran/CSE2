//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//BoolaBoola Java Program
//
import java.util.Scanner ;
public class BoolaBoola{
    public static void main (String[]args) { // main method required for every Java program
        int randbool1 = (int) (Math.random()*2); //set random value to the first true or false
        int randbool2 = (int) (Math.random()*2); //set random value to the second true or false
        int randbool3 = (int) (Math.random()*2); //set random value to the third true or false
        int andor = (int) (Math.random()*4); //set random value to the four possible combinations of and/or
        boolean A = true, B = true, C = true, D = true; // A,B,C are random booleans, D will be the later combination of the three
        String x = "", y = ""; //String for the purpose of displaying the && and || symbols in the appropraite places on the print line
        switch(randbool1){ //associate random value to the first true or false
            case 0:
                A = true; 
                break;
            case 1:
                A = false;
                break;
        }
        switch(randbool2){  //associate random value to the second true or false
            case 0:
                B = true;
                break;
            case 1:
                B = false;
                break;   
        }
        switch(randbool3){  //associate random value to the third true or false
            case 0:
                C = true;
                break;
            case 1:
                C = false;
                break;
        }
        switch(andor){ //set x and y to && and/or || as appropriate for the print statement
            case 0:
                x = "&&";
                y = "||";
                break;
            case 1:
                x = "||";
                y = "||";
                break;
            case 2:
                x = "&&";
                y = "&&";
                break;
            case 3:
                x = "||";
                y = "&&";
                break;
        }
        boolean guess; //the boolean val of input string
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Does "+A+" "+x+" "+B+" "+y+" "+C+" have the value true(t/T) or false(f/F)? ");
        String yourboola = myScanner.next();
        switch(yourboola){ //associate string with appropriate bool value
                    case "T":
                        guess = true;
                        break;
                    case "t":
                        guess = true;
                        break;
                    case "F":
                        guess = false;
                        break;
                    case "f":
                        guess = false;
                        break;
                    default:
                        System.out.print("Wrong; Try again");
                        return;
        }
        switch(andor){ //combine the three earlier determined booleans in the same manner as determined earlier to find fourth boolean value for comparison
            case 0:
                D = A && B || C;
                break;
            case 1:
                D = A || B || C;
                break;
            case 2:
                D = A && B && C;
                break;
            case 3:
                D = A || B && C;
                break;
        }
        if (guess == D){ //compare combined boolean to boolean guess
            System.out.print("Correct");
        }
        else{
            System.out.print("Wrong; Try again");
        }
        
        System.out.print("\n");             
    }
}
    