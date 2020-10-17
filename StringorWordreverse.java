import java.util.*;
public class StringorWordreverse{
    public static void main(String[] args)
    {
        String str="I Love Programming";
        String words[]=str.split(" ");
	int i=0;	
	int j=str.length()-1;
	while(j>i)
	{
		String temp=words[i];
		words[i]=words[j];
		words[j]=temp;
		i++;
		j--;
	}
        System.out.println(Arrays.toString(words));
    }
}