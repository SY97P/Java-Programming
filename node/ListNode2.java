package week11.node;


public class ListNode2 {
    int data;
    ListNode2 next;

    public ListNode2(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode2(int data, ListNode2 next) {
        this.data = data;
        this.next = next;
    }
        
     public static void main(String[] args) {
         //두번째 구성자를 만들기위해서는 뒤에부터 만들어주어야한다.
         ListNode2 list = new ListNode2(20, null);
         list = new ListNode2(10, list);
         
         list = new ListNode2(30, list);
         
         System.out.println(list.data + " " + list.next.data+" "+list.next.next.data);
    }
}
