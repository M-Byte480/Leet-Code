package Session1.medium;

public class DivideTwoNumbersManually {
  public int divide(int dividend, int divisor) {
    boolean negativeFlag = false;
    if(dividend > 0){
      negativeFlag = true;
      dividend = -dividend;
    }

    if(divisor > 0){
      negativeFlag = !negativeFlag;
      divisor = -divisor;
    }

    int result = 0;
    while(dividend <= divisor){
      result += 1;
      dividend -= divisor;
      if(result == Integer.MAX_VALUE){
        break;
      }
    }

    return !negativeFlag ? result : result == Integer.MAX_VALUE ? Integer.MIN_VALUE : -result;
  }

  public int divide2(int dividend, int divisor) {
    boolean negativeFlag = false;
    if(dividend > 0){
      negativeFlag = true;
      dividend = -dividend;
    }

    if(divisor > 0){
      negativeFlag = !negativeFlag;
      divisor = -divisor;
    }

    int result = 0;
    while(dividend <= divisor){
      result += 1;
      dividend -= divisor;
      if(result == Integer.MAX_VALUE){
        break;
      }
    }

    return !negativeFlag ? result : result == Integer.MAX_VALUE ? Integer.MIN_VALUE : -result;
  }

  public static void main(String[] args) {
    DivideTwoNumbersManually t = new DivideTwoNumbersManually();
    System.out.println(t.divide(2147483647, 2));
  }
}
