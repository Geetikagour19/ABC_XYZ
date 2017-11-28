package abc.xyz.BST;

public class TrreNodeHasOnlyOneChild {

	Node root;
	
	boolean hasOnlyOneChild(int pre[], int n){
		int min, max;
		if(pre[n-1]>pre[n-2]){
			max = pre[n-1];
			min = pre[n-2];
			
		}
		else{
			max = pre[n-2];
			min = pre[n-1];
		}
		
		for(int i = n-3; i >= 0; i--){
			if(pre[i] < min)
				min = pre[i];
			else if(pre[i] > max)
				max = pre[i];
			else
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		TrreNodeHasOnlyOneChild tree = new TrreNodeHasOnlyOneChild();
        int pre[] = new int[]{8, 3, 5, 7, 6};
        int size = pre.length;
        if (tree.hasOnlyOneChild(pre, size) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
