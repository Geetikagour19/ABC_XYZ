package abc.xyz.com;

/*class Node{
	int data;
	Node left, right;
	public Node(int data){
		this.data=data;
		left=right=null;
	}
}*/
public class SumTree {
 Node root;
 int sum(Node node){
  if(node==null)
	 return 0;
  return (sum(node.left)+node.data+sum(node.right));
 }
 
 int isSumTree(Node node){
	 int ls, rs;
	 if(node==null || (node.left ==null) && (node.right==null))
		 return 1;
	 ls=sum(node.left);
	 rs=sum(node.right);
	 if((node.data==ls+rs) && (isSumTree(node.left)!=0) && (isSumTree(node.right)!=0))
		 return 1;
	 return 0;	
 
 }
 
 boolean isLeaf(Node node){
	 if(node==null || node.left==null && node.right==null)
		 return true;
	 return false;
 }
 
 boolean isSum(Node node){
	 int sum =0;
	 return isSumUtil(node, sum);
 }
 
 boolean isSumUtil(Node node, int sum){
	  
	  if(isLeaf(node)==true){
		  sum= node.data;
		  return true;
	  }
	  
	  int ls = 0; 
	  int rs = 0;
	  
	  boolean bls = isSumUtil(node.left, ls);
	  boolean brs = isSumUtil(node.right, rs);
	  
	  sum = ls+rs+node.data;
	  
	  return (node.data==ls+rs) && bls && brs;
	  
		  
 }
 public static void main(String args[])
	{
		SumTree tree = new SumTree();
        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(3);
  
        if (tree.isSumTree(tree.root) != 0)
            System.out.println("The given tree is a sum tree");
        else
            System.out.println("The given tree is not a sum tree");
    }
}
