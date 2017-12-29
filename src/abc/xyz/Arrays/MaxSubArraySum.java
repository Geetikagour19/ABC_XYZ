package abc.xyz.Arrays;

public class MaxSubArraySum {

	static int maxSubArraySum(int arr[], int n){
		int curr_sum=arr[0], max_sum=arr[0];
		
		for(int i =1;i<n;i++){
			curr_sum=Math.max(arr[i], curr_sum+arr[i]);
			max_sum=Math.max(curr_sum, max_sum);
		}
		return max_sum;
	}
	
	 public static void main(String[] args)
	    {
	    int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
	    int n = a.length;   
	    int max_sum = maxSubArraySum(a, n);
	    System.out.println("Maximum contiguous sum is "
	                       + max_sum);
	    }
}
