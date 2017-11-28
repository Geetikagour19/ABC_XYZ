package abc.xyz.binarytree;

import java.util.Stack;
class NodeChar {
	 
    char value;
    NodeChar left, right;
 
    NodeChar(char data) {
        value = data;
        left = right = null;
    }
}
public class ExpressionTree {

	NodeChar root;
	
	boolean isOperator(char c){
		if(c == '+' || c == '-' || c == '*' || c == '/' || c=='^')
			return true;
		return false;
	}
	
	NodeChar constructTree(char charArr[]){
		Stack<NodeChar> s = new Stack<NodeChar>();
		NodeChar t, t1, t2;
		
		for(int i =0; i< charArr.length;i++){
			if(!isOperator(charArr[i])){
				t = new NodeChar(charArr[i]);
				s.push(t);
			}
			else{
				t = new NodeChar(charArr[i]);
				
				t1 = s.pop();
				t2 = s.pop();
				t.right = t1;
				t.left = t2;
				
				s.push(t);
				
			}
			
		}
		t=s.peek();
		s.pop();
		return t;
	}
	void inorder(NodeChar node){
		if(node==null) return;
		inorder(node.left);
		System.out.print(node.value +" ");
		inorder(node.right);
	}
	
	 public static void main(String args[]) {
		 
	        ExpressionTree et = new ExpressionTree();
	        String postfix = "ab+ef*g*-";
	        char[] charArray = postfix.toCharArray();
	        NodeChar root = et.constructTree(charArray);
	        System.out.println("infix expression is");
	        et.inorder(root);
	 
	    }
}
