package abc.xyz.Arrays;

import java.util.HashMap;

public class FIndMajorityEle {

	static void findMajority(int arr[]){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i =0;i<arr.length;i++){
			if(hm.containsKey(arr[i])){
				int count = hm.get(arr[i])+1;
				if(count>arr.length/2)
					System.out.println("Majority Found : "+arr[i]);
				else hm.put(arr[i], count);
			}
			else
				hm.put(arr[i], 1);
		}
	}
	
	 public static void main(String[] args) 
	    {
	        int a[] = new int[]{2,2,2,2,5,5,2,3,3};
	         
	        findMajority(a);
	    }
}
