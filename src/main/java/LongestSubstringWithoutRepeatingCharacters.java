import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

  public static int lengthOfLongestSubstring(String s) {
    int p1 = 0;
    int p2 = 0;
    int max = 0;
    HashSet<Character> characters = new HashSet<>();

    while( p2 < s.length() ){
      if( !characters.contains(s.charAt(p2))){
        characters.add(s.charAt(p2));
        p2++;

        max = Math.max(characters.size(), max);
      }else{
        characters.remove(s.charAt(p1));
        p1++;
      }
    }

    return max;
  }

  public static void main(String[] args) {
    String s = "aab";
    System.out.println(lengthOfLongestSubstring(s));
  }
}
