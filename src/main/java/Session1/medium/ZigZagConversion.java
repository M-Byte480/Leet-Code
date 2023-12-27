package Session1.medium;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ZigZagConversion {
  public static String convert(String s, int numRows) {
    int difference = numRows - 2;
    if (difference == -1){
      return s;
    }
    ArrayList<StringBuilder> strings = new ArrayList<>();

    for (int i = 0; i < numRows; i++) {
      strings.add(new StringBuilder());
    }

    int i = 0;
    while(i < s.length()){
      for(int j = 0; i < s.length() && j < numRows; j++){
        strings.get(j).append(s.charAt(i));
        i++;
      }

      for (int j = 1; i < s.length() && j < difference + 1; j++) {
        strings.get(numRows - 1 - j).append(s.charAt(i));
        i++;
      }
    }

    return strings.stream().map(Object::toString)
        .collect(Collectors.joining());
  }

  public static void main(String[] args) {
    System.out.println(convert("PAYPALISHIRING", 3));
  }
}
