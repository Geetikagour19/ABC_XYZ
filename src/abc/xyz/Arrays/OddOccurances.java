package abc.xyz.Arrays;

import java.util.HashMap;

public class OddOccurances {

	static int getOddOccurrence(int arr[], int n){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++){
			if(hm.containsKey(arr[i])){
				int val = hm.get(arr[i]);
				hm.put(arr[i], val+1);
			}
			else
				hm.put(arr[i], 1);
		}
		for(int a : hm.keySet()){
			
			if(hm.get(a)%2!=0)
				return a;
			
		}
		return -1;
	}
	public static void main(String[] args) 
    {
        int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int n = arr.length;
        System.out.println(getOddOccurrence(arr, n));
    }
}
