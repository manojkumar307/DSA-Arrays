package arrays_examples;

import java.util.Scanner;
import java.util.Arrays;

/**
 * The arrays_1 class contains several examples of 1D and 2D array manipulations.
 * 
 * Sections 1, 2, and 3 are commented-out practice routines covering:
 *   1. Sum and maximum of even numbers in a 1D array.
 *   2. Total sum of all elements in a 2D array.
 *   3. Row-wise sum calculation in a 2D array.
 * 
 * Section 4 (Active Code) reads a 2D array from user input, prints it in two 
 * formats, finds the minimum value in each row, and calculates the sum of those minimums.
 */
public class arrays_1 {
	public static void main(String[] args) {

		/* =====================================================================
		 * SECTION 1 (Commented Out): 1D Array - Sum and Max of Even Numbers
		 * Reads a 1D array of user-defined length, filters for even numbers 
		 * (arr[i] % 2 == 0), accumulates their sum, and tracks the largest even value.
		 * ===================================================================== */
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("enter: ");
//		int[] arr = new int[scanner.nextInt()];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scanner.nextInt();
//		}
//		
//		int sum = 0;
//		int max = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				sum += arr[i];
//				if (arr[i] > max) {
//					max = arr[i];
//				}
//			}
//		}
//		
//		System.out.println("Array: " + Arrays.toString(arr));
//		System.out.println("Sum of even numbers : " + sum);
//		System.out.println("Max of even numbers: " + max);

		/* =====================================================================
		 * SECTION 2 (Commented Out): 2D Array - Sum of All Elements
		 * Initializes a 2D matrix of size [rows][cols], populates it via Scanner, 
		 * and iterates through every cell to compute the grand total of all elements.
		 * ===================================================================== */
		// Sum of all the numbers.

//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("enter: ");
//		int rows = scanner.nextInt();
//		int cols = scanner.nextInt();
//		
//		int[][] arr = new int[rows][cols];
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = scanner.nextInt();
//			}
//		}
//		
//		int sum = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				sum += arr[i][j];
//			}
//		}
//		
//		System.out.println("Sum " + sum);

		/* =====================================================================
		 * SECTION 3 (Commented Out): 2D Array - Row-Wise Sum
		 * Populates a 2D matrix and resets the 'sum' accumulator at the start 
		 * of each outer loop iteration to calculate and print the sum of each row.
		 * ===================================================================== */
		// sum of arrays of rows

//		System.out.println("enter:");
//		Scanner scan = new Scanner(System.in);
//		int rows = scan.nextInt();
//		int cols = scan.nextInt();
//		
//		int[][] arr = new int[rows][cols];
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = scan.nextInt();
//			}
//		}
//		
//		
//		for (int i = 0; i < arr.length; i++) {
//			int sum = 0;
//			
//			for (int j = 0; j < arr[i].length; j++) {
//				sum += arr[i][j];
//			}
//			System.out.println("Sum of row " + i + " is: " + sum);
//		}

		/* =====================================================================
		 * SECTION 4 (Active Code): 2D Array - Row Minimums & Sum of Minimums
		 * ===================================================================== */

		// 1. Initialize Scanner and allocate 2D array dimensions directly from input.
		// The first nextInt() sets the row count; the second nextInt() sets the column count.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter: ");
		int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];

		// 2. Populate the 2D array row by row using nested loops.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		// 3. Display Format A: Print the 2D array as a space-separated grid.
		System.out.println("Array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // Move to the next line after printing a full row
		}

		// 4. Display Format B: Print each row as a formatted array string (e.g., [1, 2, 3]).
		for (int i = 0; i < arr.length; i++) {			
			System.out.println(Arrays.toString(arr[i]));
		}

		// 5. Find the minimum value in each row and accumulate the sum of those minimums.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			// Assume the first element of the current row is the minimum
			int min = arr[i][0];
			
			// Compare against all elements in the current row
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j]; // Update min if a smaller element is found
				}
			}
			// Print the 1-based row index (i + 1) and its minimum value
			System.out.println("Minimum of row " + (i + 1) + ": " + min);
			
			// Add the current row's minimum to the running total
			sum += min;
		}
		
		// 6. Output the final sum of all row minimums and release Scanner resources.
		System.out.println("Sum of minimum elements: " + sum);

		scanner.close();

	}
}
