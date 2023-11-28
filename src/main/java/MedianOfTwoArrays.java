public class MedianOfTwoArrays {
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int sizeOfTwoArr = nums1.length + nums2.length;

    int lastElement = 0;
    int half = (int) sizeOfTwoArr / 2;
    boolean even = sizeOfTwoArr % 2 == 0;

    int p1 = 0;
    int p2 = 0;
    int i = 0;
    int num1 = 0;
    int num2 = 0;

    int nums1Size = nums1.length;
    int nums2Size = nums2.length;

    while(true){
      if(p1 == nums1Size){
        num1 = Integer.MAX_VALUE;
      }else{
        num1 = nums1[p1];
      }

      if(p2 == nums2Size){
        num2 = Integer.MAX_VALUE;
      }else{
        num2 = nums2[p2];
      }

      if(i == half){
        if(even){
          return (Math.min(num1, num2) + lastElement) / 2.0;
        }else{
          return Math.min(num1, num2);
        }
      }

      if(num1 < num2){
        lastElement = num1;
        p1++;
      }else{
        lastElement = num2;
        p2++;
      }
      i++;
    }
  }

  public static void main(String[] args) {
    int[] arr1 = new int[]{1,2};
    int[] arr2 = new int[]{3,4};
    System.out.println( findMedianSortedArrays(arr1, arr2) );
  }
}
