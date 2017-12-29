package abc.xyz.Arrays;

import java.util.HashMap;

public class  SubArray_equal0s1s{

	int maxLen(int arr[], int n){
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int sum =0;
		int max_len=0;
		int ending_index=-1;
		
		for(int i =0;i<n;i++)
			arr[i]=(arr[i]==0?-1:1);
		for(int i=0;i<n;i++){
			sum+=arr[i];
			if(sum==0){
				max_len=i+1;
				ending_index=i;
			}	
			if(hm.containsKey(sum)){
				if(max_len < i-hm.get(sum+n)){
					max_len=i-hm.get(sum+n);
					ending_index=i;
				}
			}
			else{
				hm.put(sum+n, i);
			}
			
		}
		for(int i=0;i<n;i++)
			arr[i]=(arr[i]==-1?0:1);
		int start = ending_index-max_len+1;
		System.out.println(start +" to "+ ending_index);
		return max_len;
	}
	
	
	 public static void main(String[] args) 
	    {
		 SubArray_equal0s1s sub = new SubArray_equal0s1s();
	        int arr[] = {1, 0, 0, 1, 0, 1, 1};
	        int n = arr.length;
	 
	        sub.maxLen(arr, n);
	    }
}
