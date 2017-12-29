package abc.xyz.Queue;
import java.util.Stack;

public class QueueUsingStack {
	static class Queue{
		Stack<Integer> s1;
		Stack<Integer> s2;
	}
	
	static void push(Stack<Integer> top_ref, int data){
		top_ref.push(data);
	}
	static int pop(Stack<Integer> top_ref){
		if(top_ref.isEmpty()){
			System.out.println("STack Overflow");
			System.exit(0);
		}
		return top_ref.pop();
	}
	
	static void enQueue(Queue q, int x){
		push(q.s1, x);
	}
	
	static int deQueue(Queue q){
		int x;
		if(q.s1.isEmpty() && q.s2.isEmpty()){
			System.out.println("Q is Empty");
			System.exit(0);
		}
		if(q.s2.isEmpty()){
			while(!q.s1.isEmpty()){
				x=pop(q.s1);
				push(q.s2,x);
			}
		}
		x=pop(q.s2);
		return x;
	}
	public static void main(String args[]) 
    {
        /* Create a queue with items 1 2 3*/
        Queue q= new Queue();
        q.s1 = new Stack<>();
        q.s2 = new Stack<>();
        enQueue(q, 1);
        enQueue(q, 2);
        enQueue(q, 3);
         
        /* Dequeue items */
        System.out.print(deQueue(q)+" ");
        System.out.print(deQueue(q)+" ");
        System.out.println(deQueue(q)+" ");
    }
}
