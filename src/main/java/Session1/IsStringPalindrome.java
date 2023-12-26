package Session1;

public class IsStringPalindrome {
  public static boolean isPalindrome(String s){
    // Replace all non-alphanumeric characters and then lowercase it
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    if(s.isEmpty()){
      return true;
    }

    boolean isOdd = s.length() % 2 != 0;
    int center = s.length() / 2;


    return isOdd ? isValidPalindrome(s, center, center) : isValidPalindrome(s, center-1, center);
  }

  public static boolean isValidPalindrome(String s, int p1, int p2){
    while(p1 >= 0 && p2 < s.length() && s.charAt(p1) == s.charAt(p2)){
      p1--;
      p2++;
    }

    return p1 < 0 && p2 >= s.length();
  }


  public static void main(String[] args) {
    System.out.println(isPalindrome("0P"));
  }
}
