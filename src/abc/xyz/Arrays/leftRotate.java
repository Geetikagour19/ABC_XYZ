package abc.xyz.Arrays;

public class leftRotate {

	static void leftRotateArr(int arr[], int k){
		int n = arr.length;
		reverseArray(arr, 0, k-1);
		reverseArray(arr, k, n-1);
		reverseArray(arr, 0, n-1);
	}
	
	static void reverseArray(int arr[], int start, int end){
		int temp;
		while(start<end){
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
 
    /* Driver program to test above functions */
    public static void main (String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        leftRotateArr(arr, 2); // Rotate array by 2
        printArray(arr);
    }
}
