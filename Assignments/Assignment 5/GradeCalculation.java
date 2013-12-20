// Wesley Chow // V00727646
// CSC 110 // June 24, 2012
// GradeCalculation (Assignment 5)
// This program calculates the weighted grade for a student in a course

import java.util.*; //import scanner library
public class GradeCalculation{

  public static void main(String [] args){
    Scanner stdin = new Scanner(System.in);
    System.out.println("This is a program that calculates your final CSC 110 grade.");
    System.out.println("It is broken down into assignments, lab and class attendance, midterms, and your final exam.");

    //prompt for minimum final exam grade
    System.out.println("Before we begin, what percent do you have to get on the final exam to pass?");
    int passMin = 100;
    int failMin = 0;
    double minExamGrade = MarkInputer(stdin, passMin, failMin, 0); //call method to get value, can ask for reprompt if wrong input

    //Assignments
    System.out.println("SECTION 1: ASSIGNMENTS (8 of them for 10 marks each)");
    int assignmentMax = 10; //max marks on assignments
    int assignmentMin = 0;
    int numberOfAssignments = 8;
    double assTotal= (SubTotal1(numberOfAssignments, stdin, assignmentMax, assignmentMin))/(assignmentMax*8)*24; //calculate weighted grade for assignment

    //Lab Participation
    System.out.println("SECTION 2: LAB ATTENDANCE (10 labs)");
    System.out.println("Please type 1 if you attended, 0 if you didn't attend the respective week's labs.");
    int attendLab = 1; //if attend lab, type 1
    int notAttendLab = 0; //if attend lab, type 0
    int numberOfLabs = 10;
    double labTotal= (SubTotal2(numberOfLabs, stdin, attendLab, notAttendLab)); //adds up participation marks, already weighed for final grade

    //Class Participation
    System.out.println("SECTION 3: CLASS PARTICIPATION (6 occurences)");
    System.out.println("Please type 1 if you attended, 0 if you didn't attend the respective day's class.");
    int attendClass = 1; //if attend class, type 1
    int notAttendClass = 0; //if attend class, type 1
    int numberOfClass = 6;
    double classTotal= (SubTotal2(numberOfClass, stdin, attendClass, notAttendClass)); //adds up participation marks, already weighed for final grade

    //Midterm
    System.out.println("SECTION 4: Midterms (Only 1 midterm)");
    int midTermMax = 100; //max midterm mark
    int midTermMin = 0;
    int numberOfMidTerms = 1;
    double midTermTotal = (SubTotal1(numberOfMidTerms, stdin, midTermMax, midTermMin))/midTermMax*20; //weighted grade for midterms

    //Final exam
    System.out.println("Section 5: Final Exam");
    int examMax = 100; //max exam mark
    int examMin = 0;
    int numberOfExams = 1;
    double examTotal = (SubTotal1(numberOfExams, stdin, examMax, examMin))/examMax*40; //weighted grade for final exam

    //Calculating final grade
    double finalGrade = assTotal+labTotal+classTotal+midTermTotal+examTotal; //totalling up weighted portions
    System.out.println("Your final percentage: "+finalGrade+"%.");
    if((examTotal/40*100) < minExamGrade){ //dividing exam final by 40 to get rid of weight, then multiply by 100 to get it in percentage
      finalGrade = 0; //value in failure range gives a F
      System.out.println("However, since you failed the final exam...");
    }
    System.out.println("Your final letter grade is a(n) "+letterGrade(finalGrade)+".");

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
    if(prelimGrade<=100 && prelimGrade>=96.5){ //use if statements to get final letter grade
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
  }


  public static double SubTotal1(int number, Scanner stdin, int maxMark, int minMark){ //ta
      double subTotal=0;
      for(int i=1;i<=number;i++){
        System.out.print(i+"=> ");
        int x = i; //this is to be sent to the method below for re-prompt and have the ' i+"=>" ' re-printed if needed
        double mark = MarkInputer(stdin, maxMark, minMark, x);
        subTotal += mark;
      }
      return subTotal; //return to main method
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


  public static double Participation(Scanner stdin, int maxMark, int minMark, int x){ //while loop for participation marks that re-prompts user if wrong input
    double mark = stdin.nextDouble();
    while(mark!=minMark && mark!=maxMark){
      System.out.println("Invalid input. Please either enter "+minMark+" or "+maxMark+".");
      System.out.print(x+"=> "); //user's input will go after this.
      mark = stdin.nextDouble();
    }
    return mark; //return to SubTotal1
  }


  public static double SubTotal2(int number, Scanner stdin, int maxMark, int minMark){ //forloop that prompts user multiple times for participation
      double subTotal=0;
      for(int i=1;i<=number;i++){
        System.out.print(i+"=> "); //formatting
        int x = i; //this is to be sent to the method below for re-prompt and have the ' i+"=>" ' re-printed if needed
        double mark = Participation(stdin, maxMark, minMark, x);
        subTotal += mark;
      }
      return subTotal; //return to main method
  }



}