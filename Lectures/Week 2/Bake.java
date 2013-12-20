public class Bake {


    public static void baking(){
		System.out.println("Set the oven temperature.");
		System.out.println("Set the timer.");
		System.out.println("Place a batch of cookies into the oven.");
        System.out.println("Allow the cookies to bake.");

	}

	public static void prep(){
		System.out.println("Mix the dry ingredients.");
		System.out.println("Cream the butter and sugar.");
		System.out.println("Beat in the eggs.");
        System.out.println("Stir in the dry ingredients.");
	}

	public static void main(String[] args) {
	     	prep();
	       // Removed 4 lines
	       	baking();
	        // Removed 4 lines
	        baking();
	        System.out.println("Mix ingredients for frosting.");
	        System.out.println("Spread frosting and sprinkles.");
    }
}
