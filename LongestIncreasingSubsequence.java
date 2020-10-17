import java.util.*;
public class Main{
public static void lis( int arr[], int n ) 
{ 
	int lis[]=new int[n]; 
	lis[0] = 1; 

	/* Compute optimized LIS values in bottom up manner */
	for (int i = 1; i < n; i++ ) 
	{ 
		lis[i] = 1; 
		for (int j = 0; j < i; j++ ) 
			if ( arr[i] > arr[j] && lis[i] < lis[j] + 1) 
				lis[i] = lis[j] + 1; 
	} 
	int[] hmm=lis;
	// Return maximum value in lis[] 
	Arrays.sort(hmm);
	int max=hmm[n-1];
	System.out.println("Maximum element is "+max);
	for(int i=n-1;i>=0;i--)
	{
	    if(lis[i]==max)
	    {
	        System.out.print(arr[i]+" ");
	        max--;
	    }
	}
//	return lis[n-1]; 
} 
	
/* Driver program to test above function */
public static void main(String[] args)
{ 
	int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
	int n = arr.length; 
	lis( arr, n );
	//System.out.println("Length of lis is"+ ok); 
	//return 0; 
}
}