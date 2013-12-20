// Wesley Chow // V00727646
// CSC 110 // June 2, 2012
// Assignment3 (Assignment 3)
/* Prints out numbers in a sequential order, powers of 2,
and powers of whatever base specified using method calling and forloops*/

public class Assignment3{
  public static void main(String [] args){

    printNumbers(10);
    printPowersof2(9);
    printPowersofN(-3,7);

  }
  //counting in sequential order
  public static void printNumbers(int x){
    for(int i = 1; i<=x; i++){
      System.out.print("["+i+"] "); //prints "[i] "
    }
    System.out.println(); //this is so any future printstatements would be on new line
  }
  //prints powers of 2
  public static void printPowersof2(int x){
    for(int i = 0; i<=x;i++){
      System.out.print(Math.round(Math.pow(2,i))+" ");
      //Math.round rounds value to nearest integer
      //Math.pow is a math class for entering exponents
    }
    System.out.println();
  }
  //Counts powers of whatever exponent base specified in the calling of the method
  public static void printPowersofN(int x, int y){
    for(int i = 0; i<=y;i++){
      System.out.print(Math.round(Math.pow(x,i))+" ");
    }
    System.out.println();
  }
}
