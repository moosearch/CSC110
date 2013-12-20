import java.util.*;
public class moretest{

  public static void main(String [] args){
    Scanner stdin = new Scanner(System.in);
    int x =  stdin.nextInt();
    int y = stdin.nextInt();
    YoMomma(x, y);

  }


  public static void YoMomma(int x, int y){
    Scanner stdin = new Scanner(System.in);
    int z = x+y;
    int test = stdin.nextInt();
    test = test + z;
    System.out.println(x+" "+y+" "+z+" "+test);
  }



}