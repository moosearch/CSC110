// Wesley Chow // V00727646
// CSC 110 // June 24, 2012
// GradeCalculation (Assignment 5)
/* This program calculates the weighted grade for a student in a course*/

import java.util.*;
public class GradeCalculation{

  public static void main(String [] args){
    Scanner stdin = new Scanner(System.in);
    System.out.println("This is a program that calculates your final CSC 110 grade.");
    System.out.println("It is broken down into assignments, lab and class attendance, midterms, and your final exam");
    System.out.println("SECTION 1: ASSIGNMENTS (8 of them for 10 marks each)");
    int assignmentMax = 10;
    int assignmentMin = 0;
    int assignmentTotal = 0;
    int numberofAssignments = 8;
    assignmentTotal(numberofAssignments, stdin);
    /*for(int i=1;i<=8;i++){
      System.out.print("Ass "+i+": ");
      int mark = Assignment(stdin, assignmentMax, assignmentMin);
      assignmentTotal += mark;
    }*/
    System.out.println(assignmentTotal);
  }

  public static int Assignment(Scanner stdin, int maxMark, int minMark){
    int mark = stdin.nextInt();
    while(mark<minMark || mark>maxMark){
      System.out.println("Invalid input. Please enter a number between "+minMark+" and "+maxMark+".");
      mark = stdin.nextInt();
    }
    return mark;
  }

  public static int assignmentTotal(int numberOfTimes, Scanner stdin){
      for(int i=1;i<=numberOfTimes;i++){
        System.out.print("Ass "+i+": ");
        int mark = Assignment(stdin, assignmentMax, assignmentMin);
        assignmentTotal += mark;
      }
      return assignmentTotal;
  }

}