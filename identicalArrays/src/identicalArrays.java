// This declares the public class and the main

public class identicalArrays{
	public static void main(String[] args) {
		
		// This creates a new array that can hold 8 variables
		int [] Array1 = new int [ 8 ];
		
		// This prints out the instruction that allows the user to enter a set number of values
		java.util.Scanner input1 = new java.util.Scanner(System.in);
		System.out.print("Please enter " + Array1.length + " values: ");
		
		// This loop will only run for the length of the array and will allow the user to enter values
		for (int i = 0 ; i < Array1.length ; i ++) {
		Array1 [ i ] = input1.nextInt ();
		}
		
		// This creates a new array that can hold 8 variables
		int [] Array2 = new int [8];
		
		// This prints out the instruction that allows the user to enter a set number of values
		java.util.Scanner input2 = new java.util.Scanner(System.in);
		System.out.print("Please enter " + Array2.length + " values: ");
		
		// This loop will only run for the length of the array and will allow the user to enter values
		for (int i = 0 ; i < Array2.length ; i ++) {
		Array2 [ i ] = input2.nextInt ();
		}
		
		// This declares a boolean value that will either be true of false depending on whether the arrays are equal in content
		boolean arrays_equal = true;
		
		// This runs for the length of the array
		// The if functions are used to determine if the arrays content is equal
		for (int i = 0; i < Array1.length ; i ++) {
		if (Array1[i] == Array2[i]) {
			arrays_equal = true;
		}
		if (Array1[i] != Array2[i]) {
			arrays_equal = false;
		}
		}
		
		// This then prints out the correct method based on the boolean value
		if (arrays_equal == true) {
			System.out.println("The two arrays are equal.");
		}
		if (arrays_equal == false) {
			System.out.println("The two arrays are not equal.");
		}
	}	
}