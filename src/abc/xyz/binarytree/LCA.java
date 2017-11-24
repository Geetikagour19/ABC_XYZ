package abc.xyz.binarytree;

public class LCA {

	Node root;
	static boolean v1 = false, v2 = false;
	Node findLCA(int n1, int n2){
		return findLCA(root, n1, n2);
	}
	
	Node findLCA(Node node, int n1, int n2){
		if(node==null)
			return null;
		if(node.data==n1 || node.data==n2)
			return node;
		Node left_lca = findLCA(node.left, n1, n2);
		Node right_lca = findLCA(node.right, n1, n2);
		
		if(left_lca!=null && right_lca!=null)
			return node;
		return (left_lca!=null ? left_lca:right_lca);
	}
	
	Node findLCA1(int n1, int n2){
		v1=false;
		v2=false;
		Node lca = findLCAUtil(root, n1, n2);
		if(v1 && v2)
			return lca;
		return null;
				
	}
	
	Node findLCAUtil(Node node, int n1, int n2){
		if(node==null)
			return null;
		if(node.data==n1){
			v1=true;
			return node;
		}
		if(node.data==n2){
			v2=true;
			return node;
		}
		Node left_lca = findLCAUtil(node.left, n1, n2);
		Node right_lca = findLCAUtil(node.right, n1, n2);
		
		if(left_lca!=null && right_lca!=null)
			return node;
		return (left_lca!=null ? left_lca:right_lca); 
	}
	public static void main(String args[])
    {
        LCA tree = new LCA();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("LCA(4, 5) = " +
                            tree.findLCA(4, 5).data);
        System.out.println("LCA(4, 6) = " +
                            tree.findLCA(4, 6).data);
        System.out.println("LCA(3, 4) = " +
                            tree.findLCA(3, 4).data);
        System.out.println("LCA(2, 4) = " +
                            tree.findLCA(2, 4).data);
        System.out.println("--------------------------------------------");
        Node lca = tree.findLCA1(4, 5);
        if (lca != null)
            System.out.println("LCA(4, 5) = " + lca.data);
        else
            System.out.println("Keys are not present");
 
        lca = tree.findLCA1(4, 10);
        if (lca != null)
            System.out.println("LCA(4, 10) = " + lca.data);
        else
            System.out.println("Keys are not present");
    }
}
