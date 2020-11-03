import java.util.*;
import java.util.Map.Entry;
public class Maximum{
	public static void main(String[] args) {
		int arr[]={1, 5, 2, 1, 3, 2, 1};
		int len=arr.length;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<len;i++)
		{
			int key=arr[i];
			if(map.contains(key))
			{
				int freq=map.put(key);
				freq++;
				mpa.put(key,freq);
			}
			else
			{
				map.put(key,1);
			}

		}
		int max_count=0,res=-1;
		System.out.println("************ For Maximum Frequency ********");
		for(Entry<Integer,Integer> val:entrySet())
		{
			if(max_count<val.getValue())
			{
				res=val.getKey();
				max_count=val.getValue();
			}
		} 
		System.out.println("The maximum value count is "+res);
		
		// System.out.println("****For minimum Frequency*************");

		// int max_count=Integer.MAX_VALUE,res=-1;

  //       for(Entry<Integer, Integer> val : map.entrySet()) 
  //       { 
  //           if (max_count > val.getValue()) 
  //           { 
  //               res = val.getKey(); 
  //               max_count = val.getValue(); 
  //           } 
  //       } 
		// System.out.println("The minimum value count is "+res);
	}
}