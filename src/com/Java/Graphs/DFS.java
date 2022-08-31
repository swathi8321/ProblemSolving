package com.Java.Graphs;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Stack;

public class DFS {
	private boolean[] marked;
	private int[] edgeTo;
	private int s;
	
	public DFS(Graph g,int s) {
		marked = new boolean[g.V()];
		edgeTo = new int[g.E()];
		depthFirstSearch(g,0);
	}
	
	

	private void depthFirstSearch(Graph g, int v) {
		marked[v] = true;
		 System.out.print(v + " ");
		for(int w:g.adj(v)) {
			if(!marked[w]) {
				depthFirstSearch(g,w);
				edgeTo[w]=v;
			}
		}
	}

	public boolean hasPathTo(int V) {
		return marked[V];
	}
	
	public Iterable<Integer> pathTo(int v){
		if(hasPathTo(v)) {
			return null;
		}
		Stack<Integer> path = new Stack<Integer>();
		for(int x=v;x!=s;x=edgeTo[x]) {
			path.push(x);
		}
		path.push(s);
		return path;
	}

	public static void main(String[] args) {
		  Graph g = new Graph(6);
		  
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 0);
	        g.addEdge(1, 3);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 4);
	        g.addEdge(3, 5);
	        g.addEdge(4, 3);
	        g.addEdge(5, 3);
	 
	        System.out.println(
	            "Following is Depth First Traversal: ");
	 
	        DFS d = new DFS(g,6);
	        

	}

}
