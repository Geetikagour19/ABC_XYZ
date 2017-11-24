package abc.xyz.com;

import java.util.Stack;

public class PrintPreviousSmallerTest {

static void preSmaller(int arr[]){
	System.out.print("_,");
	for(int i=1;i<arr.length;i++){
		int j ;
		for(j =i;j>=0;j--){
			if(arr[j]<arr[i]){
				System.out.print(arr[j]+",");
				break;
			}
			
		}
		if(j==-1)
			System.out.print("_,");
	}
	System.out.println("f1");
}

static void preSmallerUsingStack(int arr1[]){
	Stack<Integer> S= new Stack<Integer>();
	for(int i=0;i<arr1.length;i++){
		while(!S.empty() && S.peek()>=arr1[i])
			S.pop();
			if(S.empty())
				System.out.print("_,");
			else
				System.out.print(S.peek()+",");
			S.add(arr1[i]);
		
	}
	System.out.println("F2");
}

public static void main(String args[]){
	System.out.println("Hello");
	int arr[] = {1, 3, 0, 2, 5};
    preSmaller(arr);
    int arr1[] = {1, 3, 0, 2, 5};
    preSmallerUsingStack(arr1);
    System.out.println("Bye");
}
}
