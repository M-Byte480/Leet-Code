package Session1;

public class RemoveDupesFromSorted {
  public static int removeDuplicates(int[] nums) {
    if(nums.length < 1){
      return 0;
    }

    int unique = 1;
    int p1 = 0; // Insertion Post
    int p2 = 0; // What to insert

    while(p2 < nums.length){
      if(nums[p1] == nums[p2]){
        p2++;
      }else{
        p1++;
        nums[p1] = nums[p2];
        unique++;
      }
    }

    return unique;
  }

  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
  }
}
