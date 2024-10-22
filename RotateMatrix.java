import java.util.*; 
class Main { 

	static void reverseColumns(int arr[][]) 
	{ 
		for (int i = 1; i < arr[0].length; i++) 
			for (int j = 1, k = arr[0].length - 1; 
				j < k; j++, k--) { 
				int temp = arr[j][i]; 
				arr[j][i] = arr[k][i]; 
				arr[k][i] = temp; 
			} 
	} 
	static void transpose(int arr[][]) 
	{ 
		for (int i = 1; i < arr.length; i++) 
			for (int j = i+1; j < arr.length; 
				j++) {                                                          //  ROTATE SUB MATRIX SOLUTION 
				int temp = arr[j][i]; 
				arr[j][i] = arr[i][j]; 
				arr[i][j] = temp; 
			} 
			for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[0].length; 
				j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(""); 
		} 
		System.out.println("**********");
	} 
	static void printMatrix(int arr[][]) 
	{ 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[0].length; 
				j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(""); 
		} 
	} 
	static void rotate90(int arr[][]) 
	{ 
		transpose(arr); 
      
		reverseColumns(arr); 
	} 
/* Driver program to test above function */
	public static void main(String[] args) 
	{ 
		int arr[][] = { { 1, 2, 3, 4 }, 
			{ 5, 6, 7, 8 }, 
			{ 9, 10, 11, 12 }, 
			{ 13, 14, 15, 16 } }; 

		rotate90(arr); 
		printMatrix(arr); 
	} 
} 

// This code is contributed by Arnav Kr. Mandal. 
