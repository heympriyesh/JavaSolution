import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int max_so_far=Integer.MIN_VALUE,max_ending=0;
		    for(int a:arr)
		    {
		        max_ending=max_ending+a;
		        if(max_so_far<max_ending)
		            max_so_far=max_ending;
		        if(max_ending<0)
		            max_ending=0;
		    }
		    System.out.println(max_so_far);
		}
	}
}