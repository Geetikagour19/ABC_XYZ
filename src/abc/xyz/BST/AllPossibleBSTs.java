
package abc.xyz.BST;
import java.util.ArrayList;
public class AllPossibleBSTs {

	static Node root;
	
	static ArrayList<Node> constructAllPossibleBSTs(int start, int end) {
		ArrayList<Node> arr = new ArrayList<Node>();
		if(start > end){
			arr.add(null);
			return null;
		}
		for(int i = start; i<= end; i++){
			ArrayList<Node> leftSubTree= constructAllPossibleBSTs(start, i-1);
			ArrayList<Node> rightSubTree = constructAllPossibleBSTs(i+1, end);
			
			for(int j = 0; j<leftSubTree.size();j++){
				Node left = leftSubTree.get(j);
				for(int k =0; k<rightSubTree.size(); k++){
					Node right = rightSubTree.get(k);
					
					Node node = new Node(i);
					node.left = left;
					node.right = right;
					
					arr.add(node);
				}
			}
		}
		
		return arr;
	}	
	static void preOrder(Node node){
		if(node == null) return;
		System.out.print(node.data+ " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	static void inOrder(Node node){
		if(node == null) return ;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
	
	public static void main(String[] args) {
		ArrayList<Node> arr = constructAllPossibleBSTs(1,3);
 
		for(int i=0;i<arr.size();i++) {
			System.out.println("inOrder");
			inOrder(arr.get(i));
			System.out.println();
 
			//System.out.println("preOrder");
			//preOrder(arr.get(i));
			//System.out.println("\n");
		}
	}
}
