package week11.node;


public class ListNode3 {
    int data;
    ListNode3 next;

    public ListNode3(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode3(int data, ListNode3 next) {
        this.data = data;
        this.next = next;
    }
        
     public static void main(String[] args) {
         //두번째 구성자를 만들기위해서는 뒤에부터 만들어주어야한다.
         ListNode3 list1 = new ListNode3(20, null);
         list1 = new ListNode3(10, list1);
         
         ListNode3 list2 = new ListNode3(40, null);
         list2 = new ListNode3(30, list2);
         
         ListNode3 temp = list2.next;
         list2.next = list1.next;
         list1.next = list2;
         //1.40을 다른 참조변수에 저장한다 2. list2의 30을 list1의 20에 붙인다
         //3.list1의 10을 list2의 30에 붙인다. 4.list2가 1번의 참조를 가리키게 한다.
         list2 = temp;
         
         System.out.println(list1.data + " " + list1.next.data+" "+list1.next.next.data);
         System.out.println(list2.data);
    }
}
