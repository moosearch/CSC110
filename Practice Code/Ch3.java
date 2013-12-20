import java.util.Scanner;
public class Ch3{

  public static void WhileLoop(){
    Scanner stdin = new Scanner(System.in);
    int x = 5%2;
        System.out.println(x);
    System.out.print("Enter your number: ");
    int number = stdin.nextInt();
    System.out.print("Enter your divisor: ");
    int divisor =stdin.nextInt();
    while((number%divisor)!=0 && number>divisor){
      divisor++;
      System.out.println(divisor);
    }
    if(divisor>=number){
      System.out.println("You have failed");
    }
    System.out.println("\nSwag " +divisor);


  }

  public static void main(String [] args){
    DoWhile();


  }

  public static void DoWhile(){
    Scanner stdin = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int number = stdin.nextInt();
    System.out.print("Enter your divisor: ");
    int divisor =stdin.nextInt();
    while((number%divisor)!=0 && number>divisor){
      divisor++;
      System.out.println(divisor);
    }
    if(divisor>=number){
      System.out.println("You have failed");
    }
    System.out.println("\nSwag " +divisor);
  }
}