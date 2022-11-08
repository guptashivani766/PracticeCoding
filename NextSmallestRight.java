package com.programs;

import java.util.Stack;

public class NextSmallestRight {
	public static int [] nextSmallestRight(int []arr, Stack<Integer> s) {
		int [] nextSmallest = new int [arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			//while loop
			while(!s.isEmpty() && arr[s.peek()]>arr[i]) {
				s.pop();
			}
			//if-else
			if(s.isEmpty()) {
				nextSmallest[i]=-1;
			}
			else {
				nextSmallest[i]=arr[s.peek()];
			}
			//push
			s.push(i);
		}
		return nextSmallest;
	}

	public static void main(String[] args) {
		int arr[]= {6,8,0,1,3};
		Stack<Integer> s = new Stack<Integer>();
		int []nextGreaterElement = nextSmallestRight(arr,s);
		for(int i=0;i<nextGreaterElement.length;i++) {
			System.out.print(nextGreaterElement[i]+" ");
		}
		System.out.println();

	}

}
