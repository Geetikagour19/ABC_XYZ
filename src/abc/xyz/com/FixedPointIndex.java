package abc.xyz.com;

public class FixedPointIndex {
	static int linearSearch(int arr[], int n){
		for(int i=0;i<n;i++){
			if(arr[i]==i)
				return i;
		}
		return -1;
	}
	
	static int binarySearch(int arr[], int low, int high){
		if(high>=low){
			int mid = (low+high)/2;
			if(mid==arr[mid])
				return mid;
			if(mid>arr[mid])
				return binarySearch(arr, (mid+1), high);
			else
				return binarySearch(arr, low, (mid-1));
		}
		return -1;
	}
	public static void main(String args[])
	{
        int arr[] = {-10, -1, 0, 3, 10, 11, 30, 50, 100};
        int n = arr.length;
        System.out.println("Fixed Point is "+ linearSearch(arr, n));
        System.out.println("Fixed Point is "+ binarySearch(arr, 0, n-1));
    }
}
