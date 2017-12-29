package abc.xyz.Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import java.util.Iterator;

public class StackUsingQueue {
 
	Queue<Integer> q;
	Queue<Integer> temp;
	StackUsingQueue(){
		q=new LinkedList<Integer>();
		temp=new LinkedList<Integer>();
	}
	
	public void push(int i){
		if(q.isEmpty())
			q.add(i);
		else{
			int l = q.size();
			for(int j=0;j<l;j++)
				temp.add(q.remove());
			q.add(i);
			for(int k =0;k<l;k++)
				q.add(temp.remove());
		}
	}
	public int pop(){
        if(q.size()==0)
            throw new NoSuchElementException("Underflow Exception");
        return q.remove();
    }
    
    public int peek(){
        if(q.size()==0)
            throw new NoSuchElementException("Underflow Exception");
        return q.peek();
    }
    
    public int getSize(){
        return q.size();
    }
    
    public void display(){
        System.out.print("\nStack = ");
        int l = getSize();
        if (l == 0)
            System.out.print("Empty\n");
        else
        {
            Iterator it = q.iterator();
            while (it.hasNext())
                System.out.print(it.next()+" ");
            System.out.println();
        }
    }
	
	public static void main(String[] args){
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.pop();
        System.out.println("\nPeek-Element : "+stack.peek());
        stack.display();
    }
}
