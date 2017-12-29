package abc.xyz.BST;

import java.util.ArrayList;

public class PairWithGivenSum {

	Node root;
	Node insert(Node node, int data){
		if(node == null)
			return new Node(data);
		if(data < node.data)
			node.left = insert(node.left, data);
		else
			node.right = insert(node.right, data);
		return node;
		
	}
	void insert(int key){
		root = insert(root, key);
	}
	ArrayList<Integer> treeToList(Node node, ArrayList<Integer> list){
		if(node == null) return list;
		treeToList(node.left, list);
		list.add(node.data);
		treeToList(node.right, list);
		return list;
	}
	
	boolean isPairPresent(Node node, int target){
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = treeToList(node, a1);
		int start = 0;
		int end = a2.size() -1;
		while(start < end){
			if(a2.get(start)+a2.get(end)==target){
				 System.out.println("Pair Found: "+a2.get(start)+
	                      " + "+a2.get(end)+" " + "= "+ target);
	            return true;
			}
			if(a2.get(start)+a2.get(end) > target)
				end--;
			if(a2.get(start)+a2.get(end) < target)
				start++;
		}
		 System.out.println("No such values are found!");
	        return false;
	}
	public static void main(String[] args) {
		PairWithGivenSum tree = new PairWithGivenSum();
        /*
                   15
                /     \
              10      20
             / \     /  \
            8  12   16  25    */
        tree.insert(15);
        tree.insert(10);
        tree.insert(20);
        tree.insert(8);
        tree.insert(12);
        tree.insert(16);
        tree.insert(25);
 
        tree.isPairPresent(tree.root, 33);
        }
}
