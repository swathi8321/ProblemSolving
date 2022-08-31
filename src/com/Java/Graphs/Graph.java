package com.Java.Graphs;

import java.io.InputStream;
import java.util.LinkedList;

public class Graph {
	
	public LinkedList<Integer> adj[];
	private int V;
	private int E;
	
	public Graph(int v) {
		V = v;
		E = v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i] = new LinkedList<>();
		}
	}
	public void addEdge(int v,int w) {
		adj[v].add(w);
	}
	
	Iterable<Integer> adj(int v){
		return adj[v];
		
	}
	  public int V() {
	        return V;
	    }
	public int E() {
		return E;
	}
	

}
