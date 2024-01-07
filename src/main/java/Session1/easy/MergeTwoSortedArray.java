package Session1.easy;

import java.util.Arrays;

public class MergeTwoSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    int endPointer = m + n - 1;

    while(p2 >= 0){
      if(p1 >= 0 && nums1[p1] > nums2[p2]){
        nums1[endPointer] = nums1[p1];
        p1--;
      }else{
        nums1[endPointer] = nums2[p2];
        p2--;
      }
      endPointer--;
    }

    System.out.println(Arrays.toString(nums1));
  }

  public static void main(String[] args) {
    MergeTwoSortedArray t = new MergeTwoSortedArray();

    t.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
  }
}
