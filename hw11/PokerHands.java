//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//PokerHands  Java Program
//
import java.util.Scanner;
public class PokerHands {
    public static void main(String[] arg) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
        String input = scan.next();
        while (input.equals("Y")||input.equals("y")){
            int x =0;
            String [][] hand= new String [5][2];
            while(x<5)
             System.out.print("Enter the suit: 'c', 'd', 'h', or 's' ");
             String suit = scan.next();
             String hand[x][0]=suit;
             if(suit.equals("c")||suit.equals("d")||suit.equals("h")||suit.equals("s")){
                 System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                 String number = scan.next();
                 String hand[x][1]= number;
                 x++
             }
             else{
                 System.out.print("You did not enter a valid response");
             }
            
             System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
             input = scan.next();
        }
        
    }
    public static void showOneHand(int hand[]) {
        String suit[] = {
            "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        String out = "";
        for (int s = 0; s < 4; s++) {
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < 5; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out);
    }
}
