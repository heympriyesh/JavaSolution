public class MyClass {
    public static void main(String args[]) {
      String str[]={"cat","catat","catble"};
      String check=str[0];
      for(int i=1;i<str.length;i++)
      {
          String compare=str[i];
          int j=0;
          while(j<check.length() && j<compare.length()&& check.charAt(j)==compare.charAt(j))
          {
              j++;
          }
          check=compare.substring(0,j);
          
      }

      System.out.println(check);
    }
}