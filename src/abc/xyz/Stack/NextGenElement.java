package abc.xyz.Stack;

import java.util.Stack;

public class NextGenElement {

	static void printNGE(int arr[], int n){
		Stack<Integer> s = new Stack<Integer>();
		int i = 0;
		int element, next;
		s.push(arr[0]); 
		
		for(i=1;i<n;i++){
			next = arr[i];
			if(!s.isEmpty()){
				element = s.pop();
				while(element < next){
					System.out.println(element + "----> "+ next);
					if(s.isEmpty())
						break;
					element = s.pop();
				}
				if(element>next)
					s.push(element);
			}
			s.push(next);
		}
		while(!s.isEmpty()){
			element = s.pop();
			next = -1;
			System.out.println(element + "----> "+ next);
		}
	}
	public static void main(String[] args) 
    {
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        printNGE(arr, n);
    }
}
