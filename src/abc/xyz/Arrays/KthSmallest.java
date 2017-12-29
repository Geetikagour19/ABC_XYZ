package abc.xyz.Arrays;

import java.util.Arrays;

public class KthSmallest {

	static int kthSmallest(Integer arr[], int k){
		Arrays.sort(arr);
		for(int i =0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
		return arr[k-1];
	}
	  public static void main(String[] args) 
	    {
	        Integer arr[] = new Integer[]{12, 3, 5, 7, 19};
	        int k = 2;
	        System.out.print( "K'th smallest element is "+
	                            kthSmallest(arr, k) );     
	    }
}
