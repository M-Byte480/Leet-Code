package Session1;

public class MedianOfTwoArrays {
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int m = nums2.length;
    int sizeOfTwoArr = n + m;

    boolean even = sizeOfTwoArr % 2 == 0;

    int i = 0; // nums1
    int j = 0; // nums2

    int median = 0;
    int previousNumber = 0;

    for (int count = 0; count <= sizeOfTwoArr / 2; count++) {
      previousNumber = median;

      if(i != n && j != m){ // If we havent reached the end, we compare
        if(nums1[i] < nums2[j]){
          median = nums1[i++];
        }else{
          median = nums2[j++];
        }
      }else if(i == n){ // We reached an array end, increment the OTHER pointer
       median = nums2[j++];
      }else {
        median = nums1[i++];
      }
    }

    return even ? (median + previousNumber) / 2.0 : (double) median;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[]{1,2};
    int[] arr2 = new int[]{3,4};
    System.out.println( findMedianSortedArrays(arr1, arr2) );
  }
}
