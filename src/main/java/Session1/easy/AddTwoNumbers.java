package Session1.easy;

import org.w3c.dom.Node;

public class AddTwoNumbers {

  static class Node {

    int val;
    Node next;
    
    Node(){
      next = null;
    }
    
    Node(int d) {
      val = d;
      next = null;
    }

    Node(int d, Node n){
      val = d;
      next = n;
    }

    public String toString(){
      StringBuilder a = new StringBuilder();
      while(next != null){
        a.append(val);
        next = next.next;
      }
      return a.toString();
    }
  }
  public static Node addTwoNumbers(Node l1, Node l2) {
    Node current = new Node();
    Node dummyNode = current;
    int carry = 0;

    while ( l1 != null || l2 != null || carry != 0){
      int val1 = (l1 == null) ? 0 : l1.val;
      int val2 = (l2 == null) ? 0 : l2.val;

      int sum = val1 + val2 + carry;

      carry = sum / 10;
      current.next = new Node(sum % 10);
      current = current.next;

      if(l1 != null)  l1 = l1.next;
      if(l2 != null)  l2 = l2.next;
    }

    return dummyNode.next;
  }
  public static void main(String[] args) {
    Node a = new Node(2, new Node(4, new Node(3)));
    Node b = new Node(5, new Node(6, new Node(4)));

    System.out.println(addTwoNumbers(a, b).toString());
  }
}
