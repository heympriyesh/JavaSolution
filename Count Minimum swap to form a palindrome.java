import java.util.*;
public class Main{
    public static int countSwap(String str)
    {
        int n=str.length();
        char s[]=str.toCharArray();
        int count=0;
        for(int i=0;i<n/2;i++)
        {
            int left=i;
            int right=n-left-1;
            while(left<right)
            {
                if(s[left]==s[right])
                    break;
                else
                    right--;
            }
             if(left==right)
            return -1;
        else
            {
                for(int j=right;j<n-left-1;j++)
                {
                    char t=s[j];
                    s[j]=s[j+1];
                    s[j+1]=t;
                    count++;
                }
            }
        }
       
        return count;
    }
    public static void main(String[] args)
    {
    String str="adbcdbad";
    int ans1=countSwap(str);
    StringBuilder sb=new StringBuilder(str);
    sb.reverse();
    str=sb.toString();
    int ans2=countSwap(str);
    if(ans1>ans2)
        System.out.println(ans1);
    else
        System.out.println(ans2);
    }
}