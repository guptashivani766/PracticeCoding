package com.programs;
import java.util.*;

public class DetectCycleGraph {
	static class Edge{
		int src;
		int dest;
		public Edge(int src,int dest) {
			this.src=src;
			this.dest=dest;
		}
	}
	public static void createGraph(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]= new ArrayList<>();
		}
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,2));
		
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,3));
		
		graph[2].add(new Edge(2,1));
		graph[2].add(new Edge(2,4));
		
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,4));
		graph[3].add(new Edge(3,5));
		
		graph[4].add(new Edge(4,2));
		graph[4].add(new Edge(4,3));
		graph[4].add(new Edge(4,5));
		
		graph[5].add(new Edge(5,3));
		graph[5].add(new Edge(5,4));
		graph[5].add(new Edge(5,6));
		
//		graph[0].add(new Edge(0,1));
//		graph[0].add(new Edge(0,2));
//		
//		graph[1].add(new Edge(1,0));
//		graph[1].add(new Edge(1,3));
//		
//		graph[2].add(new Edge(2,0));
//		graph[2].add(new Edge(2,4));
//		graph[2].add(new Edge(2,6));
//		
//		graph[3].add(new Edge(3,1));
//		
//		graph[4].add(new Edge(4,2));
//		
//		graph[6].add(new Edge(6,2));
		
		
		
		
		
	}
	
	public static boolean detectCycle(ArrayList<Edge> []graph) {
		boolean vis[]=new boolean[graph.length];
		for(int i=0;i<graph.length;i++) {
			if(!vis[i]) {
				if(detectCycleUtil(graph,vis,i,-1)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean detectCycleUtil(ArrayList<Edge> [] graph, boolean []vis, int curr, int par) {
		vis[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			Edge e = graph[curr].get(i);
			if(!vis[e.dest] ) {
				if(detectCycleUtil(graph,vis,e.dest,curr)){
					return true;
				}
				
			}
			else if(vis[e.dest] && e.dest!=par) {
				return true;
			}
		}
		return false;
	}
	 

	public static void main(String[] args) {
		int v=7;
		ArrayList<Edge> graph[]=new ArrayList[v];
		createGraph(graph);
		
		System.out.println(detectCycle(graph));
	}

}
