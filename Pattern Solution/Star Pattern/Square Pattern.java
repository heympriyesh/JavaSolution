****
*  *
*  *
****
import java.util.*;
public class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n=4;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i>=2 && j>=2 && i<=n-1 && j<=n-1)
                    System.out.print(" ");
                else
                    System.out.print("*");
                
            }
            System.out.println();
            
        }
       
    }
}
