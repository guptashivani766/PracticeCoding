package com.programs;

public class KnapsackProblemII {
	public static int knapsack2(int []val,int []wt,int W) {
		int n=wt.length;
		int dp[][]=new int [n+1][W+1];
		//initialize
		for(int i=0;i<n+1;i++) {
			dp[i][0]=0;
		}
		for(int j=0;j<W+1;j++) {
			dp[0][j]=0;
		}
		//bottom-up filling
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<W+1;j++) {
				//valid
				if(wt[i-1]<=j) {
					dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
				}
				//invalid
				else {
					dp[i][j]= dp[i-1][j];
				}
			}
		}
		return dp[n][W];
		
	}

	public static void main(String[] args) {
		int val[]= {15,14,10,45,30};
		int wt[]= {2,5,1,3,4};
		int W=7;
		System.out.println(knapsack2(val,wt,W));

	}

}
