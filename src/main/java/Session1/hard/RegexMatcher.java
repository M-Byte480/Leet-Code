package Session1.hard;
/*
  Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

  '.' Matches any single character.​​​​
  '*' Matches zero or more of the preceding element.
  The matching should cover the entire input string (not partial).



  Example 1:
  Input: s = "aa", p = "a"
  Output: false
  Explanation: "a" does not match the entire string "aa".

  Example 2:
  Input: s = "aa", p = "a*"
  Output: true
  Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".

  Example 3:
  Input: s = "ab", p = ".*"
  Output: true
  Explanation: ".*" means "zero or more (*) of any character (.)".
 */
public class RegexMatcher {
  Result[][] memory;

  enum Result{
    TRUE, FALSE
  }

  public boolean isMatch(String s, String p) {
    memory = new Result[s.length() + 1][p.length() + 1];
    return dynamicProgramming(0, 0, s, p);
  }

  public boolean dynamicProgramming(int i, int j, String text, String pattern){
    if(memory[i][j] != null){
      return memory[i][j] == Result.TRUE;
    }

    boolean answer;

    if(j == pattern.length()){ // When regex pointer is at the end
      answer = i == text.length(); // Are we at the end of the text
    }else{
      boolean first_match = (i < text.length() &&
          (pattern.charAt(j) == text.charAt(i) || pattern.charAt(j) == '.')); // Any character or hard coded character.

      if(j + 1 < pattern.length() && pattern.charAt(j+ 1) == '*'){ // When we have the any number sign (*), increment text pointer until it fails, or move the regex pointer.
        answer = (dynamicProgramming(i, j + 2,  text, pattern) || first_match && dynamicProgramming(i+1, j , text, pattern));
      }else{
        answer = first_match && dynamicProgramming(i+1, j+1, text, pattern); // Otherwise, its a hard match and increment both
      }
    }
    memory[i][j] = answer ? Result.TRUE : Result.FALSE;
    return answer;
  }

  public static void main(String[] args) {
    RegexMatcher reg = new RegexMatcher();
    System.out.println(reg.isMatch("aaaa", "a*b"));
  }
}
