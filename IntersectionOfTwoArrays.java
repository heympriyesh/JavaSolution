import java.util.*;
// Common Element in Three Sorted Array.
public class CommonInThreeSorted
{
	public static void main(String[] args) {
	    int ar1[]={1,2,3,4,5,6,7,8,9};
	    int ar2[]={4,6,8,9,10};
	    int ar3[]={2,4,7,9,10};
	    int i=0,k=0;
	    int j=0;
	    while(i<ar3.length && j<ar1.length && k<ar2.length)
	    {
	     
	    if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) 
             {   System.out.print(ar1[i]+" ");   i++; j++; k++; } 
  
             // x < y 
             else if (ar1[i] < ar2[j]) 
                 i++; 
  
             // y < z 
             else if (ar2[j] < ar3[k]) 
                 j++; 
  
             // We reach here when x > y and z < y, i.e., z is smallest 
             else
                 k++; 
	        
	    }
		
	}
}
