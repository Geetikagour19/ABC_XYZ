package abc.xyz.binarytree;

import java.util.Arrays;

public class PostOrderUsingInOre {
	
	static int search(int arr[], int x, int n){
		for(int i =0; i<n;i++){
			if(arr[i] == x)
				return i;
		}
		return -1;
	}
	static void printPostOrder(int in[], int pre[], int n){
		int index = search(in, pre[0],n);
		
		int tempIn[], tempPre[];
		if(index != 0){
			tempPre = Arrays.copyOfRange(pre, 1 , pre.length);
			printPostOrder(in, tempPre, index);
		//	printPostOrder(in, , startIndex);
		}
		
		if(index != n-1){
			tempPre = Arrays.copyOfRange(pre, index+1, pre.length);
			tempIn = Arrays.copyOfRange(in, index+1, in.length);
			
			printPostOrder(tempIn, tempPre, n-index-1);
			}
		
		System.out.print(pre[0]+" ");
	}
 public static void main(String args[]){
	int in[] = {4, 2, 5, 1, 3, 6};
	   int pre[] =  {1, 2, 4, 5, 3, 6};

	   System.out.println("Postorder traversal ");
	   printPostOrder(in, pre, in.length);
 } 
}
