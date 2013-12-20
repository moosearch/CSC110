// Wesley Chow // V00727646
// CSC 110 // August 3, 2012
// 2-D Arrays (Assignment 8)
/* Manipulates 2d arrays and outputs them into a file*/

import java.io.*;
import java.util.*;

public class ArrayMethods{

    public static void main(String [] args)
      throws FileNotFoundException{
        //intro
        System.out.print("This program outputs the arrays that were manipulated to a text file");
        System.out.println(" located in the same folder as the class file.\n\nData being processed...\n");

        File f = new File("Data1.txt");
        Scanner input1 = new Scanner(f);

        PrintStream out = new PrintStream(new File("Output.txt"));

        //dataset for first 5 methods
        double [][] dataset1 = new double [3][3];
        fillArray(dataset1,input1);

        out.println("Your first dataset");
        printArray(dataset1,out);

        //Methods for returning total sum, average, lowest value, & highest value respectively
        double totalArray = getTotal(dataset1);
        out.println("Sum of all elements in the array:" + totalArray);
        double theAverage = getAverage(dataset1);
        out.println("Average of all elements in the array:"+theAverage);
        double highest = getHighest(dataset1);
        out.println("Highest value in the array:"+highest);
        double lowest = getLowest(dataset1);
        out.println("lowest value in the array:"+lowest);
        out.println("");

        //Method for returning an array multiplied by a factor
        double [][] factorAmplify = Amplify(dataset1,2);
        out.println("Your resulting amplified array:");
        printArray(factorAmplify,out);

        //introduce 2nd dataset for matrix operations
        File g = new File("Data2.txt");
        Scanner input2 = new Scanner(g);
        double [][] dataset2 = new double [3][3];
        fillArray(dataset2,input2);
        out.println("Your second dataset");
        printArray(dataset2,out);

        //matrix addition
        double [][] add = Add(dataset1,dataset2);
        out.println("Your resulting matrix addition:");
        printArray(add,out);

        //matrix multiplication
        double [][] mult = Multiplication(dataset1,dataset2);
        out.println("Your resulting matrix multiplication:");
        printArray(mult,out);

    }//end of main

    public static void fillArray(double [][] desiredArray, Scanner input){ //fills array from file
        //Could use while loop, but this works too for filling arrays of unknown # of elements in file
        for(int n = 0; n<desiredArray.length;n++){
            for(int m = 0; m<desiredArray[n].length; m++){
                if(input.hasNextDouble()){
                    desiredArray[n][m]=input.nextDouble();
                }else{
                    desiredArray[n][m]=0.0;
                }
            }
        }

    }

    public static void printArray(double [][] arrayPrint,PrintStream out){ //prints string rep. of 2-d array

        for(int i = 0; i<arrayPrint.length;i++){
            String x = Arrays.toString(arrayPrint[i]);
            out.println(x);
        }
        out.println("");
    }

    public static double getTotal(double [][] testArray){ //adds up total sum of elements
        //think of 'n' as the row number while 'm' as the column number
        double total = 0;
        for(int n = 0; n<testArray.length;n++){
            for(int m = 0;m< testArray[0].length;m++){
                total+=testArray[n][m];
            }
        }
        return total;
    }

    public static double getAverage(double [][] testArray){ //gets average of sum of elements

        double total = 0;
        int numberOfElements = 0; //use to keep track of # of elements
        for(int n = 0; n<testArray.length;n++){
            for(int m =0; m<testArray[n].length;m++){
                total+=testArray[n][m];
                numberOfElements++;
          }
        }
        double average=total/numberOfElements; //sum of elements divided by number of elements
        return average;
    }

    public static double getHighest(double [][] testArray){ //finds highest value in array

        double current = testArray[0][0];
        for(int n = 0;n<testArray.length;n++){
            for(int m = 0;m<testArray[n].length;m++){
                if(current<testArray[n][m]){
                //if the current value is lower than the value tested, then the value tested becomes the current value
                    current=testArray[n][m];
                }
            }
        }
        return current;

    }

    public static double getLowest(double [][] testArray){ //finds lowest value in array

        double current = testArray[0][0];
        for(int n = 0;n<testArray.length;n++){
            for(int m = 0;m<testArray[n].length;m++){
                if(current>testArray[n][m]){
                //if the current value is greater than the value tested, then the value tested becomes the current value
                    current=testArray[n][m];
                }
            }
        }
        return current;

    }

    public static double [][] Add(double [][] array1,double [][] array2){ //adds two matrices and returns one back
        double [][] newArray = new double [array1.length][array1[0].length];
        for(int n=0;n<newArray.length;n++){
            for(int m=0;m<newArray[n].length;m++){
                newArray[n][m] = array1[n][m]+array2[n][m]; //adds the elements that have the same place in the arrays
            }
        }
        return newArray;
    }

    public static double [][] Amplify(double [][] array1,double factor){ //returns an array with elements increased by a factor

        double [][] newArray = new double [array1.length][array1[0].length];
        for(int n=0;n<newArray.length;n++){
            for(int m=0;m<newArray[n].length;m++){
                newArray[n][m] = array1[n][m]*factor; //simply multiply all elements by the factor
            }
        }
        return newArray;
    }


    /*This method below multiplies two square matrices (2 arrays) and returns a new array
    back. Multiplying any row vector (A) in the first array by any column vector (B) in the
    second array results in a new vector; take the normal of that vector and square it to give
    the new value. This particular value is equal to our variable "total", and would go whatever
    the index values of the row vectors and column vectors are from in the previous matrices,
    respectively in the new array. eg. If a row vector is in index 1 and a column vector is in index 2,
    then the new element in the new array would go into (1,2)*/

    public static double [][] Multiplication(double [][] array1,double [][] array2){
        double [][] newArray = new double [array1.length][array1[0].length]; //create new array of same size

        for(int n=0;n<newArray.length;n++){

            for(int m=0;m<newArray[n].length;m++){

                double total = 0; //Create variable for sum value
                for(int q=0;q<newArray.length;q++){
                    total+=array1[n][q]*array2[q][m]; //
                }
                newArray[n][m]=total; //result for specified element
            }
        }
        return newArray;

    }

}//end of class MultiArray