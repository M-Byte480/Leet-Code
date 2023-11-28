public class ReverseInteger {
  public static int reverse(int x) {
    int result = 0;

    try{
      while(x > 9 || x < -9){
        int remainder = x % 10;
        x = x / 10;
        result = result + remainder;
        result = Math.multiplyExact(result, 10);
      }
      int remainder = x % 10;
      result = result + remainder;

    }catch (ArithmeticException e){
      return 0;
    }

    return result;
  }
  public static void main(String[] args) {
    System.out.println(reverse(-2147483412));
  }
}
