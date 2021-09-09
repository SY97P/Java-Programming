package week11.node;


public class ListNode4b {
    int data;
    ListNode4b next;

    public ListNode4b(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode4b(int data, ListNode4b next) {
        this.data = data;
        this.next = next;
    }
        
     public static void main(String[] args) {

    	 ListNode4b list = new ListNode4b(990, null);
    	
    	 for(int i=98; i>0; i--)
    	 {
    		 list = new ListNode4b(i*10, list);
    	 }
    	 
    	 ListNode4b current = list;
    	 

    	 current = list;		//임시변수 사용
    	 while(current.next != null)	//리스트에 끈 노드를 찾는다.
    		 current = current.next;
    	 current.next = new ListNode4b(1000);
    	 
    	 ListNode4b current2 = list;
    	 while(current2 != null)
    	 {
    		 System.out.println(current2.data+" ");
    		 current2 = current2.next;
    	 }
    	 
    }
}
