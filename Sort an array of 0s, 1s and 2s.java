// Java program to sort an array of 0, 1 and 2 
import java.io.*; 
import java.util.*;
public class countzot { 

	// Sort the input array, the array is assumed to 
	// have values in {0, 1, 2} 
	static void sort012(int a[], int arr_size) 
	{ 
	    int low=0,mid=0,high=arr_size-1,temp=0;
	    while(mid<=high){
	        switch(a[mid])
	        {
	            case 0: {
	                temp=a[low];
	                a[low]=a[mid];
	                a[mid]=temp;
	                low++;
	                mid++;
	                break;
	            }
	           case 1:
	                 mid++;
	                 break;
	           case 2:{
	               temp=a[high];
	               a[high]=a[mid];
	               a[mid]=temp;
	               high--;
	               break;
	           }
	        }
	    }
	    //System.out.println(Arrays.toString(a));
	} 

	/* Utility function to print array arr[] */
	static void printArray(int arr[], int arr_size) 
	{ 
		int i; 
		for (i = 0; i < arr_size; i++) 
			System.out.print(arr[i] + " "); 
		System.out.println(""); 
	} 

	/*Driver function to check for above functions*/
	public static void main(String[] args) 
	{ 
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
		int arr_size = arr.length; 
		sort012(arr, arr_size); 
		System.out.println("Array after seggregation "); 
		printArray(arr, arr_size); 
	} 
} 
/*This code is contributed by Devesh Agrawal*/
