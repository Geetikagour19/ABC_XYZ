package abc.xyz.Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
public class FindCycle {

	private int V;
	private LinkedList<Integer> adj[];
	
	FindCycle(int v){
		V=v;
		adj=new LinkedList[v];
		for(int i =0;i<v;++i)
			adj[i]=new LinkedList<Integer>();
	}
	
	void addEdge(int v , int w){
		adj[v].add(w);
	}
	
	boolean isGraphCyclic(){
		
		boolean visited []= new boolean[V];
		boolean reStack[] = new boolean[V];
		for(int i =0;i<V;i++){
			if(!visited[i]){
			if(isCyclic(i, visited, reStack))
				return true;
		}
		}
		return false;
	}
	
	boolean isCyclic(int v, boolean visited[], boolean reStack[]){
		
		if(!visited[v]){
			visited[v]=true;
			reStack[v]=true;
			
			Iterator<Integer> it = adj[v].listIterator();
			while(it.hasNext()){
				int n = it.next();
				if(!visited[n] && isCyclic(n, visited, reStack))
					return true;
				else{
					if(reStack[n])
						return true;
				}
			}
		}
		
		reStack[v]=false;
		return false;
	}
	public static void main(String args[]) {

		FindCycle g = new FindCycle(7);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Is Graph cyclic = " + g.isGraphCyclic());

		}
}
