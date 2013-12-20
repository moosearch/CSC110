public class Pi1{

  public static void main(String[] args){

    double x = 1;

    for(int i=0;i<=8;i++){

      x = (x+(Math.pow(-1,i)/(2*i+1)));

    }
    System.out.println(x);
  }

}