package com.programs;
import java.util.*;
public class CreateGraph {
		static class Edge{
			int src;
			int dest;
			public Edge(int s,int d) {
				src=s;
				dest=d;
			}
		}
		public static void createGraph(ArrayList<Edge> graph[]) {
			for(int i=0;i<graph.length;i++) {
				graph[i]=new ArrayList<>();
			}
			graph[0].add(new Edge(0,1));
			
			graph[1].add(new Edge(1,0));
			graph[1].add(new Edge(1,2));
			graph[1].add(new Edge(1,3));
			
			graph[2].add(new Edge(2,1));
			graph[2].add(new Edge(2,3));
			graph[2].add(new Edge(2,4));
			
			graph[3].add(new Edge(3,1));
			graph[3].add(new Edge(3,2));
			
			graph[4].add(new Edge(4,2));
			
			for(int i=0;i<graph[2].size();i++) {
		       System.out.print(graph[2].get(i).dest);
			  
			}
		}

		public static void main(String[] args) {
			int v=5;
			ArrayList<Edge> graph[]=new ArrayList[v];
			createGraph(graph);

		}

	}
