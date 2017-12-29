package abc.xyz.Stack;

import java.util.Stack;

public class BalancedParentheses {
  
	static boolean isMatchingPair(char a, char b){
		if(a=='{' && b=='}')
			return true;
		else if(a=='[' && b==']')
			return true;
		else if(a=='(' && b==')')
			return true;
		else
			return false;
	}
	static boolean areParenthesisBalanced(char arr[]){
		Stack<Character> s = new Stack<Character>();
		for(int i = 0; i<arr.length;i++){
			if(arr[i]=='{' || arr[i]=='[' || arr[i]=='(')
				s.push(arr[i]);
			if(arr[i]=='}' || arr[i]==']' || arr[i]==')'){
				if(s.isEmpty())
					return false;
				else if(!isMatchingPair(s.pop(),arr[i]))
					return false;
				
			}
		}
		if(s.isEmpty())
			return true;
		else
			return false;
	}
	 public static void main(String[] args) 
	    {
	        char exp[] = {'{','(',')','}','[',']'};
	          if (areParenthesisBalanced(exp))
	            System.out.println("Balanced ");
	          else
	            System.out.println("Not Balanced ");  
	    }
}
