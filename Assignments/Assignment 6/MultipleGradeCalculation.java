// Wesley Chow // V00727646
// CSC 110 // June 24, 2012
// MultipleGradeCalculation (Assignment 6)
// This program calculates the weighted grade for multiple students in a course

import java.io.*; //import library with io
import java.util.*; //import package with scanner
public class MultipleGradeCalculation{

  public static void main(String [] args)
      throws FileNotFoundException{
        Scanner input = new Scanner(new File("scores.dat"));
        double minExamGrade = Intro();

        //introduce my variables for counting my letter grade distribution later
        int aPlus = 0;
        int aNormal = 0;
        int aMinus = 0;
        int bPlus = 0;
        int bNormal = 0;
        int bMinus = 0;
        int cPlus = 0;
        int cNormal = 0;
        int dNormal = 0;
        int failure = 0;

        System.out.println("\nINPUT being received from file...\n");

        while(input.hasNext()){//input starts

          String studentNumber = input.next(); //gets student number
          studentNumber = studentNumber.substring(1, 6); //CUTS OFF FIRST TWO DIGITS
          System.out.print("ID: "+studentNumber);

          //Assignments
          int assignmentMax = 20; //max marks on assignments
          int assignmentMin = 0;
          int numberOfAssignments = 8;
          double assTotal= (SubTotal1(numberOfAssignments, input, assignmentMax, assignmentMin))/(assignmentMax*8)*24; //calculate weighted grade for assignment

          //Class Participation
          int attendClass = 5;
          int notAttendClass = 0;
          double classTotal= (SubTotal2(input, attendClass, notAttendClass))/attendClass*6; //adds up participation marks, weighed for final grade

          //Lab Participation
          int attendLab = 20;
          int notAttendLab = 0;
          double labTotal= (SubTotal2(input, attendLab, notAttendLab))/attendLab*10; //adds up participation marks, already weighed for final grade

          //Midterm
          int midTermMax = 100; //max midterm mark
          int midTermMin = 0;
          int numberOfMidTerms = 1;
          double midTermTotal = (SubTotal1(numberOfMidTerms, input, midTermMax, midTermMin))/midTermMax*20; //weighted grade for midterms

          //Final exam
          int examMax = 100; //max exam mark
          int examMin = 0;
          int numberOfExams = 1;
          double examTotal = (SubTotal1(numberOfExams, input, examMax, examMin))/examMax*40; //weighted grade for final exam

          //Calculating final grade
          double finalGrade = assTotal+labTotal+classTotal+midTermTotal+examTotal; //totalling up weighted portions
          finalGrade = RoundingNumbers(1, finalGrade);//rounds finalgrade to 1 decimal place
          System.out.print("  Grade:"+finalGrade+"%\t Failed Exam? "); //format for individual student breakdown

          if((examTotal/40*100) < minExamGrade){ //dividing exam final by 40 to get rid of weight, then multiply by 100 to get it in percentage
            finalGrade = 0; //value in failure range gives a F
            System.out.print("Yes ");
          }else{
            System.out.print("No  ");
          }

          String gradeSymbol = letterGrade(finalGrade);
          System.out.println("\tLetter: "+gradeSymbol); //last part of the format for individual student breakdown
          //Counter for letter grade counting
          if(gradeSymbol.equals("A+")){
            aPlus++;
          }else if(gradeSymbol.equals("A")){
            aNormal++;
          }else if(gradeSymbol.equals("A-")){
            aMinus++;
          }else if(gradeSymbol.equals("B+")){
            bPlus++;
          }else if(gradeSymbol.equals("B")){
            bNormal++;
          }else if(gradeSymbol.equals("B-")){
            bMinus++;
          }else if(gradeSymbol.equals("C+")){
            cPlus++;
          }else if(gradeSymbol.equals("C")){
            cNormal++;
          }else if(gradeSymbol.equals("D")){
            dNormal++;
          }else{
            failure++;
          }
        }//end of while loop

        //PRINTING BREAKDOWN OF LETTER GRADE DISTRIBUTION
        System.out.println("\nGrade\tNumber Receiving Grade");
        System.out.println("A+\t\t"+aPlus+"\nA\t\t"+aNormal+"\nA-\t\t"+aMinus);
        System.out.println("B+\t\t"+bPlus+"\nB\t\t"+bNormal+"\nB-\t\t"+bMinus);
        System.out.println("C+\t\t"+cPlus+"\nC\t\t"+cNormal);
        System.out.println("D\t\t"+dNormal);
        System.out.println("F\t\t"+failure);

    }//end of main method

  public static double Intro(){ //simply the intro, asks for what the passing grade is
        Scanner stdin = new Scanner(System.in);
        System.out.println("This is a program that calculates your final CSC 110 grade.");
        System.out.println("It is broken down into assignments, lab and class attendance, midterms, and your final exam.");

        System.out.println("Before we begin, what percent do you have to get on the final exam to pass?"); //prompt for minimum final exam grade
        int passMin = 100;
        int failMin = 0;
        double minExamGrade = MarkInputer(stdin, passMin, failMin, 0); //call method to get value, can ask for reprompt if wrong input
        return minExamGrade;
  }

  public static double RoundingNumbers(double decimalPlace, double value){//rounds a number to however many decimal places you specify
    double f = Math.pow(10,decimalPlace);
    value = value * f;
    value = Math.round(value);
    value = value/f;
    return value;
  }

  public static String letterGrade(double prelimGrade){ //method for printing final letter grade
    String letterA = "A";
    String letterB = "B";
    String letterC = "C";
    String letterD = "D";
    String letterF = "F";
    String plus = "+";
    String Minus = "-";
    String grade = "";
    if(prelimGrade<=100.0 && prelimGrade>=96.5){ //use if statements to get final letter grade
      grade = letterA+plus;
    }else if(prelimGrade<96.5 && prelimGrade>=92.5){
      grade = letterA;
    }else if(prelimGrade<92.5 && prelimGrade>=87.5){
      grade = letterA+Minus;
    }else if(prelimGrade<87.5 && prelimGrade>=82.5){
      grade = letterB+plus;
    }else if(prelimGrade<82.5 && prelimGrade>=77.5){
      grade = letterB;
    }else if(prelimGrade<77.5 && prelimGrade>=71.5){
      grade = letterB+Minus;
    }else if(prelimGrade<71.5 && prelimGrade>=65.5){
      grade = letterC+plus;
    }else if(prelimGrade<65.5 && prelimGrade>=59.5){
      grade = letterC;
    }else if(prelimGrade<59.5 && prelimGrade>=49.5){
      grade = letterD;
    }else{
      grade = letterF;
    }
    return grade;
  }//end of letter grade


  public static double SubTotal1(int number, Scanner stdin, int maxMark, int minMark){ //adds up marks gotten from assignments, midterms, or exams
      double subTotal=0;
      for(int i=1;i<=number;i++){
        //System.out.print(i+"=> ");
        int x = i; //this is to be sent to the method below for re-prompt and have the ' i+"=>" ' re-printed if needed
        double mark = MarkInputer(stdin, maxMark, minMark, x);
        subTotal += mark;
      }
      return subTotal; //return to main method
  }



  public static double SubTotal2(Scanner stdin, int maxMark, int minMark){ //asks for participation attempts in labs and class separately
      double attended = stdin.nextDouble();
      while(attended<minMark || attended>maxMark){
         System.out.println("Invalid input. Please enter a number between "+minMark+" and "+maxMark+".");
         System.out.print("=> "); //user's input will go after this.
         attended = stdin.nextDouble();//expecting another input
    }
      return attended; //return to main method
  }


  public static double MarkInputer(Scanner stdin, int maxMark, int minMark, int x){ //while loop for assignment/midterm/exam mark entry that re-prompts user if wrong input
    double mark = stdin.nextDouble();
    while(mark<minMark || mark>maxMark){
      System.out.println("Invalid input. Please enter a number between "+minMark+" and "+maxMark+".");
      System.out.print(x+"=> "); //user's input will go after this.
      mark = stdin.nextDouble();
    }
    return mark; //return to method SubTotal1
  }

}//end of class file