package abc.xyz.Arrays;

import java.util.Arrays;

public class RearrangeMaxMin {

	static void rearrange(int arr[], int n){
		int temp[]=new int[n];
		boolean flag=true;
		int small=0;
		int large=n-1;
		for(int i =0;i<n;i++){
			if(flag)
				temp[i]=arr[large--];
			else
				temp[i]=arr[small++];
			
			flag=!flag;
		}
		for(int i=0;i<n;i++)
			arr[i]=temp[i];
	}
	public static void main(String[] args) 
    {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
         
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));
         
        rearrange(arr,arr.length);
         
        System.out.println("Modified Array ");
        System.out.println(Arrays.toString(arr));
     
    }
}
