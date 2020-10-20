/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        while(n-->0)
	        {
	            int t=sc.nextInt();
	            int arr[]=new int[t];
	            int total=0,grand=0;
	            for(int i=0;i<t-1;i++)
	             {
	                arr[i]=sc.nextInt();
	                total+=arr[i];
	             }
	             for(int i=1;i<=t;i++)
	             {
	                 grand+=i;
	             }
	             System.out.println(grand-total);
	        }
	}
}