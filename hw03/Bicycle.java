//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Arithmetic Java Program
//
import java.util.Scanner ;
public class Bicycle{
    public static void main (String[]args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        //input data
        System.out.print("Enter the number of seconds: ");
        int secsTrip1 = myScanner.nextInt();
        System.out.print("Enter the number of counts: ");
        int countsTrip1 = myScanner.nextInt();
        double wheelDiameter=27.0, // to help find distance of each rotation
        PI=3.14159, // to help find distance of each rotation
        feetPerMile=5280, // conversion factor
        inchesPerFoot=12, // conversion factor
        secondsPerMinute=60, // conversion factor
        minutesPerHour=60; // conversion factor
        double distanceTrip1; // the distances traveled
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above gives distance in inches
        //for each count, a rotation of the wheel travels the diameter given in inches times PI
        distanceTrip1/=inchesPerFoot*feetPerMile; // converts to miles
        //print out output data
        System.out.println("The distance was "+distanceTrip1+" miles and took "+(secsTrip1/secondsPerMinute)+" minutes.");
        System.out.println("The average mph was "+distanceTrip1/((secsTrip1/secondsPerMinute)/minutesPerHour));
    }
}