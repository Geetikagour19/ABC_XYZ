package abc.xyz.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KahnsAlgo {
	private int V;
	private List<Integer> adj[];
	
	KahnsAlgo(int v){
		V=v;
		adj=new ArrayList[v];
		for(int i =0;i<v;++i)
			adj[i]=new ArrayList<Integer>();
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
		
	} 
	
	void topologicalSort()
	{
		int indgree [] = new int[V];
		for(int i =0;i<V;i++)
		{
			ArrayList<Integer> temp = (ArrayList<Integer>) adj[i];
			for(int node : temp)
			{
				indgree[node]++;
			}
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i =0;i<V;i++){
			if(indgree[i]==0)
				q.add(i);
		}
		
		int count =0;
		ArrayList<Integer> topOrder = new ArrayList<Integer>();
		while(!q.isEmpty()){
			int temp = q.poll();
			topOrder.add(temp);
			
			for(int node:adj[temp]){
				if(--indgree[node]==0)
					q.add(node);
			}
			count++;
			
		}
		if(count!=V){
			System.out.println("There exists a cycle in the graph");
            return ;
        }
         
        // Print topological order          
        for(int i : topOrder)
        {
            System.out.print(i+" ");
        }
	}
	
	 public static void main(String args[])
	    {
	        // Create a graph given in the above diagram
		 KahnsAlgo g=new KahnsAlgo(6);
	        g.addEdge(5, 2);
	        g.addEdge(5, 0);
	        g.addEdge(4, 0);
	        g.addEdge(4, 1);
	        g.addEdge(2, 3);
	        g.addEdge(3, 1);
	        System.out.println("Following is a Topological Sort");
	        g.topologicalSort();
	 
	    }
}
