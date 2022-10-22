package com.programs;

public class DisjointSetUnion {
	static class Edge{
		int src;
		int dest;
		int wt;
		public Edge(int s, int d, int wt) {
			this.src=s;
			this.dest=d;
			this.wt=wt;
		}
	}
	static int n=7;
	static int par[]= new int [n];
	static int rank[]=new int[n];
	public static void init() {
		for(int i=0;i<par.length;i++) {
			par[i]=i;
		}
	}
	public static int find(int x) {
		if(x==par[x]) {
			return x;
		}
		return par[x]=find(par[x]);
	}
	public static void union(int a,int b) {
		int parA= find(a);
		int parB=find(b);
		if(rank[parA] == rank[parB]) {
			par[parB]=parA;
			rank[parA]++;
		}
		else if(rank[parA]>rank[parB]){
			par[parB]=parA;
		}
		else {
			par[parA]=parB;
		}
	}

	public static void main(String[] args) {
		init();
		union(1,3);
		System.out.println(find(3));
		union(2,5);
		System.out.println(find(2));
		union(1,2);
		System.out.println(find(2));

	}

}
