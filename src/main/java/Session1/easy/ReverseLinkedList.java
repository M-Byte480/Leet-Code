package Session1.easy;

import Session1.ListNode;

public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    ListNode previous = null;
    ListNode current = head;

    while(current != null){
      ListNode next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }

    return previous;
  }

  public ListNode reverseDoublyList(ListNode head) {
    ListNode temp = null;
    ListNode current = head;

    while(current != null){
      temp = current.prev;
      current.prev = current.next;
      current.next = temp;
      current = current.prev;
    }

    if (temp != null){
      head = temp.prev;
    }

    return head;
  }
}
