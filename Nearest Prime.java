import java.util.*;
class TestClass {
    public static boolean isNextPrime(int next)
    {
        for(int i=2;i<next/2;i++)
            {
                if(next%i==0)
                    return false;
            }
        return true;
    }
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int num=sc.nextInt();
            int count=0;
            int next=num;
            int prev=num;
            while(count!=1)
            {
                next++;
                if(isNextPrime(next))
                    count++;
            }
            int countNo=0;
            while(countNo!=1)
            {
                prev--;
                if(isNextPrime(prev)){
                    countNo++;
                }         
            }
            if(num-prev>next-num)
            {
                System.out.println(next);
            }else
            {
                System.out.println(prev);
            }

        }
    }
}
