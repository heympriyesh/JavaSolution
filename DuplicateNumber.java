import java.util.*;

public class DuplicateNumber
{
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,4,4,1};
	    Set<Integer> number=new HashSet<Integer>();
	    boolean isDuplicate=false;
	    
	    
	    for(int i=0;i<arr.length;i++){
	        //1st method .add() return true when uniqu number is added or reutrn false if Duplicate number is added/.
	       // if(!number.add(arr[i])){
	       //     System.out.println("The Duplicate nubmer is"+arr[i]);
	       // }
	        if(number.contains(arr[i]))
	        {
	            isDuplicate=true;
	           System.out.println("The Duplicate nubmer is"+arr[i]);
	        }else{
	            number.add(arr[i]);
	        }
	    }
		//System.out.println(sb);
		
	}
}
