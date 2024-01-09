package Session1.medium;

import Session1.ListNode;

public class ReorderLinkedList {

    public void reorderList(ListNode head) {
      if (head == null || head.next == null) {
        return;
      }

      ListNode slow = head;
      ListNode fast = head;

      // Accounts for even number, and odd number lists
      while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      }

      // Break middle
      ListNode middle = slow;
      slow = slow.next;
      middle.next = null;

      // Reverse from half to the end
      ListNode previous = null;
      while (slow != null) {
        ListNode next = slow.next;
        slow.next = previous;
        previous = slow;
        slow = next;
      }

      // Merge
      ListNode first = head;
      ListNode second = previous;

      while (first != null && second != null) {
        ListNode temp1 = first.next;
        first.next = second;

        ListNode temp2 = second.next;
        second.next = temp1;

        first = temp1;
        second = temp2;
      }
    }

  public static void main(String[] args) {
    ReorderLinkedList l = new ReorderLinkedList();
    ListNode n = new ListNode(1,
        new ListNode(2,
            new ListNode(3,
                new ListNode(4,
                    new ListNode(5)
                )
            )
        )
    );
    l.reorderList(n);

    System.out.println(n);
  }
}
