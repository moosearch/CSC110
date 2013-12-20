public class Sample{
	public static void main(String [] args){
		//An array is pointer to spaces in memory
		//It is a reference type, not a primitive data type.
		//Arrays are indexed starting at zero.
		int [] myArray = {1, 1, 1, 1, 1};
		System.out.println(myArray[0]);

		changeArray(myArray); //this passes the location of the array
		System.out.println(myArray[0]);

		//An int is a primitive data type
		//It is not a reference type like an array
		int myInt = -6;
		System.out.println(myInt);

		passByValue(myInt); //this passes a copy into the method
		System.out.println(myInt); //notice the value is unchanged

		//Now we pass a primitive type into passByValue
		//It comes from the array, but it is an int:
		passByValue(myArray[1]);
		System.out.println(myArray[1]);

	}

	public static void changeArray(int [] array){
		//this method actually overwrites the memory
		//for the first element in the array :
		array[0] = 15;
	}

	public static void passByValue(int a){
		//this method makes the parameter= 7 :
		a = 7;
		//but the parameter is just a local copy
	}

}
