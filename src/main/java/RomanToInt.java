import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

  public static final String  ROMAN = Arrays.toString(new char[]{'I',
      'V',
      'X',
      'L',
      'C',
      'D',
      'M'});

  public static final Map<Character, Integer> RomanNums = new HashMap<>();

  static {
    RomanNums.put('I', 1);
    RomanNums.put('V', 5);
    RomanNums.put('X', 10);
    RomanNums.put('L', 50);
    RomanNums.put('C', 100);
    RomanNums.put('D', 500);
    RomanNums.put('M', 1000);
  }
  public static int romanToDec(String roman) {
    char[] romanSymbols = roman.toCharArray();

    if( 1 == romanSymbols.length){
      return RomanNums.get(romanSymbols[0]);
    } else if (0 == romanSymbols.length) {
      return 0;
    }
    int result = RomanNums.get(romanSymbols[romanSymbols.length - 1]);

    for (int i = romanSymbols.length - 2; i >= 0; i--) {
      int num1 = RomanNums.get(romanSymbols[i]);
      int num2 = RomanNums.get(romanSymbols[i + 1]);
      if( num1 < num2 ){
        result -= num1;
      }else{
        result += num1;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println(romanToDec("III"));
  }
}
