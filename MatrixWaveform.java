import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        int arr[][]={
            {1,2,3,4,5},
            {5,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20}
        };
        int rows=arr.length;
        int cols=arr[0].length;
        int j=0;                                        //|_|``|
        while(j<cols)
        {
            for(int i=0;i<rows;i++)
            {
                System.out.print(arr[i][j]+" ");
            }
            j++;
            if(j<cols)
            {
                for(int i=rows-1;i>=0;i--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            j++;
        }
        System.out.println(rows+" "+cols);
    }
    }
