package abc.xyz.binarytree;

public class ChildernSumProperty {
Node root;

int isSumProperty(Node node){
	
	int left =0, right =0;
	if(node==null || node.left==null && node.right==null)
		return 1;
	else{
		
		if(node.left!=null)
			left = node.left.data;
		if(node.right!=null)
			right = node.right.data;
		if((node.data == left+right ) && isSumProperty(node.left)!=0 && isSumProperty(node.right)!=0)
			return 1;
		return 0;
	
	}
	
	
	
}
	
	public static void main(String[] args) 
    {
		ChildernSumProperty tree = new ChildernSumProperty();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(2);
        if (tree.isSumProperty(tree.root) != 0)
            System.out.println("The given tree satisfies children"
                    + " sum property");
        else
            System.out.println("The given tree does not satisfy children"
                    + " sum property");
    }
}
