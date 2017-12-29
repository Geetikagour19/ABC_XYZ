package abc.xyz.LinkedList;

public class Multiply2LL {

	Node head1,head2;
	long multiply2list(Node head1, Node head2){
		int num1 =0, num2=0;
		while(head1!=null || head2!=null ){
			if(head1!=null){
				num1 = num1*10+head1.data;
				head1=head1.next;
			}
			if(head2!=null){
				num2=num2*10+head2.data;
				head2=head2.next;
			}
		}
		return num1*num2;
	}
	 void printlist(Node node){
			if(node==null)
				return;
			Node temp=node;
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		public static void main(String[] args) {
			 
			Multiply2LL list = new Multiply2LL();
	       
	        list.head1 = new Node(9);
	        list.head1.next = new Node(4);
	        list.head1.next.next = new Node(6);
	 
	        list.head2 = new Node(8);
	        list.head2.next = new Node(4);
	        
	 
	        System.out.println("List a before merge :");
	        list.printlist(list.head1);
	        System.out.println("");
	        System.out.println("List b before merge :");
	        list.printlist(list.head2);
	 
	        System.out.println("");
	        System.out.println("Multiplication :"+ list.multiply2list(list.head1,list.head2));
	      
	 
	    }
}
