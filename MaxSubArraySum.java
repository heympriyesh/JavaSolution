//Kadens Algorithm......!!
//Find the maximum sum of a subarray..
import java.util.*;
public class MaxSubArraySum
{
	public static void main(String[] args) {
	    int arr[]={1,2,3,3,4,5,6};
	    int sum=arr[0];
	    int maxsum=arr[0];
	    
	    for(int i=1;i<arr.length;i++){
	        if(sum<0){
	            sum=arr[i];
	        }else{
	            sum=sum+arr[i];
	        }
	        maxsum=Math.max(sum,maxsum);
	    }
	    
	    
	    System.out.println("THe Element is  "+maxsum);
	}
}
