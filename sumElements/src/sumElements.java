
// Declares a public class and a main
public class sumElements{
	public static void main(String[] args) {
		
		// Declares how many rows and columns the table will have
		int num_columns = 4;
		int num_rows = 3;
		
		// Creates the 2 dimensional array with the given rows and columns
		int [][] num_array;
		num_array = new int[num_rows][num_columns];
		
		// Prints out instructions for the user
		System.out.println("Please enter 3 sets of 4 numbers.");
		
		// Allows for user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// This code will run for every row in the table
		for (int y=0; y < num_rows; y++) {
			System.out.println("Please enter 4 numbers and press enter after each one.");
			
			// This code will run once per row and lets the user put a new value in every column
			for (int x=0; x < num_columns; x++) {
				num_array[y][x] = input.nextInt ();
			}
		}
		
		// This code will run once for every column
		for (int x=0; x<num_columns; x++) {
			int column_total = 0;
			
			// This code will run for every row inside a column and sum the total of the values
			for (int y=0; y < num_rows; y++) {
				column_total = column_total + num_array[y][x];		
			}
			// This is then prints out the total value of the total once per column
			System.out.println("The total of column " + (x+1) + " is " + column_total + ".");
		}
	}	
}