import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      String hmm="This is very good string it can't be reversed";
      Stack<Character> stk=new Stack<>();
      for(int i=0;i<hmm.length();++i)
      {
          if(hmm.charAt(i)!=' ')
          {
              stk.push(hmm.charAt(i));
          }else{
              while(stk.empty()==false)
                System.out.print(stk.pop());
            System.out.print(" ");
          }
      }
      while(stk.empty()==false)
      {
          System.out.print(stk.pop());
      }

    }
}