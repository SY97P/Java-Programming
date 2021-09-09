package week11.node;


public class ListNode4a {
    int data;
    ListNode4a next;

    public ListNode4a(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode4a(int data, ListNode4a next) {
        this.data = data;
        this.next = next;
    }
        
     public static void main(String[] args) {

    	 ListNode4a list = new ListNode4a(990, null);
    	
    	 for(int i=98; i>0; i--)
    	 {
    		 list = new ListNode4a(i*10, list);
    	 }
    	 
    	 ListNode4a current = list;
    	 while(current != null)
    	 {
    		 System.out.println(current.data+" ");
    		 current = current.next;
    	 }
    }
}
