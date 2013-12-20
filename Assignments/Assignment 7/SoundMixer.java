// Wesley Chow // V00727646
// CSC 110 // July 20, 2012
// SoundMixer (Assignment 7)
/* Given an audio clip, this program can increase/decrease volume/pitch,
mix sounds, reverses sounds, or splices one sound directly after another*/

import java.io.*;
import java.util.*;

public class SoundMixer{

    public static void main(String [] args)
      throws FileNotFoundException{

        File f = new File("Array1.txt");
        Scanner input1 = new Scanner(f);
        File g = new File("Array2.txt");
        Scanner input2 = new Scanner(g);
        //fill arrays from input file
        double [] array1 = new double [20];
        fillArray(array1, input1);
        double [] array2 = new double [20];
        fillArray(array2, input2);

        //prompt for which method to use
        Scanner input = new Scanner(System.in);
        String check1 = "volume";
        String check2 = "add";
        String check3 = "reverse";
        String check4 = "splice";
        String check5 = "frequency";

        System.out.println("These methods must be typed as the same as they appear on the screen");
        System.out.println(check1 + " - " + check2 + " - " + check3 + " - " + check4 + " - " + check5);
        System.out.print("Input which method you wish to run ==> ");
        String method = input.next();

        int x = -1;
        while(x != 0){ //sentinel = 0
            if(method.equals(check1)) {
              adjustVolume(array1, 2, 6, 7);
              printarray(array1);
              x++;
            } else if(method.equals(check2)) {
              add(array1, array2);
              printarray(array1);
              x++;
            } else if(method.equals(check3)) {
              reverse(array1);
              printarray(array1);
              x++;
            } else if(method.equals(check4)) {
              System.out.println("Original Array");
              printarray(array2);
              splice(array1, 1, 25, array2, 8);
              System.out.println("New Array");
              printarray(array2);
              x++;
            } else if(method.equals(check5)) {
              array1 = adjustFrequency(array1, .5);
              printarray(array1);
              x++;
            } else {
              System.out.print("Invalid input, input which method you wish to run ==> ");
              method = input.next();
            }
        }

    }//end of main

    //converts array as a string representation, then print
    public static void printarray(double [] sample){

        String array = Arrays.toString(sample);
        System.out.println(array);

    }

    //fills arrays
    public static void fillArray(double [] arrayfill, Scanner input){ //fill arrays from input file

        for(int i = 0; i<arrayfill.length;i++){
          arrayfill[i] = input.nextDouble();
        }

    }

    //adjusts volume of array
    public static void adjustVolume(double [] samples, int startIndex, int endIndex, double factor){
        //if factor is greater than 1, the amplitude will increase
        //if factor is less than 1, the amplitude will decrease
        if(endIndex>=samples.length){
          endIndex=samples.length-1;
        }
        for(int i = startIndex; i<endIndex; i++){
          samples[i]*=factor;
        }

    }

    //mixes 2 sound clips together
    public static void add(double [] samples1, double [] samples2){ //combine 2 sound files together

        int counter = 0;
        for(int i = 0; i<samples1.length && i<samples2.length; i++){
            samples1[i]+=samples2[i];
            while(samples1[i] > 1.0 || samples1[i] < -1.0){ //use while loop for clipping
              samples1[i] *= 0.5;
            }
        }

    }//end of add

    //reverses arrays
    public static void reverse(double [] samples){

        for(int i = 0; i<samples.length/2;i++){
          double temp = samples[i]; //set up temporary variable = first element
          samples[i] = samples[samples.length-1-i]; //let first element = last element
          samples[samples.length-1-i] = temp; //let last element = temporary
        }

    }

    //cuts a portion of one array and copy it to a segment of another array
    public static void splice(double [] source, int sourceStart, int sourceStop, double [] destination, int destStart){
        if(destStart+(sourceStop-sourceStart)>=destination.length){
          sourceStop=destination.length-1;
        }

        for(int i = sourceStart;i<=sourceStop;i++){ //loop to fill spliced array with desired values from source array

            destination[destStart]=source[i];
            destStart++;
            if(destStart>destination.length-1){
                i = sourceStop+1; //if the destination array reaches its last element, this will break loop
            }
        }
    }//end of splice

    //changes frequency
    public static double[] adjustFrequency(double[] samples, double factor){
        //if factor<1, the array size will increase and if factor >1, the array size will shrink
        double [] newSamples = new double[(int)(samples.length/factor)]; //must cast array size as it will floor that value
        double samplesIndex = 0.0;
        for(int newSamplesIndex=0; newSamplesIndex<newSamples.length-1;newSamplesIndex++){
          newSamples[newSamplesIndex] = samples[(int)samplesIndex];
          samplesIndex += factor;
        }
        return newSamples;
    }

}//end of class SoundMixer