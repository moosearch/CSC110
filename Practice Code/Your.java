public class Your{

  public static void main(String[] args){

    int x = 3;
    int y = 5;
    Scope(x,y);
    Scope(x+3,10-5);

  }

  public static void Scope(int j, int k){

    for(int i=0;i<k;i++){

      j = j+k+2;
      i=i+5;

    }
    System.out.println(j);
  }

}