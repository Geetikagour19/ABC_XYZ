package abc.xyz.Arrays;

public class RotaionCount {

	static int countRotations(int arr[], int low, int high){
		if(low>high)
			return 0;
		if(low==high)
			return low;
		int mid = (low+high)/2;
		if(mid<high && arr[mid+1]<arr[mid])
			return mid+1;
		if(mid>low && arr[mid] <arr[mid-1])
			return mid;
		if(arr[high] > arr[mid])
			return countRotations(arr, low, mid-1);
		return countRotations(arr, mid+1, high);
	}
	 public static void main (String[] args) 
	    {
	        int arr[] = {15, 18, 2, 3, 6, 12};
	        int n = arr.length;
	         
	        System.out.println(countRotations(arr, 0, n-1));
	    }
}
