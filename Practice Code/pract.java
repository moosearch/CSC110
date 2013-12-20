import java.util.*;
import java.io.*;
public class pract{
  public static void main(String[] args){

  int [] example = new int[5];
  for(int i = 0; i<example.length; i++){
    example[i] = i;
  }

  System.out.println("Ex. array is "+Arrays.toString(example));

  for(int i = 0; i<example.length/2; i++){
    int temp = example[i];
    example[i] = example[example.length-i-1];
    example[example.length-i-1]=temp;
  }

  int [] ex2;
  ex2 = new int[7];

  for(int i = 0; i<ex2.length; i++){
    ex2[i] = example[example.length-1-i];
  }

  System.out.println(Arrays.toString(example));
  for(int i = 0; i<ex2.length-1; i++){
    System.out.println(ex2[i]);
  }


  }//end of main method
}//end of class file