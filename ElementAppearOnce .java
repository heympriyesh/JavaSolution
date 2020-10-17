
//Find the Element that Appears once in a Sorted Array using HashMap
public class ElementAppearOnce {
 
    public static int singleNonDuplicateUsingMap(int[] arr) {
 
        int res = 0;
       
       //Declare a map
       Map<Integer, Integer> countMap = new HashMap<>();
 
       //Traverse an array and create a key and value pair
       for(int i = 0 ; i < arr.length; i++) {
          countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
       }
 
      /*
       Traverse a map and check the number which occur only once
      */
      for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
 
          if(entry.getValue() == 1) {
             res = entry.getKey();
             break;
          }
      }
 
      return res;
   }
 
   public static void main(String[] args) {
 
       int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};
 
       int result = singleNonDuplicateUsingMap(arr);
 
       System.out.println(result);
    }
}