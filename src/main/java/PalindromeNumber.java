
public class PalindromeNumber {
  public static boolean isPalindrome(int d) {
    String num = String.valueOf(d);
    StringBuilder rev = new StringBuilder(num);
    return num.equals(rev.reverse().toString());
  }

  public static boolean isPalindrome2(int d) {
    String num = String.valueOf(d);
    int p1, p2;
    p1 = 0;
    p2 = num.length() - 1;

    while (p2 >= p1 ){
      if(num.charAt(p1) != num.charAt(p2)){
        return false;
      }
      p1++; p2--;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome2(121));
    System.out.println(isPalindrome2(-121));
    System.out.println(isPalindrome2(1246));
  }
}
