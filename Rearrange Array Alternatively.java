

import java.util.*;
import java.lang.*;
import java.io.*;

public class Rearrange Array{
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
            int min=0,max=n-1;
            int[] arr1=new int[n];
            boolean flag=true;
           for(int i=0;i<n;i++)
            {
                if(flag)
                    arr1[i]=arr[max--];
                else
                    arr1[i]=arr[min++];
                flag=!flag;
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr1[i]+" ");
            }
            System.out.println();
        } 
	}
}