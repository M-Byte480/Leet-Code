package Session1.medium;

import Session1.ListNode;

public class SwapAdjacentNodes {
  public ListNode swapPairs(ListNode head) {
    if(head == null || head.next == null){
      return head;
    }

    ListNode dummy = new ListNode();
    dummy.next = head;
    ListNode current = dummy;

    while (current.next != null && current.next.next != null){
      ListNode first = current.next;
      ListNode second = current.next.next;

      current.next = second;
      first.next = second.next;
      second.next = first;

      current = current.next.next;
    }

    return dummy.next;
  }
}
