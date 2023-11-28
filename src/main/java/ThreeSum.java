import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
  public static List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums); // sort
    List<List<Integer>> sets = new ArrayList<>();

    // Base case
    if(nums.length < 3)
      return sets;

    if(nums[0] > 0) // After sort, is the first element 0
      return sets;

    HashMap<Integer, Integer> lookUpTable = new HashMap<>();

    for (int i = 0; i < nums.length; i++) { // Add the value and the index
      lookUpTable.put(nums[i], i);
    }

    for (int i = 0; i < nums.length - 2; i++) {
      if(nums[i] > 0)
        break;      // We only have positive values left

      for (int j = i + 1; j < nums.length - 1; j++) {
        int first = nums[i];
        int second = nums[j];

        int required = -1 * (first + second);

        if (lookUpTable.containsKey(required) && lookUpTable.get(required) > j){
          sets.add(Arrays.asList(nums[i], nums[j], required));
        }

        j = lookUpTable.get(nums[j]);
      }
      i = lookUpTable.get(nums[i]);

    }

    return sets;
  }

  public static void main(String[] args) {
    System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
  }
}
