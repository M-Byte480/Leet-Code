package Session1;

import java.util.HashSet;

public class RemoveSingleNumber {
  public static int singleNumber(int[] nums) {
    int tracker = 0;

    for (int num : nums) {
      tracker = tracker ^ num; // XOR
    }

//    HashSet<Integer> seen = new HashSet<>(); // Track using add and subtrack
//    for (int num : nums) {
//      if(seen.contains(num)){
//        tracker -= num;
//      }else{
//        seen.add(num);
//        tracker += num;
//      }
//    }

    return tracker;
  }

  public static void main(String[] args) {
    System.out.println(singleNumber(new int[]{4,1,2,1,2}));
  }
}
