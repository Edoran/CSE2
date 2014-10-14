//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Roulette Java Program
//

public class Roulette{
    public static void main (String[]args) { // main method required for every Java program
        int counterB = 0; //counter for outer while loop
        int winnings$ = 0; //initialize the number of winnings 
        int bust = 0; //initialize the number of times profit was made 
        int timesprofit = 0; //initialize the number times all was lost
        while (counterB < 1000){
            counterB++;
            int counterA = 0; //initialize and reset inner while loop counter
            int winsthusfar = 0; //initialize and reset counter for number of wins in eaxh set of 100
            while (counterA < 100){
                   counterA++;
                    int roulette = (int) (Math.random()*38); //spin the wheel
                    switch(roulette){
                       case 0: //All numbers have the same odds so 0 was chosen as a representative single number
                            winnings$ += 36;
                            winsthusfar++;
                          break;
                    } //all other values 1 to 37 simply exit the loop 
            }
            if (winsthusfar == 0){
                bust++; //if no winning were made record it
            }
            if (winsthusfar > 2){
                timesprofit++; //if profit was made record it
            }
        }    
        System.out.println(winnings$); //total winnings, note that 100,000 was spent to get this
        System.out.println(timesprofit); //number of times profit was made
        System.out.println(bust); //number of times all was lost
    }
}