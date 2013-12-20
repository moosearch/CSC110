public class Song {

  //prints out the chorus of the song
  //this plays at the beginning and after each verse
  public static void chorus()
  {
    System.out.println();
    System.out.println("Twinkle, twinkle, little star,");
    System.out.println("How I wonder what you are.");
    System.out.println();
  }

  //prints out verse 2 of the song
  public static void verse2()
  {
    System.out.println("When the blazing sun is gone,");
    System.out.println("When there's nothing he shines upon,");
    System.out.println("Then you show your little light,");
    System.out.println("Twinkle, twinkle, through the night.");
  }

  //prints out verse 3 of the song
  public static void verse1()
  {
    System.out.println("Up above the world so high,");
    System.out.println("Like a diamond in the sky.");

  }

  //prints out some song lyrics
  public static void main(String[] args)
  {
    chorus();
    verse1();
    chorus();
    verse2();
    chorus();
    //using methods supplied
    //compose the song Twinkle, Twinkle Little Star
  }
}