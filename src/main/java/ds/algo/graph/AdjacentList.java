package ds.algo.graph;

import java.util.LinkedList;

//Memory complexity -> O(V+2E) [O]
public class AdjacentList {

	public static void main(String[] args) {
		Graph g=new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.printGraph();
	}
}

class Graph{
	private int v;
	private LinkedList<Integer> adj[];

	
	public Graph(int v){
		this.v=v;
		this.adj=new LinkedList[v];
		
		//Assigning a new linkedlist to all the vertex
		for(int i=0;i<v;i++){
			adj[i]=new LinkedList<Integer>();
			
		}
	}
	
	public void addEdge(int src,int des){
		//undirected
		adj[src].add(des);
		adj[des].add(src);
	}
	
	public void printGraph(){
		for(int i=0;i<adj.length;i++){
			System.out.println(i+"->"+adj[i]);
		}
	}
}
