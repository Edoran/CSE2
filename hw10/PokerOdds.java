//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Poker Odds Java Program
//
import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {
        showHands();
        simulateOdds();
    }
    public static void showHands() {
        while (true) {
            int Deck[] = new int[52];
            for (int j = 0; j < Deck.length; j++) {
                Deck[j] = j;
            }
            int Hand[] = {
                -1, -1, -1, -1, -1
            };

            for (int j = 0; j < Hand.length; j++) {
                int cardnumber = (int)(Math.random() * (52 - j));

                Hand[j] = Deck[cardnumber];
                Deck[cardnumber] = Deck[51 - j];
                Deck[51 - j] = -1;
            }
            String cards[] = {
                "Clubs:", "Diamonds:", "Hearts:", "Spades:"
            };
            for (int j = 0; j < 5; j++) {
                String card = " ";
                switch (Hand[j] % 13) {
                    case 0:
                        card += "A";
                        break;
                    case 1:
                        card += "K";
                        break;
                    case 2:
                        card += "Q";
                        break;
                    case 3:
                        card += "J";
                        break;
                    case 4:
                        card += 10;
                        break;
                    case 5:
                        card += 9;
                        break;
                    case 6:
                        card += 8;
                        break;
                    case 7:
                        card += 7;
                        break;
                    case 8:
                        card += 6;
                        break;
                    case 9:
                        card += 5;
                        break;
                    case 10:
                        card += 4;
                        break;
                    case 11:
                        card += 3;
                        break;
                    case 12:
                        card += 2;
                        break;
                }
                switch (Hand[j] / 13) {
                    case 0:
                        cards[0] += card;
                        break;
                    case 1:
                        cards[1] += card;
                        break;
                    case 2:
                        cards[2] += card;
                        break;
                    case 3:
                        cards[3] += card;
                        break;
                }
            }
            for (int j = 0; j < 4; j++) {
                System.out.println(cards[j]);
            }
            String exit = "";
            System.out.println("Go again? Enter 'y' or 'Y', anything else to quit- ");
            Scanner scan = new Scanner(System.in);
            exit= scan.next();
            if(exit.equals("Y") || exit.equals("y")){
            }
            else{
                break;
            }
        }
    }
    public static void simulateOdds() {
        String pair[] = {
            "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"
        };
        int ofpairs[] = new int[pair.length];
        for (int x = 0; x < pair.length; x++) {
            ofpairs[x] = 0;
        }
        int nopair = 0;
        int cardpair = 0;
        int pairs = 0;
        for (int i = 0; i < 10000; i++) {
            int Deck[] = new int[52];
            for (int j = 0; j < Deck.length; j++) {
                Deck[j] = j;
            }
            int Hand[] = {
                -1, -1, -1, -1, -1
            };
    
            for (int j = 0; j < Hand.length; j++) {
                int cardnumber = (int)(Math.random() * (52 - j));
    
                Hand[j] = Deck[cardnumber];
                Deck[cardnumber] = Deck[51 - j];
                Deck[51 - j] = -1;
            }
            pairs = 0;
            for (int j = 0; j < Hand.length; j++) {
                for (int k = j; k < Hand.length; k++) {
                    if (k == j) {}
                    else {
                        if (Hand[k] == Hand[j]) {
                            pairs++;
                            cardpair = Hand[j];
    
                        }
                    }
                }
            }
            if (pairs == 1) {
                int q= cardpair%13;
                ofpairs[q]+=1;
            }
            if (pairs == 0) {
                nopair += 1;
            }
        }
        String[] ArraySum;
        System.out.println(Hand[0]);
    
        ArraySum = new String[pair.length];
        for (int a = 0; a < pair.length; a++) {
            ArraySum[a] = pair[a] + ofpairs[a];
        }
        for (int j = 0; j < 13; j++) {
            System.out.println(ArraySum[j]);
        }
        System.out.println(ArraySum[j]);
    
    
    }
    }