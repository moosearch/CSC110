public class Navigation{

	public static void main(String [] args){
		move(3, 4, 1, 2);
	}

	public static void move(int x1, int y1, int x2, int y2){
		if(x2 > x1){
			System.out.println("Go East");
			x1++;
		}

		if(x2 < x1){
			System.out.println("Go West");
			x1--;
		}

		if(y2 > y1){
			System.out.println("Go North");
			y1++;
		}

		if(y2 < y1){
			System.out.println("Go South");
			y1--;
		}
	}

}