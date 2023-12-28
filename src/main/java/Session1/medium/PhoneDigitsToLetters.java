package Session1.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDigitsToLetters {
  public static Map<String, String> phone = new HashMap<>();
  public static ArrayList<String> output = new ArrayList<>();
  static{
    phone.put("2","abc");
    phone.put("3","def");
    phone.put("4","ghi");
    phone.put("5","jkl");
    phone.put("6","mno");
    phone.put("7","pqrs");
    phone.put("8","tuv");
    phone.put("9","wxyz");
  }
  public static List<String> letterCombinations(String digits) {
    output.clear();
    if(digits.isEmpty()){
      return output;
    }
    backTrack("", digits);
    return output;
  }

  public static void backTrack(String combination, String nextDigit){
    if(nextDigit.isEmpty()){
      output.add(combination);
    }else{
      String letters = phone.get(String.valueOf(nextDigit.charAt(0)));
      for(char letter : letters.toCharArray()){
        backTrack(combination + letter, nextDigit.substring(1));
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(letterCombinations("23"));
  }
}
