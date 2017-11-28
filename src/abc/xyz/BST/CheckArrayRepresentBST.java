package abc.xyz.BST;

public class CheckArrayRepresentBST {

	static boolean isInorder(int arr[], int n){
		if(n==0 || n ==1)
			return true;
		for(int i = 1; i< n; i++){
			if(arr[i-1] > arr[i])
				return false;
		}
		return true;
	}
	
	public static void main(String args[]){
		
		int arr[] = { 19, 23, 25, 30, 45 };
		if(isInorder(arr, arr.length)==true)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
