package abc.xyz.LinkedList;

public class PalindromLL {
 static class Node{
	 String data;
	 Node next;
	 Node(String data){
		 this.data=data;
		 next=null;
	 }
 }
	Node head;
	boolean isPalindromUtil(String str){
		int n = str.length();
		for(int i =0;i<n/2;i++){
			if(str.charAt(i)!=str.charAt(n-i-1))
				return false;
		}
		return true;
	}
	boolean isPalindrome(){
		Node node = head;
		String str="";
		while(node!=null){
			str=str.concat(node.data);
			node=node.next;
		}
		return isPalindromUtil(str);
		
	}
	public static void main(String[] args)
    {
		PalindromLL list = new PalindromLL();
        list.head = new Node("a");
        list.head.next = new Node("bc");
        list.head.next.next = new Node("d");
        list.head.next.next.next = new Node("dcb");
        list.head.next.next.next.next = new Node("a");
 
        System.out.println(list.isPalindrome());
 
    }
}
