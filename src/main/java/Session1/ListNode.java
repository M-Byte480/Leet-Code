package Session1;

public class ListNode {

  public int val;
  public ListNode next;

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
    while(next != null){
      a.append(val);
      next = next.next;
    }
    return a.toString();
  }
}