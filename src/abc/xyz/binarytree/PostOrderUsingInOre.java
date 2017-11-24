package abc.xyz.binarytree;

public class PostOrderUsingInOre {
	
	static int search(int arr[], int x, int n){
		for(int i =0; i<n;i++){
			if(arr[i] == x)
				return i;
		}
		return -1;
	}
	static void printPostOrder(int in[], int pre[], int n){
		int startIndex = search(in, pre[0],n);
		
		if(startIndex != 0){
		//	printPostOrder(in, , startIndex);
		}
	}
 public static void main(String args[]){
	int in[] = {4, 2, 5, 1, 3, 6};
	   int pre[] =  {1, 2, 4, 5, 3, 6};

	   System.out.println("Postorder traversal ");
	   printPostOrder(in, pre, in.length);
 } 
}
