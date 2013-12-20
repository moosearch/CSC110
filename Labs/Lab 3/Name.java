public class Name{

  public static void main (String[] args){

    int count = 3;
    String name= "Joe";
    String salut = "Bonjour";
    greeting(name, salut);
    cheering(name, count);
  }

  public static void greeting(String name, String salut){

    System.out.println(salut + " "+ name + ". Welcome to the program.");
  }

  public static void cheering(String name, int count){

    System.out.println(count + " cheers for " + name+".");

    for(int i=1;i<=count;i++){

      System.out.println("Hip Hip Hooray!");

    }
  }

}