public class Lecture8{


	public static void main(String [] args){

		for (int i = 1; i <= 5; i++) {
			    for (int j = 1; j <= 5; j++) {
			        System.out.print("*");
			    }
			    System.out.println();   // to end the line
			}




for (int i = 1; i <= 5; i++) {
			    for (int j = 1; j <= i; j++) {
			        System.out.print("*");
			    }
			    System.out.println();
			}

for (int i = 1; i <= 5; i++) {
	    for (int j = 1; j <= i; j++) {
	        System.out.print(i);
	    }
	    System.out.println();
	}

for (int line = 1; line <= 5; line++) {
    for (int j = 1; j <= (-1 * line + 5); j++) {
        System.out.print(".");
    }
    System.out.println(line);
}

for (int i = 1; i <= 20; i++) {
	    for (int j = 1; j <= 20; j++) {
	        System.out.print(i+" x "+j +" = "+i*j+" ");
	    }
	    System.out.println();
	}







	}



















}