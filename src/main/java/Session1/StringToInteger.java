package Session1;

public class StringToInteger {
  public static int myAtoi(String s) {
    s = s.strip();
    if(s.isEmpty() || s.isBlank()){
      return 0;
    }
    int p = 0;
    boolean neg = s.charAt(0) == '-';
    boolean pos = s.charAt(0) == '+';

    if(neg || pos){
      p++;
    }

    final int maxLimit = Integer.MAX_VALUE / 10;

    int result = 0;
    while(p < s.length() && '0' <= s.charAt(p) && s.charAt(p) <= '9'){
      int digit = s.charAt(p) - '0';
      // Base condition/guard clause
      if(maxLimit < result || (maxLimit == result && digit > Integer.MAX_VALUE % 10)){ // 7
        return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
      }

      result = result * 10 + digit;

      p++;
    }

    return neg ? -result : result;
  }

  public static void main(String[] args) {
    System.out.println(myAtoi("+"));
  }
}
