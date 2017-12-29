package abc.xyz.Stack;

import java.util.Stack;

public class ReverseStack {

	static Stack<Character> st = new Stack<>();
	static void insertAtBottom(char x){
			if(st.isEmpty())
				st.push(x);
			else
			{
				char a = st.pop();
				insertAtBottom(x);
				st.push(a);
			}
	}
	static void revers(){
		if(!st.isEmpty()){
			char x = st.pop();
			revers();
			insertAtBottom(x);
		}
	}
	public static void main(String[] args) 
    {
         //push elements into the stack
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
         
        System.out.println("Original Stack");
         
        System.out.println(st);
         
        //function to reverse the stack
        revers();
         
        System.out.println("Reversed Stack");
         
        System.out.println(st);
    }
}
