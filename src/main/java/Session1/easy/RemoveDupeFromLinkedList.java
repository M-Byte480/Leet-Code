package Session1.easy;

import Session1.ListNode;

public class RemoveDupeFromLinkedList {
  public ListNode deleteDuplicates(ListNode head) {
    if(head == null){
      return null;
    }
    // Our List is sorted so we grab the head
    ListNode node = head;

    while(node.next != null){
      if(node.next.val == node.val){
        node.next = node.next.next;
      }else{
        node = node.next;
      }
    }

    return head;
  }
}
