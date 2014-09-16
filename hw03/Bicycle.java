//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Arithmetic Java Program
//
public class Bicycle{
    public static void main (String[]args) {
         //input data
        int secsTrip1=420; //time spent on trip 1
        int secsTrip2=3220; //time spent on trip 2
        int countsTrip1=1561; // rotations for trip 1
        int countsTrip2=9037; //rotations for trip 2
        double wheelDiameter=27.0, // to help find distance of each rotation
        PI=3.14159, // to help find distance of each rotation
        feetPerMile=5280, // conversion factor
        inchesPerFoot=12, // conversion factor
        secondsPerMinute=60; // conversion factor
        double distanceTrip1, distanceTrip2, totalDistance; // the distances traveled
        System.out.println("Trip one took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts. ");
        System.out.println("Trip two took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts. ");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above gives distance in inches
        //for each count, a rotation of the wheel travels the diameter given in inches times PI
        distanceTrip1/=inchesPerFoot*feetPerMile; // converts to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        //print out output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }
}