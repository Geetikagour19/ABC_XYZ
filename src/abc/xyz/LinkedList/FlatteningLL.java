package abc.xyz.LinkedList;

public class FlatteningLL {

	Node head;
	Node sortedmerge(Node h1, Node h2){
		if(h1==null)
			return h2;
		if(h2==null)
			return h1;
		if(h1.data<h2.data){
			h1.next=sortedmerge(h1.next, h2);
			return h1;
		}	
		else{
			h2.next=sortedmerge(h2.next, h1);
			return h2;
		}
	}
	Node flatten(Node root)
    {
        // Base Cases
        if (root == null || root.right == null)
            return root;
 
        // recur for list on right
        root.right = flatten(root.right);
 
        // now merge
        root = sortedmerge(root, root.right);
 
        // return the root
        // it will be in turn merged with its left
        return root;
    }
	Node push(Node head_ref, int data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head_ref;
 
        /* 4. Move the head to point to new Node */
        head_ref = new_node;
 
        /*5. return to link it back */
        return head_ref;
    }
 
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
 
    /* Drier program to test above functions */
    public static void main(String args[])
    {
    	FlatteningLL L = new FlatteningLL();
 
        /* Let us create the following linked list
            5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
        */
 
        L.head = L.push(L.head, 30);
        L.head = L.push(L.head, 8);
        L.head = L.push(L.head, 7);
        L.head = L.push(L.head, 5);
 
        L.head.right = L.push(L.head.right, 20);
        L.head.right = L.push(L.head.right, 10);
 
        L.head.right.right = L.push(L.head.right.right, 50);
        L.head.right.right = L.push(L.head.right.right, 22);
        L.head.right.right = L.push(L.head.right.right, 19);
 
        L.head.right.right.right = L.push(L.head.right.right.right, 45);
        L.head.right.right.right = L.push(L.head.right.right.right, 40);
        L.head.right.right.right = L.push(L.head.right.right.right, 35);
        L.head.right.right.right = L.push(L.head.right.right.right, 20);
 
        // flatten the list
        L.head = L.flatten(L.head);
 
        L.printList();
    }
}
