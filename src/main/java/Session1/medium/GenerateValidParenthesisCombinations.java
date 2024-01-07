package Session1.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateValidParenthesisCombinations {
  public List<String> generateParenthesis(int n) {
    ArrayList<String> result = new ArrayList<>();
    depthFirstSearch(0, 0, "", result, n);
    return result;
  }

  public void depthFirstSearch(int left, int right, String s, List<String> result, int n){
    if(s.length() == n * 2 ){
      result.add(s);
      return;
    }

    if(left < n){
      depthFirstSearch(left + 1, right, s + "(", result, n);
    }
    if(right < left){
      depthFirstSearch(left, right + 1, s + ")", result, n);
    }
  }

  public static void main(String[] args) {
    GenerateValidParenthesisCombinations g = new GenerateValidParenthesisCombinations();
    System.out.println(g.generateParenthesis(10));
  }
}
