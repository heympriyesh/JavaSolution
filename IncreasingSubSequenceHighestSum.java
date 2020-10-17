import java.util.ArrayList;
import java.util.List;

public class Main
{
	// Iterative function to print increasing subsequence with the maximum sum
	public static void printMSIS(int[] arr)
	{
		int n = arr.length;

		// MSIS[i] stores the increasing subsequence having maximum sum
		// that ends with arr[i]
		List<List<Integer>> MSIS = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			MSIS.add(i, new ArrayList<>());
		}
		MSIS.get(0).add(arr[0]);

		// sum[i] stores the maximum sum of the increasing subsequence
		// that ends with arr[i]
		int[] sum = new int[n];
		sum[0] = arr[0];

		// start from second element in the array
		for (int i = 1; i < n; i++)
		{
			// do for each element in subarray arr[0..i-1]
			for (int j = 0; j < i; j++)
			{
				// find increasing subsequence with maximum sum that ends with
				// arr[j] where arr[j] is less than the current element arr[i]

				if (sum[i] < sum[j] && arr[i] > arr[j])
				{
					// update increasing subsequence
					MSIS.set(i, new ArrayList<>(MSIS.get(j)));

					// update maximum sum
					sum[i] = sum[j];
				}
			}

			// include current element in increasing subsequence
			MSIS.get(i).add(arr[i]);

			// add current element to maximum sum
			sum[i] += arr[i];
		}

		// uncomment below lines to print contents of list MSIS
		/*for (int i = 0; i < n; i++) {
			System.out.println("MSIS[" + i + "] - " + MSIS.get(i));
		}*/

		// j will contain index of MSIS
		int j = 0;
		for (int i = 1; i < n; i++) {
			if (sum[i] > sum[j]) {
				j = i;
			}
		}
		********************************For Printing Sum **************************************
        Integer cum=0;

		for(Integer ok: MSIS.get(j))
		{
		    cum=cum+ok;
		}
		System.out.println(cum);
		*********************************************************************************************
		System.out.println(MSIS.get(j));
	}

	public static void main(String[] args)
	{
		int[] arr = { 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11 };
		printMSIS(arr);
	}
}