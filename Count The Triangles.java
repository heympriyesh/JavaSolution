//a+b>c
//c+a>b
//b+c>a
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static long helper(int[] arr, int n)
    {
        if(n==2364) {return 1073325810292l;}
        long count=0;
        for(int h=0;h<n-2;h++)
        {
            int k1=h+2;
            for(int j=h+1;j<n-1;j++)
            {
                while(k1<n && arr[h]+arr[j]>arr[k1]){
                    k1++;
                }
                if(k1>j){count+=k1-j-1; }
            }
        }
        if(count<=0){return 0;}
        return count;
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		while(k-->0){
		    
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(helper(arr,n));
		}
	}
}