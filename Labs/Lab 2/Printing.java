public class Printing {
	public static void main(String[] args) {
		String var = "line 3";
		int num = 4;

		System.out.println("line 1");
		System.out.println("line " + "2");
		System.out.println(var);		
		System.out.println(var + "\b" + num);
		System.out.println("line " + ++num);
		System.out.println("line " + (4+2));
		System.out.println("line " + 7);
	}
}

/*
Questions:
0) Your username (print clearly)
1) What is the output for this program?
2) For each printline, name the type for each part: literal or variable
a.
b.
c.
d.
e.
f.
g.

Before output is printed, it is converted to a String: 7 becomes "7" when concatenated with "line ". 
Be aware of the order in which this happens. 

3) For the second-to-last printout are the brackets around 4+2 necessary? Why? 
Take them out and see what happens.
4) How could you use a post-increment instead of a pre-increment to print out the same output?
*/
