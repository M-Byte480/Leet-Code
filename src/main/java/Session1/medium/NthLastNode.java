package Session1.medium;

import Session1.ListNode;

public class NthLastNode {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode node = head;
    ListNode previous = null;
    ListNode waitNode = head;

    for (int i = 1; i < n; i++) {
      node = node.next;
    }

    while(node.next != null){
      previous = waitNode;
      node = node.next;
      waitNode = waitNode.next;
    }

    if(previous != null){
      previous.next = waitNode.next;
    }else{
      head = head.next;
    }

    return head;
  }

  public static void main(String[] args) {
    NthLastNode n = new NthLastNode();

    System.out.println(n.removeNthFromEnd(new ListNode(2), 1));
  }
}
