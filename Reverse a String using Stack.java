import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    String str="This is how we do This is how we do";
    String[] arr=str.split(" ");
    Stack<String> s=new Stack<>();
    for(int i=0;i<arr.length;i++)
    {
        s.push(arr[i]);
    }
    while(!s.isEmpty())
    {
        System.out.println(s.pop());
    }
    }
}