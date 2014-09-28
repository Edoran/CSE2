//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Income Tax Java Program
//
import java.util.Scanner ;
public class RandomGames{
    public static void main (String[]args) { // main method required for every Java program
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter R or r for roulette, C or c for craps, P or p for pick a card- ");
        String Game = myScanner.next();
        if(Game.equals("R") || (Game.equals("r"))) {
            int roulette = (int) (Math.random()*38);
            switch(roulette){
                case 0:
                    System.out.print("roulette: "+roulette);
                    break;
                case 1:
                    System.out.print("roulette: "+roulette);
                    break;
                case 2:
                    System.out.print("roulette: "+roulette);
                    break;
                case 3:
                    System.out.print("roulette: "+roulette);
                    break;
                case 4:
                    System.out.print("roulette: "+roulette);
                    break;
                case 5:
                    System.out.print("roulette: "+roulette);
                    break;
                case 6:
                    System.out.print("roulette: "+roulette);
                    break;
                case 7:
                    System.out.print("roulette: "+roulette);
                    break;
                case 8:
                    System.out.print("roulette: "+roulette);
                    break;
                case 9:
                    System.out.print("roulette: "+roulette);
                    break;
                case 10:
                    System.out.print("roulette: "+roulette);
                    break;
                case 11:
                    System.out.print("roulette: "+roulette);
                    break;
                case 12:
                    System.out.print("roulette: "+roulette);
                    break;
                case 13:
                    System.out.print("roulette: "+roulette);
                    break;
                case 14:
                    System.out.print("roulette: "+roulette);
                    break;
                case 15:
                    System.out.print("roulette: "+roulette);
                    break;
                case 16:
                    System.out.print("roulette: "+roulette);
                    break;
                case 17:
                    System.out.print("roulette: "+roulette);
                    break;
                case 18:
                    System.out.print("roulette: "+roulette);
                    break;
                case 19:
                    System.out.print("roulette: "+roulette);
                    break;
                case 20:
                    System.out.print("roulette: "+roulette);
                    break;
                case 21:
                    System.out.print("roulette: "+roulette);
                    break;
                case 22:
                    System.out.print("roulette: "+roulette);
                    break;
                case 23:
                    System.out.print("roulette: "+roulette);
                    break;
                case 24:
                    System.out.print("roulette: "+roulette);
                    break;
                case 25:
                    System.out.print("roulette: "+roulette);
                    break;
                case 26:
                    System.out.print("roulette: "+roulette);
                    break;
                case 27:
                    System.out.print("roulette: "+roulette);
                    break;
                case 29:
                    System.out.print("roulette: "+roulette);
                    break;
                case 30:
                    System.out.print("roulette: "+roulette);
                    break;
                case 31:
                    System.out.print("roulette: "+roulette);
                    break;
                case 32:
                    System.out.print("roulette: "+roulette);
                    break;
                case 33:
                    System.out.print("roulette: "+roulette);
                    break;
                case 34:
                    System.out.print("roulette: "+roulette);
                    break;
                case 35:
                    System.out.print("roulette: "+roulette);
                    break;
                case 36:
                    System.out.print("roulette: "+roulette);
                    break;
                case 37:
                    System.out.print("roulette: "+0+0);
                    break;
                
            }
            System.out.print("\n");
        
        }
        else if(Game.equals("C") || (Game.equals("c"))) {
            System.out.print("Not yet implemented \n");
        }
        else if(Game.equals("P") || (Game.equals("p"))) {
            System.out.print("Not yet implemented \n");
        }
        else if(Game.length()>1) {
            System.out.print("a single character expected \n");
        }
        else {
            System.out.print(Game+" is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
        }
    }
}