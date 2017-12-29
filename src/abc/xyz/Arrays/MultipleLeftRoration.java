package abc.xyz.Arrays;

public class MultipleLeftRoration {

	static void preprocess(int arr[], int n, int temp[]){
		for(int i=0;i<n;i++)
			temp[i]=temp[i+n]=arr[i];
	}
	static void leftRotate(int arr[], int n , int k, int temp[]){
		int start = k%n;
		
		for(int i = start;i<start+n;i++)
			System.out.print(temp[i]+" ");
		System.out.println();
	}
	 public static void main (String[] args)
	    {
	        int arr[] = {1, 3, 5, 7, 9};
	        int n = arr.length;
	      
	        int temp[] = new int[2*n];
	        preprocess(arr, n, temp);
	      
	        int k = 2;
	        leftRotate(arr, n, k, temp);
	      
	        k = 3;
	        leftRotate(arr, n, k, temp);
	      
	        k = 4;
	        leftRotate(arr, n, k, temp);
	    }
}
