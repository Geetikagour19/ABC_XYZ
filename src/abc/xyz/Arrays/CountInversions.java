package abc.xyz.Arrays;

public class CountInversions {

	static int mergeSort(int arr[], int n){
		int temp[] = new int[n];
		return _mergeSort(arr, temp, 0, n-1);
	}
	
	static int _mergeSort(int arr[], int temp[], int left, int right){
		int inv_count=0;
		int mid;
		if(right>left){
			mid=(right+left)/2;
			inv_count=_mergeSort(arr, temp, left, mid);
			inv_count+=_mergeSort(arr, temp, mid+1, right);
			
			inv_count+=merge(arr, temp, left, mid+1, right);
		}
		return inv_count;
	}
	
	static int merge(int arr[], int temp[], int left, int mid, int right){
		int i=left;
		int j=mid;
		int k=left;
		int inv_count=0;
		while(i<=mid-1 && j<=right){
			if(arr[i]<=arr[j])
				temp[k++]=arr[i++];
			else{
				temp[k++]=arr[j++];
			
			inv_count+=(mid-1);
		}
		}		
		while(i<=mid-1)
			temp[k++]=arr[i++];
		while(j<=right)
			temp[k++]=arr[j++];
		
		for(i=left;i<=right;i++)
			arr[i]=temp[i];
		return inv_count;
	}
	 public static void main(String[] args) 
	    {
	        int arr[] = new int[]{1, 20, 6, 4, 5};
	        System.out.println("Number of inversions are " + mergeSort(arr, 5));
	     
	    }
}
