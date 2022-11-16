package com.programs;

import java.util.Arrays;

public class ClimbingStairs {
	public static int countWays(int n) {
		int dp[]= new int [n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<n+1;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		print(dp);
		return dp[n];
	}
	public static void print(int [] dp) {
		for(int i=0;i<dp.length;i++) {
			System.out.print(dp[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int n=10;
		System.out.println(countWays(n));
	}

}
