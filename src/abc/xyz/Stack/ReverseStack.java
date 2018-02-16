package abc.xyz.Stack;

import java.util.Stack;

public class ReverseStack {

	//static Stack<Character> st = new Stack<>();
	static void insertAtBottom(Stack<Integer> st, int x){
			if(st.isEmpty())
				st.push(x);
			else
			{
				int a = st.pop();
				insertAtBottom(st, x);
				st.push(a);
			}
	}
	static void revers(Stack<Integer> st){
		if(!st.isEmpty()){
			int x = st.pop();
			revers(st);
			insertAtBottom(st,x);
		}
	}
	public static void main(String[] args) 
    {
         //push elements into the stack
		Stack<Integer> st = new Stack<Integer>();
        st.push(5);
        st.push(2);
        st.push(10);
        st.push(4);
         
        System.out.println("Original Stack");
         
        System.out.println(st);
         
        //function to reverse the stack
        revers(st);
         
        System.out.println("Reversed Stack");
         
        System.out.println(st);
    }
}
