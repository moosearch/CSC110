public class Quiz{

	public static void main(String[] args) {
  int currentYear = 2006;
  int lastyear = currentYear - 1;
  int thatYear = 1943;
  int tempYear;
  System.out.println("I think there is a world market for");
  System.out.print(" maybe ");
  System.out.println("five computers.");
  System.out.println("   By Thomas Watson");
  System.out.print("   In the year, thatYear");
  System.out.println("   Or was it" + thatYear);
  tempYear = currentYear - thatYear;
  System.out.print("  In any case it was tempYear or ");
  System.out.println(tempYear	+ "ago");
  tempYear = lastyear - thatYear;
  System.out.print("  Last year that was only " + tempYear  + "ago");
}

}