//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Enigma0 Java Program
//

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */


import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    int n=0;
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 compiler error
 The variable n is only initialized on an inner scope but is used on an outer scope
 The initialization was moved to above the inner scope so that the value given so that
 java sees it has a value will be over written.
 The variable is also initialized every time it is used so the extra initializations were 
 removed 
 This code is rather strange as it does not even use the input in the summing it just
 sums to 25 every time as it is only adding constants 
 *   Explain the error(s) that occurred here, and then fix them
 */

