package Session1;

public class LengthOfLastWord {
  public static int lengthOfLastWord(String s) {
    int p1 = s.length() - 1;

    while(p1 > -1 && s.charAt(p1) == ' '){
      p1--;
    }

    if(p1 < 0){
      return 0;
    }

    int end = p1;
    while(p1 > -1 && s.charAt(p1) != ' '){
      p1--;
    }

    return end - p1;
  }

  public static void main(String[] args) {
    System.out.println(lengthOfLastWord("a"));
  }
}
