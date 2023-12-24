package Session1;

public class MergeTwoSortedLinkedList {

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy;
    ListNode placeHolder = new ListNode();
    dummy = placeHolder;
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        placeHolder.next = list1;
        list1 = list1.next;
      } else {
        placeHolder.next = list2;
        list2 = list2.next;
      }
      placeHolder = placeHolder.next;

    }

    if (list1 == null) {
      placeHolder.next = list2;
    } else {
      placeHolder.next = list1;
    }

    return dummy.next;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(0, new ListNode(4));

    System.out.println(mergeTwoLists(a, b).toString());
  }
}
