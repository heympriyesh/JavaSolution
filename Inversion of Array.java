/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int count=0;
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=1;j<n;j++)
                {
                    if(arr[i]>arr[j]&& i<j){
                        //System.out.println(arr[i]+" "+arr[j]);
                        count++;
                    }
                }
            } 
            System.out.println(count);
        }
	}
}