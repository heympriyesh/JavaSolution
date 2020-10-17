
//Find Pairs in Array with Given Sum
import java.util.*;

public class SumOfPair
{
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5,6,7,8,9};
	    int sum=9;
	    int low=0;
	    int high=arr.length-1;
	    while(low<high){
	        
	        if((arr[low]+arr[high])>sum){
	            high--;
	        }else if((arr[low]+arr[high])<sum){
	            low++;
	        }else if((arr[low]+arr[high])==sum){
	            System.out.println("pairs("+arr[low]+" , "+arr[high]+")");
	            low++;
	            high--;
	        }
	        
	    }
	    
		
	}
}
