package Session1;

public class ListNode {

  public int val;
  public ListNode next;
  public ListNode prev;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public String toString(){
    StringBuilder a = new StringBuilder();
    ListNode current = this;
    while(current != null){
      a.append(current.val);
      current = current.next;
    }
    return a.toString();
  }
}