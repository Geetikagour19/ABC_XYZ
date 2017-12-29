package abc.xyz.LinkedList;
class Node{
	int data;
	Node next,random,right,left;
	Node(int data){
		this.data=data;
		next=random=left=right=null;
	}
}
public class SortLL_0_1_2 {
Node head;
    public void sortList(){
    	int count[] = {0,0,0};
    	Node node = head;
    	while(node!=null){
    		count[node.data]++;
    		node=node.next;
    	}
    	int i =0;
    	node = head;
    	while(node!=null){
    		if(count[i]==0)
    			i++;
    		else{
    			node.data=i;
    			--count[i];
    			node=node.next;
    		}
    	}
    }
    
	public void push(int data){
		Node new_node = new Node(data);
		new_node.next = head;
		head=new_node;
		
	}
	
	void printList(){
		Node node = head;
		while(node!=null){
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println();
	}
	public static void main(String args[])
    {
		SortLL_0_1_2 llist = new SortLL_0_1_2();
         
        /* Constructed Linked List is 1->2->3->4->5->6->7->
           8->8->9->null */
        llist.push(0);
        llist.push(1);
        llist.push(0);
        llist.push(2);
        llist.push(1);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        llist.push(2);
         
        System.out.println("Linked List before sorting");
        llist.printList();
         
        llist.sortList();
 
        System.out.println("Linked List after sorting");
        llist.printList();
    }
}
