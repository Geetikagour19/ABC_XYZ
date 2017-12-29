package abc.xyz.Arrays;

import java.util.Arrays;

public class CountTriplets {

	static int countTriplets(int arr[], int n , int sum){
		Arrays.sort(arr);
		int count =0;
		for(int i = 0; i<n-2;i++){
			int j= i+1, k=n-1;
			while(j<k){
				if(arr[i]+arr[j]+arr[k]>=sum)
					k--;
				else{
					count+=k-j;
					j++;
				}
			}
			
				
		}
		return count;
	}
	public static void main(String[] args) 
    {
		int arr[] = new int[]{5, 1, 3, 4, 7};
        int sum = 12; 
        System.out.println(countTriplets(arr,arr.length, sum));
    }
}
