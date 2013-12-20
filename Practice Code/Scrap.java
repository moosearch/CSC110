import java.io.*;
import java.util.Scanner;
public class Scrap{

  public static void main(String [] args) throws FileNotFoundException{
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      int exponent = 0;
      int base = (int)Math.pow(10,exponent);
      while(base < number){

          exponent++;
          base = (int)Math.pow(10,exponent);

      }
      if(base==number){
          exponent++;
      }

      int y = 0;
      int [] storage = new int[exponent];
      int i = 0;
      while(number!=0){

          y=number%10;
          number/=10;
          storage[i]=y;
          i++;

      }
      for(int j=0;j<storage.length;j++){

          System.out.print(storage[storage.length-1-j]+" ");

      }

      /*int x = 3456;

      int exponent = 3;
      int counter = 3;
      while(exponent!=1){
          int temp1 = x;
          for(int i = 0; i<exponent;i++){
              int temp2=temp1;
              temp2=temp2%((int)Math.pow(10,counter));
              temp1=temp1-temp2;
              counter--;
          }
          System.out.print(temp1+" ");
          x=x%(int)Math.pow(10,exponent);
          exponent--;
      }*/

      /*int total = 25;
      for(int i = 1; i<=(total/2);i++){

          total-=i;
          System.out.println(total +" "+ i);

      }*/

      /*Scanner input = new Scanner(new File("C:/Users/Mr. Roboto/Documents/UVic Classes/CSC 110/Lectures/Week 8/input2.txt"));

      while(input.hasNextLine()){
        String line = input.nextLine();
        System.out.println(">"+line);
      }*/

      /*Scanner input = new Scanner(new File("ScrapDoc.txt"));
      while (input.hasNextLine()) {
        String line = input.nextLine();
        Scanner lineScan = new Scanner(line);

        String ID = lineScan.next();
        String name = lineScan.next();
        double totalHours = 0;
        int counter = 0;
        while(lineScan.hasNextDouble()){
          double time = lineScan.nextDouble();
          totalHours += time;
          counter++;
        }
        System.out.println(name+" "+"("+ID+") has worked "+totalHours+" ("+totalHours/counter+" hours/day)");
      }*/


      /*System.out.println("Enter your number and it will give the factors.");
      double x = stdin.nextDouble();
      int factor = 1;
      System.out.println("Your factors");

      while(factor != x+1){
        if(x%factor == 0){
          System.out.println(factor);
        }
        factor++;
      }*/

      /*byte base = 2;
      int exponent = 9;
      int value = 1;
      for(int i = 1; i<=exponent; i++){
          value=value*2;
          System.out.println(value);
      }*/

  }
}