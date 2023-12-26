package Session1.medium;

public class LongestPalindromicString {
  public static String getLongest(String s) {
    if(s == null || s.isEmpty()){
      return "";
    }
    int startPointer = 0;
    int endPointer = 0;

    for (int i = 0; i < s.length(); i++) {
      int len1 = expandFromCenter(s, i, i);
      int len2 = expandFromCenter(s, i, i+1);

      int longestLen = Math.max(len1, len2);

      if(longestLen > endPointer - startPointer){
        // i is the center of the palindrome:

        // Round down for even for index
        startPointer = i - ((longestLen - 1) / 2);
        endPointer = i + (longestLen / 2);
      }
    }

    return s.substring(startPointer, endPointer + 1);
  }

  public static int expandFromCenter(String s, int leftPointer, int rightPointer){
    while(leftPointer >= 0 && rightPointer < s.length() && s.charAt(leftPointer) == s.charAt(rightPointer)){
      leftPointer--;
      rightPointer++;
    }

    // Derive the return value: 
    // (rightPointer - 1) - (leftPointer + 1) + 1
    // (rightPointer - 1 - leftPointer - 1 + 1
    return rightPointer - leftPointer - 1;
  }
  public static void main(String[] args) {
    System.out.println(getLongest("amanaplanacanalpanama"));
  }
}
