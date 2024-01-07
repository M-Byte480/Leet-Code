package Session1.easy;

public class SearchInsertPositionBinarySearch {
  public int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while(left <= right){
      int middle = left + (right - left) / 2 ;
      int value = nums[middle];

      if(target == value){
        return middle;
      }

      if(value < target){
        left = middle + 1;
      }else{
        right = middle - 1;
      }

    }

    return left;
  }

  public static void main(String[] args) {
    SearchInsertPositionBinarySearch t = new SearchInsertPositionBinarySearch();

    System.out.println(t.searchInsert(new int[]{1,3,5,6}, 2));
  }
}
