package abc.xyz.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class FIndCycleInUniDirectedGraph {

	private int V;
	private LinkedList<Integer> adj[];
	
	FIndCycleInUniDirectedGraph(int v){
		V=v;
		adj=new LinkedList[v];
		for(int i =0;i<v;++i)
			adj[i]=new LinkedList<Integer>();
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
		adj[w].add(v);
	}
	
	boolean isCyclic(){
		boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++){
			if(!visited[i])
				if(isCyclicUtil(i, visited, -1))
					return true;
		}
		return false;
	}
	
	boolean isCyclicUtil(int v, boolean visited[], int parent){
		visited[v]=true;
		Integer n;
		Iterator<Integer> it = adj[v].listIterator();
		while(it.hasNext()){
			n=it.next();
			if(!visited[n]){
				if(isCyclicUtil(n, visited, v))
				return true;
			}
			else if(n!=parent)
				return true;
			
		}
		return false;
	}
	public static void main(String args[])
    {
        // Create a graph given in the above diagram
		FIndCycleInUniDirectedGraph g1 = new FIndCycleInUniDirectedGraph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 0);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        if (g1.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");
 
        FIndCycleInUniDirectedGraph g2 = new FIndCycleInUniDirectedGraph(3);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        if (g2.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");
    }
}
