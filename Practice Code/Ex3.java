public class Ex3{

  public static void main(String [] args){
    int n1 = 1;
    int d1 = 6;
    int n2 = 3;
    int d2 = 4;
    int d3 = lcm(d1,d2);
  }

  public static int gcd(int a, int b){
    int temp;
    a = abs(a);
    b = abs(b);
    while(a!=b)
    {
      if (a > b) a = a-b;
      else b = b-a;
    }
    return b;
  }

  public static int lcm(int a, int b){
    a = abs(a);
    b = abs(b);
    return a*b/gcd(a,b);
  }
}