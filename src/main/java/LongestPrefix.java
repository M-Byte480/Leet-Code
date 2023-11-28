import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LongestPrefix {

  public static String longestCommonPrefix(String[] strs) {
    String longestPre = strs[0];
    for (int i = 1; i < strs.length; i++) {
      String wordToCheck = strs[i];

      if(wordToCheck.length() < longestPre.length()){
        String tmp = wordToCheck;
        wordToCheck = longestPre;
        longestPre = tmp;
      }

      for (int j = 0; j < longestPre.length(); j++) {
        if(wordToCheck.charAt(j) != longestPre.charAt(j)){
          longestPre = wordToCheck.substring(0, j);
        }
      }
    }
    return longestPre;
  }

  public static String longestCommonPrefix2(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    String prefix = strs[0];
    for (String s : strs)
      while (s.indexOf(prefix) != 0)
        prefix = prefix.substring(0, prefix.length() - 1);
    return prefix;
  }

  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"}));
  }
}
