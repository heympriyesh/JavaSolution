
import java.util.*;
import java.lang.*;
import java.io.*;

public class FirstNPrime {
    public static boolean isPrime(int num)
    {
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
                return false;
            
        }
        return true;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int number =1;
		while(count<n)
		{
		    number++;
		    if(isPrime(number)){
		        count++;
		        System.out.println(number);
		    }
		}
		
		
	}
}