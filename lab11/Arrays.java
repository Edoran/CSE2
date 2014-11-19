//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Arrays Java Program
//
import java.util.Scanner ;
public class Arrays{
    public static void main (String[]args) {
        
        int[] input;
        int[] output;
        int sum=0;
        input = new int[10];
        output = new int[input.length];
        System.out.println("enter 10 ints ");
        for(int x=0; x<input.length; x++ ){
            Scanner scan = new Scanner(System.in);
            input[x]= scan.nextInt();
            sum+=input[x];
            output[9-x]= input[x];
        }
       
        int max = input[0];
        for(int x=1; x<input.length; x++ ){
            if (input[x]>max){
                max=input[x];
               
            }
        }
    
        int min = input[0];
        for(int x=1; x<input.length; x++ ){
            if (input[x]<min){
                min=input[x];
                
            }
        }
        System.out.println("The lowest entry is "+min);
        System.out.println("The highest entry is "+max);
        System.out.println("The sum is "+sum);
        for(int x=0; x<input.length; x++ ){
            System.out.println(input[x]+"   "+output[x]);
        }
    }   
}
