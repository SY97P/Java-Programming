package week11.node;


public class ListNode1a {
    int data;
    ListNode1a next;

    public ListNode1a(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode1a(int data, ListNode1a next) {
        this.data = data;
        this.next = next;
    }
        
     public static void main(String[] args) {
         ListNode1a list = new ListNode1a(42);
         list.next = new ListNode1a(-3);
         list.next.next = new ListNode1a(17);
         list.next.next.next = null;
         System.out.println(list.data + " " + list.next.data
                            + " " + list.next.next.data);
    
         
         //두번째 구성자를 만들기위해서는 뒤에부터 만들어주어야한다.
         list = new ListNode1a(17, null);
         list = new ListNode1a(-3, list);
         list = new ListNode1a(42, list);
         System.out.println(list.data + " " + list.next.data
                 + " " + list.next.next.data);
    }
}
