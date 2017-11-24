package abc.xyz.com;

import java.util.HashSet;

public class IsProduct {

static boolean isProduct(int arr[], int x){
	HashSet<Integer> h = new HashSet<Integer>();
	if(arr.length<2)
		return false;
	for(int i=0;i<arr.length;i++){
		if(arr[i]==0){
			if(x==0)
				return false;
			else continue;
			
		}
		if(x%arr[i]==0){
			if(h.contains(x/arr[i]))
				return true;
			h.add(arr[i]);
		}
	}
	return false;
}
public static void main(String args[]){
	int arr[] = {20, 20, 9, 41};
    int x = 400;
    if(isProduct(arr, x))
        System.out.println("Yes"); 
        else
        System.out.println("No");
}
}
