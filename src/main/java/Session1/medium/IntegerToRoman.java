package Session1.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class IntegerToRoman {
  public static final Map<Integer, String> RomanNums = new TreeMap<>(Collections.reverseOrder());

  static {
    RomanNums.put(1, "I");
    RomanNums.put(4, "IV");
    RomanNums.put(5, "V");
    RomanNums.put(9, "IX");
    RomanNums.put(10, "X");
    RomanNums.put(40, "XL");
    RomanNums.put(50, "L");
    RomanNums.put(90, "XC");
    RomanNums.put(100, "C");
    RomanNums.put(400, "CD");
    RomanNums.put(500, "D");
    RomanNums.put(900, "CM");
    RomanNums.put(1000, "M");
  }

  public static String intToRoman(int num){
    StringBuilder string = new StringBuilder();
    for(Integer i : RomanNums.keySet()){
      for (int j = 0; j < num / i; j++) {
        string.append(RomanNums.get(i));
      }
      num %= i;
    }
    return string.toString();
  }

  public static void main(String[] args) {
    System.out.println(intToRoman(213));
  }
}
