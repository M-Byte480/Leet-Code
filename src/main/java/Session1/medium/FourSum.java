package Session1.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {

  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Set<List<Integer>> hashSet = new HashSet<>();
    if (nums.length < 4) {
      return result;
    }
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 3 ; i++) {
      for (int j = i + 1; j < nums.length - 2; j++) {
        int k = j + 1;
        int l = nums.length - 1;
        while (k < l) {
          long sum = nums[i];
          sum += nums[j];
          sum += nums[k];
          sum += nums[l];

          if (sum == target) {
            hashSet.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
            k++;
            l--;
          } else if (sum < target) {
            k++;
          } else {
            l--;
          }
        }
      }
    }
    result.addAll(hashSet);
    return result;
  }
}
