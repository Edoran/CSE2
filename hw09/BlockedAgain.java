//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Blocked Again Java Program
//


import java.util.Scanner;
public class BlockedAgain {
    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
        
    }
    public static int getInt(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an in int between 1 and 9, inclusive: ");
        int y =checkInt();
        y= checkRange(y);
        return y;
    }
    public static int checkInt(){
        Scanner scan = new Scanner(System.in);
        while(!scan.hasNextInt()){
            System.out.print("You did not enter an int try again- ");
            scan.next(); //get rid of junk entered by user
            
        }
        return scan.nextInt();
    }
    public static int checkRange(int x){
        Scanner scan = new Scanner(System.in);
    
        while(x<0 || x>10){
            System.out.print("You did not enter an int in [1,9]; try again: ");
            x= scan.nextInt(); //get rid of junk entered by user
            
        }
        return x;
    }
   
   
    
    public static void allBlocks(int y){
        for (int x=1; x<y+1; x++){
            block(x, y);
        }
    }
    public static void block(int x, int y ){
        for (int z=1; z<x+1; z++){
            line(x,y,z);
        }
    }
    public static void line(int x, int y, int z){
        int start=0;
        int start2=0;
        for(start2=y-x;start2>0; start2--){
                 System.out.print(" ");
        }
        for(start=y-2*x+1;start<y; start++){
            System.out.print(x);
        }
        System.out.print('\n');
    }
   
}
/*
        int start=y-1; //set value to increment in inner while loop
        int stop=start; //set value to increment in inner while loop
        int start2=0;
        int x=0; //set value to increment in outer while loop
        for (x=1; x<y+1; x++){
            start=y-2*x+1;
            for(stop=y-x-1;stop<y-1; stop++){
                for(start2=y-x;start2>0; start2--){
                    System.out.print(" ");
                }
                for(start=y-2*x+1;start<y; start++){
                    System.out.print(x);
                }
                System.out.print('\n');
            }
        }
        */