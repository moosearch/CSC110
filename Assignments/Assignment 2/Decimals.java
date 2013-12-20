// Wesley Chow // V00727646
// CSC 110 // May 25, 2012
// Primes (Assignment 2)
// Lists the decimal values from 1.0 to 2.0 with 0.1 intervals.

public class Decimals{

    public static void main(String[] args){
    //Define variable
        double x = 1;
        for(double i=1; i<=2.1; i=i+0.1){

            x=i;
            //"%0$,1f" reduces it to 1 decimal place
            System.out.printf("%0$.1f",x);
            System.out.print("\n");
        }
    }
}

//Output for program:

/*
1.0
1.1
1.2
1.3
1.4
1.5
1.6
1.7
1.8
1.9
2.0
*/