package abc.xyz.Stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class SortStackRecursion {
	static void sortedInsert(Stack<Integer> s, int x){
		if(s.isEmpty() || x>s.peek()){
			s.push(x);
			return;
		}
		int temp = s.pop();
		sortedInsert(s,x);
		s.push(temp);
	}
    static void sortStack(Stack<Integer> s){
    	if(!s.isEmpty()){
    		int x = s.pop();
        	sortStack(s);
        	sortedInsert(s,x);
    	}
    		
    }
	static void printStack(Stack<Integer> s){
		Iterator<Integer> lt = s.iterator();
        
	       // forwarding
	       while(lt.hasNext())
	           
	        
	       // printing from top to bottom
	      
	           System.out.print(lt.next()+" ");
	}
	 public static void main(String[] args) 
	    {
	        Stack<Integer> s = new Stack<>();
	        s.push(30);
	        s.push(-5);
	        s.push(18);
	        s.push(14);
	        s.push(-3);
	      
	        System.out.println("Stack elements before sorting: ");
	        printStack(s);
	      
	        sortStack(s);
	      
	        System.out.println(" \n\nStack elements after sorting:");
	        printStack(s);
	      
	    }
}
