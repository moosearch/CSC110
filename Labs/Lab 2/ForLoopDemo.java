/* 
*/
public class ForLoopDemo
{
//static class variable represents constant in java
public static final double PI = 3.14159;
public static void main (String [] args)
{
// r1 and r2 represent the radius of two circles
double area;
double circumference;
double ratio;		
//calculate ratios for r values 1 to 10
for(int r = 1; r <= 10; r++){
circumference = 2 * PI * r;
area = PI * (r * r);  // brackets unnecessary
ratio = circumference/area;
System.out.print("r is " + r );
System.out.println(" Ratio is " + ratio);
}
		
}
}

