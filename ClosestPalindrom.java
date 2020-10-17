import java.util.*;
public class ClosestPalindrom
{
    public static int nextLargePalindrome(int n)
    {
        int sum=0,temp=0,rev=0;
        while(true)
        {
            n++;
            temp=n;
            sum=rev=0;
            while(temp>0)
            {
                rev=temp%10;
                sum=sum*10+rev;
                temp=temp/10;
            }
            if(sum==n)
            {
                return n;
            }
        }
    }
    public static int nextSmallPalindrome(int n)
    {
        int sum=0,temp=0,rev=0;
        while(true)
        {
            n--;
            temp=n;
            sum=rev=0;
            while(temp>0)
            {
                rev=temp%10;
                sum=sum*10+rev;
                temp=temp/10;
            }
            if(sum==n)
            {
                return n;
            }
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int large=nextLargePalindrome(n);
	    int small=nextSmallPalindrome(n);
	    if(large-n>n-small)
	    {
	      System.out.println(small);  
	    }else{
	        System.out.println(large);
	    } 
		
	}
}
