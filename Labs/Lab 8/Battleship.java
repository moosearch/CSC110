import java.util.Scanner;
public class Battleship{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		char [][] ocean = new char [10][10];
		fillBoard(ocean);
		ocean[5][7] = 'b'; //place boat
		boolean win = false;
		while(win == false){
			printBoard(ocean);
			System.out.println("Enter a row");
			int r = scan.nextInt();
			System.out.println("Enter a column");
			int c = scan.nextInt();

			//if takeTurn returns true, win==true
			//and the while-loop will end
			win = takeTurn(r, c, ocean);
		}
		System.out.println("You win!");
	}
	public static boolean takeTurn(int r, int c, char [][] a){

		//check r and c to make sure they are valid
		if(r < 0 || c < 0 || r >= a.length){
			return false;
		}else if(c >= a[r].length){
			return false;
		}

		//at this point we know r and c are valid
		if( a[r][c]=='b' ){
			return true;
		}else{
			//mark off the square that was checked
			a[r][c] = 'x';
			return false;
		}
	}
	public static void printBoard(char [][] a){
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				if(a[i][j]=='b'){
					//will always hide the boat
					System.out.print('~' + " ");
				}else{
					System.out.print(a[i][j] + " ");
				}
			}
			System.out.print("\n");
		}
	}
	public static void fillBoard(char [][] a){
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = '~';
			}
		}
	}

}