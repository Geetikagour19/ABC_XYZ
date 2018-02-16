package abc.xyz.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

	private int V;
	private LinkedList<Integer> adj[];
	
	DFS(int v){
		V=v;
		adj=new LinkedList[v];
		for(int i =0;i<v;++i)
			adj[i]=new LinkedList<Integer>();
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	void DFSUtil(int s, boolean visited[]){
		visited[s]=true;
		System.out.print(s+" ");
		
		Iterator<Integer> it = adj[s].listIterator();
		while(it.hasNext()){
			int n = it.next();
			if(!visited[n])
				DFSUtil(n, visited);
		}
	}
	void DFSTraversal(int s){
		boolean visited[]=new boolean[V];
		DFSUtil(s, visited);
	}
	
	public static void main(String args[])
    {
        DFS g = new DFS(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
 
        g.DFSTraversal(2);
    }
}
