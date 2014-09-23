//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Income Tax Java Program
//
import java.util.Scanner ;
public class CourseNumber{
    public static void main (String[]args) { // main method required for every Java program
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Enter a six digit number giving the course semester-  ");
        if(myScanner.hasNextInt()){ 
        }    
        else{
            System.out.println("You did not enter an int");
            return;  //terminate the program
        }
        int courseVal = myScanner.nextInt();
        if(courseVal <= 186510) {
            System.out.println("The number was outside the range [186510,201440]");
            return;  //terminate the program
        }
        if(courseVal >= 201440) {
            System.out.println("The number was outside the range [186510,201440]");
            return;  //terminate the program
        }
        int a=(int)(courseVal)%10; //calculate value of ones place
        int b=(int)(courseVal/10)%10; //calculate value of tens place
        int c=(int)(courseVal/100)%10; //calculate value of hundreds place
        int d=(int)(courseVal/1000)%10; //calculate value of thousands place
        int e=(int)(courseVal/10000)%10; //calculate value of ten thousands place
        int f=(int)(courseVal/100000)%10; //calculate value of hundred thousands place
        String semester;
        if(b == 1) {
            semester = "Spring"; 
        }    
        else if (b == 2){
            semester = "Summer 1";
        }
        else if (b == 3){
            semester = "Summer 2";
        }
        else if (b == 4){
            semester = "Fall";
        }
        else {   
            System.out.println(""+a+b+" is not a legitimate semester");
            return;  //terminate the program
        }
        if(a != 0) {
            System.out.println(""+a+b+" is not a legitimate semester");
            return;  //terminate the program
        }
        
        System.out.println("The course was offered in the "+semester+" semester of "+f+e+d+c);
        
        
        
    }
}