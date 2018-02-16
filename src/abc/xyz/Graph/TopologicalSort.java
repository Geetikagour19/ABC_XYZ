package abc.xyz.Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {

	private int V;
	private LinkedList<Integer> adj[];
	
	TopologicalSort(int v){
		V=v;
		adj= new LinkedList[v];
		for(int i =0;i<v;++i)
			adj[i]=new LinkedList<Integer>();
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	void topologicalSort(){
		Stack<Integer> st = new Stack<Integer>();
		
		boolean visited[]= new boolean [V];
		for(int i =0;i<V;i++){
			if(!visited[i]){
				topologicalSortUtil(i, visited, st);
			}
		}
		
		while(!st.isEmpty()){
			System.out.print(st.pop()+" ");
		}
	}
	
	void topologicalSortUtil(int s, boolean visited[], Stack<Integer> st){
		visited[s] = true;
		int n;
		Iterator<Integer> it = adj[s].listIterator();
		
		while(it.hasNext()){
			n=it.next();
			if(!visited[n]){
				topologicalSortUtil(n , visited, st);
			}
		}
		st.push(new Integer(s));
	}
	
	 public static void main(String args[])
	    {
	        // Create a graph given in the above diagram
		 TopologicalSort g = new TopologicalSort(6);
	        g.addEdge(5, 2);
	        g.addEdge(5, 0);
	        g.addEdge(4, 0);
	        g.addEdge(4, 1);
	        g.addEdge(2, 3);
	        g.addEdge(3, 1);
	 
	        System.out.println("Following is a Topological " +
	                           "sort of the given graph");
	        g.topologicalSort();
	    }
}
