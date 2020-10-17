import java.util.*;
public class RoateByClockWiseOrLeftRotation
{
    public static void roateleft(int arr[], int d, int n)
    {
        for(int i=0;i<d;i++)
            rotateLeftByOne(arr,n);
    }
    public static void rotateLeftByOne(int arr[],int n)
    {
        int i, temp=arr[0];
        for(i=0;i<n-1;i++)
            arr[i]=arr[i+1];
        arr[i]=temp;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int d=2;
        roateleft(arr,d,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
		
	}
}
