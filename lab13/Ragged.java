//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Sorting  Java Program
//
import java.util.Random;
import java.util.Scanner;
public class Ragged {
    public static void main(String[] arg) {
        int[][] array = new int[5][];
        System.out.println("The array before sorting");
        for (int j = 0; j < array.length; j++) {
            array[j]=new int[j*3+5];
            for(int k=0;k<array[j].length;k++){
                array[j][k]= (int)(Math.random() * 40);
                System.out.print(array[j][k]+" ");
            }
            System.out.println();
        }
        
        int[][] array2 = new int[5][];
        System.out.println("The array after sorting");
        for (int j = 0; j < array2.length; j++) {
            array2[j]=new int[j*3+5];
            for(int k=0;k<array2[j].length;k++){
                int min=40;
                for(int l=0;l<array[j].length;l++){
                    if (array[j][l]<min){
                    min=array[j][l];
                    }
                }
                for(int l=0;l<array[j].length;l++){
                    if (array[j][l]==min){
                    array[j][l]=40;
                    break;
                    }
                }
                array2[j][k]=min;
                System.out.print(array2[j][k]+" ");
            }
            System.out.println();
        }
        
    }
}