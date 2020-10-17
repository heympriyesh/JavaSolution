import java.util.*;
public class ReverseAnArray
{
	public static void main(String[] args) {
	    int arr[]={1,2,3,3,4,5,6};
	    int temp;
	    int start=0;
	    int end=arr.length-1;
	    while(start<end)
	    {
	        temp=arr[start];
	        arr[start]=arr[end];
	        arr[end]=temp;
	        start++;
	        end--;
	    }
	    
	    System.out.println("THe Element is :- "+Arrays.toString(arr));
	}
}
