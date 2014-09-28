//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Income Tax Java Program
//
import java.util.Scanner ;
public class BurgerKing{
    public static void main (String[]args) { // main method required for every Java program
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter a letter to indicate a choice of\n Burger (B or b)\n Soda (S or s)\n Fries (F or f) ");
        String Order = myScanner.next();
        String Toppin, Drink, fries = "break";
        switch(Order){
            case "B":
                System.out.print("Enter A or a for 'all the fixins'\n C or c for cheese\n N or n for none of the above ");
                Toppin = myScanner.next();
                switch(Toppin){
                    case "A":
                        System.out.print("You ordered a burger with 'all the fixins'");
                        break;
                    case "a":
                        System.out.print("You ordered a burger with 'all the fixins'");
                        break;
                    case "C":
                        System.out.print("You ordered a burger with cheese");
                        break;
                    case "c":
                        System.out.print("You ordered a burger with cheese");
                        break;
                    case "N":
                        System.out.print("You ordered a burger with no toppings");
                        break;
                    case "n":
                        System.out.print("You ordered a burger with no toppings");
                        break;
                    default:
                        if(Toppin.length()>1) {
                        System.out.print("a single character expected ");
                        }
                        else {
                        System.out.print(Toppin+" is not one of 'A', 'a', 'C', 'c', 'N', or 'n' "); 
                        }
                }
                    
                break;
            case "b":
                System.out.print("Enter A or a for 'all the fixins'\n C or c for cheese\n N or n for none of the above ");
                Toppin = myScanner.next();
                switch(Toppin){
                    case "A":
                        System.out.print("You ordered a burger with 'all the fixins'");
                        break;
                    case "a":
                        System.out.print("You ordered a burger with 'all the fixins'");
                        break;
                    case "C":
                        System.out.print("You ordered a burger with cheese");
                        break;
                    case "c":
                        System.out.print("You ordered a burger with cheese");
                        break;
                    case "N":
                        System.out.print("You ordered a burger with no toppings");
                        break;
                    case "n":
                        System.out.print("You ordered a burger with no toppings");
                        break;
                    default:
                        if(Toppin.length()>1) {
                        System.out.print("a single character expected ");
                        }
                        else {
                        System.out.print(Toppin+" is not one of 'A', 'a', 'C', 'c', 'N', or 'n' "); 
                        }
                }
                break;
            case "S":
                System.out.print("Do you want Pepsi (p or P),\n Coke (c or C),\n Sprite (s or S)\n or Mountain Dew (M or m)- ");
                Drink = myScanner.next();
                switch(Drink){
                    case "P":
                        System.out.print("You ordered a Pepsi");
                        break;
                    case "p":
                        System.out.print("You ordered a Pepsi");
                        break;
                    case "C":
                        System.out.print("You ordered Coke");
                        break;
                    case "c":
                        System.out.print("You ordered Coke");
                        break;
                    case "S":
                        System.out.print("You ordered a Sprite");
                        break;
                    case "s":
                        System.out.print("You ordered a Sprite");
                        break;
                    case "M":
                        System.out.print("You ordered a Mountain Dew");
                        break;
                    case "m":
                        System.out.print("You ordered a Mountain Dew");
                        break;
                    default:
                        if(Drink.length()>1) {
                        System.out.print("a single character expected ");
                        }
                        else {
                        System.out.print(Drink+" is not one of 'P', 'p', 'C', 'c', 'S', 's', 'M' or 'm' "); 
                        }
                }
                break;
            case "s":
                System.out.print("Do you want Pepsi (p or P),\n Coke (c or C),\n Sprite (s or S)\n or Mountain Dew (M or m)- ");
                Drink = myScanner.next();
                switch(Drink){
                    case "P":
                        System.out.print("You ordered a Pepsi");
                        break;
                    case "p":
                        System.out.print("You ordered a Pepsi");
                        break;
                    case "C":
                        System.out.print("You ordered Coke");
                        break;
                    case "c":
                        System.out.print("You ordered Coke");
                        break;
                    case "S":
                        System.out.print("You ordered a Sprite");
                        break;
                    case "s":
                        System.out.print("You ordered a Sprite");
                        break;
                    case "M":
                        System.out.print("You ordered a Mountain Dew");
                        break;
                    case "m":
                        System.out.print("You ordered a Mountain Dew");
                        break;
                    default:
                        if(Drink.length()>1) {
                        System.out.print("a single character expected ");
                        }
                        else {
                        System.out.print(Drink+" is not one of 'P', 'p', 'C', 'c', 'S', 's', 'M' or 'm' "); 
                        }
                }
                break;
            case "F":
                System.out.print("Do you want a large or small order of fries (l,L,s, or S)- ");
                fries = myScanner.next();
                switch(fries){
                    case "L":
                        System.out.print("You ordered large fries");
                        break;
                    case "l":
                        System.out.print("You ordered large fries");
                        break;
                    case "S":
                        System.out.print("You ordered small fries");
                        break;
                    case "s":
                        System.out.print("You ordered small fries");
                        break;
                    default:
                        if(fries.length()>1) {
                        System.out.print("a single character expected ");
                        }
                        else {
                        System.out.print(fries+" is not one of 'L', 'l', 'S', or 's' "); 
                        }
                }
                break;
            case "f":
                System.out.print("Do you want a large or small order of fries (l,L,s, or S)- ");
                fries = myScanner.next();
                switch(fries){
                    case "L":
                        System.out.print("You ordered large fries");
                        break;
                    case "l":
                        System.out.print("You ordered large fries");
                        break;
                    case "S":
                        System.out.print("You ordered small fries");
                        break;
                    case "s":
                        System.out.print("You ordered small fries");
                        break;
                    default:
                        if(fries.length()>1) {
                        System.out.print("a single character expected ");
                        }
                        else {
                        System.out.print(fries+" is not one of 'L', 'l', 'S', or 's' "); 
                        }
                }
                break;
            default:
                if(Order.length()>1) {
                  System.out.print("a single character expected ");
                }
                else {
                System.out.print(Order+" is not one of 'B', 'b', 'S', 's', 'F', or 'f' "); 
                }
        }
        System.out.print("\n");
    }
}
