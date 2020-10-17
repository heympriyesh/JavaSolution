import java.util.*;
//Find maximun difference in an array;
public class MaxDifferenceinanarray
{
	public static void main(String[] args) {
	    int arr[]={2,3,15,17,2,16};
	    int maxElement=arr[1]-arr[0];
	    int minElement=arr[0];
	    for(int i=0;i<arr.length;i++){
	        if((arr[i]-minElement)>maxElement){
	            maxElement=arr[i]-minElement;
	        }
	        if(arr[i]<minElement)
	            minElement=arr[i];
	    }
	  
	    System.out.println(maxElement);
	}
}
