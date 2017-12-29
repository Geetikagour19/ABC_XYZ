package abc.xyz.Queue;
class QNode{
	int data;
	QNode next;
	
	QNode(int data){
		this.data = data;
		next = null;
	}
}
public class QueueUSingLinkedList {

	QNode front=null, rear=null;
	
	void enqueue(int data){
		QNode temp = new QNode(data);
		if(rear==null){
			front = rear = temp;
			return;
		}
		else{
			rear.next=temp;
			rear=temp;
		}
	}
	
	QNode dequeue(){
		if(front==null)
			return null;
		QNode temp = front;
		front = front.next;
		
		if(front==null){
			rear=null;
			
		}
		return temp;
	}
	 public static void main(String[] args) 
	    {
		 QueueUSingLinkedList q=new QueueUSingLinkedList();
	        q.enqueue(10);
	        q.enqueue(20);
	        q.dequeue();
	        q.dequeue();
	        q.enqueue(30);
	        q.enqueue(40);
	        q.enqueue(50);
	         
	        System.out.println("Dequeued item is "+ q.dequeue().data);
	    }
}
