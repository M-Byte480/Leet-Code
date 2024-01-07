package Session1.medium;

import java.util.Arrays;

public class Closest3Sum {
  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int closestSum = nums[0] + nums[1] + nums[2]; // Initial closest sum

    for (int i = 0; i < nums.length - 2; i++) {
      int j = i + 1; // Pointer at the next number
      int k = nums.length - 1; // Pointer at the end

      while(j < k){
        int sum = nums[i] + nums[j] + nums[k];
        if(Math.abs(target - sum) < Math.abs(target - closestSum)){
          closestSum = sum;
        }

        if(sum > target){ // If our sum is too big, move down the upper pointer
          k--;
        }else{ // If our sum is too small, move up our lower pointer
          j++;
        }
      }
    }

    return closestSum;
  }

  public static void main(String[] args) {
    Closest3Sum s = new Closest3Sum();

    System.out.println(s.threeSumClosest(new int[]{1,2,3,4,-1}, 5));
  }
}
