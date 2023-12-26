package Session1;

import java.util.Arrays;

public class PlusOne {
  public static int[] plusOne(int[] digits) {
    // Early return statement
    for (int i = digits.length - 1; i > -1 ; i--){
      if(digits[i] < 9){
        digits[i]++;
        return digits;
      }
      digits[i] = 0;
    }

    // If all digits are 9s then we just set the first one to 1
    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1})));
  }
}
