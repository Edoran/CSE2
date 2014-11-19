//////////////////////////////////////////////////////////////////////////////
//Eric Doran
//Arrays Java Program
//
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static double[] addArrays(double[] x, double[] y){
      double[] ArraySum; //set sum
      int a = 0; //set counter
      if(x.length>y.length){ //figure out which is longer to prevent errors // proccess for first array being longer
        ArraySum = new double[x.length]; 
        for(a=0; a<y.length; a++){
            ArraySum[a]=x[a]+y[a];
        }
        for(a=a; a<x.length; a++){
            ArraySum[a]=x[a];
        }
      }
      else{ //figure out which is longer to prevent errors // proccess for second array being longer or the same size
        ArraySum = new double[y.length];
        for(a=0; a<x.length; a++){
            ArraySum[a]=x[a]+y[a];
        }
        for(a=a; a<y.length; a++){
            ArraySum[a]=y[a];
        }
      }
      return ArraySum;
  }
  
  public static boolean equals(double[] x, double[] y){
      boolean equals = true;
      if(x.length!=y.length){
          return false;
      }
      else{
        for(int b=0; b<x.length; b++){
              if(x[b]!=y[b]){
                   return false;
              }
        }
        return equals;
      }
  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
}

