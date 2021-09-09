package week11.node;


public class ListNode1b {
    int data;
    ListNode1b next;

    public ListNode1b(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode1b(int data, ListNode1b next) {
        this.data = data;
        this.next = next;
    }
        
     public static void main(String[] args) {
         //두번째 구성자를 만들기위해서는 뒤에부터 만들어주어야한다.
         ListNode1b list = new ListNode1b(20, null);
         list = new ListNode1b(10, list);
         
         ListNode1b newNode = new ListNode1b(30);
         list.next.next = newNode;
         //list.next.next = new ListNode(30);과 같다
         System.out.println(list.data + " " + list.next.data+" "+list.next.next.data);
    }
}
