package abc.xyz.LinkedList;

public class PalindreomLL2 {
	
	Node head, left;
	class Node 
    {
        char data;
        Node next;
 
        Node(char d) 
        {
            data = d;
            next = null;
        }
    }
	boolean isPalindromeUtil(Node right){
		left = head;
		if(right==null)
			return true;
		boolean isp= isPalindromeUtil(right.next);
		if(isp==false)
			return false;
		boolean isp1=(right.data==left.data);
		left=left.next;
		return isp1;
	}
	boolean isPalindrome(Node head){
		boolean result = isPalindromeUtil(head);
		return result;
	}
	 public void push(char new_data) 
	    {
	        /* Allocate the Node &
	           Put in the data */
	        Node new_node = new Node(new_data);
	 
	        /* link the old list off the new one */
	        new_node.next = head;
	 
	        /* Move the head to point to new Node */
	        head = new_node;
	    }
	 
	    // A utility function to print a given linked list
	    void printList(Node ptr) 
	    {
	        while (ptr != null) 
	        {
	            System.out.print(ptr.data + "->");
	            ptr = ptr.next;
	        }
	        System.out.println("NULL");
	    }
	 
	    /* Driver program to test the above functions */
	    public static void main(String[] args) 
	    {
	        /* Start with the empty list */
	    	PalindreomLL2 llist = new PalindreomLL2();
	 
	        char str[] = {'a', 'b', 'a', 'c', 'a', 'b', 'a'};
	        String string = new String(str);
	        for (int i = 0; i < 7; i++) 
	        {
	            llist.push(str[i]);
	            llist.printList(llist.head);
	            if (llist.isPalindrome(llist.head) != false) 
	            {
	                System.out.println("Is Palindrome");
	                System.out.println("");
	            } 
	            else
	            {
	                System.out.println("Not Palindrome");
	                System.out.println("");
	            }
	        }
	    }
}
