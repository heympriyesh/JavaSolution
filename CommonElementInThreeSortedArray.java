import java.util.*;

public class CommonElementInThreeSortedArray{
   public static void findCommon(int ar1[], int ar2[], int ar3[]) 
    { 
        // Initialize starting indexes for ar1[], ar2[] and ar3[] 
        int i = 0, j = 0, k = 0; 
  
        // Iterate through three arrays while all arrays have elements 
        while (i < ar1.length && j < ar2.length && k < ar3.length) 
        { 
             // If x = y and y = z, print any of them and move ahead 
             // in all arrays 
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
    
    public static void main(String args[] ) throws Exception {
        
        int ar1[] = {1,2,5,7,8,11,19,21,22,28}; 
        int ar2[] = {2,3,6,7,15,19,21,28,29,30}; 
        int ar3[] = {2,7,8,15,19,21,22,23,28,30}; 
  
        System.out.print("Common elements are "); 
        findCommon(ar1, ar2, ar3); 
      // System.out.println(Arrays.toString(arr));
    }
}
