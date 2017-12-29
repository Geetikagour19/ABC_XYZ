package abc.xyz.Stack;

import java.util.Stack;

public class LongestValidSubString {

	static int findMaxLen(String str){
		int n =str.length();
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(-1);
		int result = 0;
		for(int i=0; i<n;i++){
			if(str.charAt(i)=='(')
				s.push(i);
			else{
				s.pop();
				if(!s.empty())
					result = Math.max(result, i-s.peek());
				else
					s.push(i);
			}
		}
		return result;
	}
	public static void main(String[] args) 
    {
        String str = "((()()";
        System.out.println(findMaxLen(str));
      
        str = "()(()))))";
        System.out.println(findMaxLen(str));
      
    }
}
