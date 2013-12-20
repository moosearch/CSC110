public class Example1{


	public static void main(String [] args){
		int Number1 = 15;
		int Number2 = 22;
		int Number3 = 34;
		int average;
		average = Average(Number1, Number2, Number3);

		System.out.println(average);

		double averagedoub = AverageDoub(22.0, 34.0, 15.0);

		System.out.println(averagedoub);

	}

	public static int Average(int x, int y, int z){

		int avg = ((x+y+z)/3);
		return avg;

	}

	public static double AverageDoub(double x, double y, double z){

		return ((x+y+z)/3);

	}




}