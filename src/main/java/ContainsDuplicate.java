import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ContainsDuplicate {
  public static boolean containDublicate(int[] nums) {
    int length = nums.length;
    Integer[] ints = new Integer[length];
    Arrays.setAll(ints, i -> nums[i]);
    HashSet<Integer> hs = new HashSet<>(List.of(ints));
    return hs.size() != length;
  }

  // Early return
  public static boolean containDublicate2(int[] nums) {
    HashSet<Integer> hs = new HashSet<>();
    for (int n : nums) {
      if(hs.contains(n)){
        return true;
      }else{
        hs.add(n);
      }
    }
    return false;
  }
  public static void main(String[] args) {
    System.out.println(containDublicate(new int[]{1 , 2 }));
  }
}
