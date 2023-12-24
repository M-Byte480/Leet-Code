package Session1;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

  public static boolean isValid(String s) {
    if (s.length() < 2) {
      return false;
    }
    HashMap<Character, Character> closingToOpen = new HashMap<>();
    closingToOpen.put(']', '[');
    closingToOpen.put('}', '{');
    closingToOpen.put(')', '(');
    closingToOpen.put('>', '<');

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char next = s.charAt(i);

      if (!closingToOpen.containsKey(next)) {
        stack.push(next);
      } else {

        if(stack.isEmpty()){
          return false;
        }

        char pop = stack.pop();
        if (closingToOpen.get(next) != pop) {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println(isValid("[[][][]{}{}{[]}{}[]{}{}{}]"));
  }
}
