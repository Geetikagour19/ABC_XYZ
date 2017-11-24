package abc.xyz.binarytree;

public class LevelOFGIvenNode {

	Node root;
	int getLevelUtil(Node node, int data, int level){
		
		if(node == null)
			return 0;
		if(node.data == data)
			return level;
		int left_level = getLevelUtil(node.left, data, level +1);
		if(left_level ==0)
			return getLevelUtil(node.right, data, level+1);
		return left_level;
	}
	
	int getLevel(Node node, int data){
		
		return getLevelUtil(node, data, 1);
	}
	
	public static void main(String[] args) 
    {
		LevelOFGIvenNode tree = new LevelOFGIvenNode();
  
        /* Constructing tree given in the above figure */
        tree.root = new Node(3);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);
        for (int x = 1; x <= 5; x++) 
        {
            int level = tree.getLevel(tree.root, x);
            if (level != 0)
                System.out.println("Level of " + x + " is "
                        + tree.getLevel(tree.root, x));
            else
                System.out.println(x + " is not present in tree");
        }
    }
}
