package com.programs;

import java.util.Stack;

public class NextGreaterLeft {
	public static int [] nextGreaterLeft(int [] arr, Stack<Integer> s) {
		int [] nextGreater = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			//while loop
			while(!s.isEmpty() && arr[s.peek()]<arr[i]) {
				s.pop();
			}
			//if-else
			if(s.isEmpty()) {
				nextGreater[i]=-1;
			}
			else {
				nextGreater[i]=arr[s.peek()];
			}
			//push ----> here we can push the index i of the arr  and not store the value at index i
			s.push(i);
		}
		return nextGreater;
	}

	public static void main(String[] args) {
		int arr[]= {6,8,0,1,3};
		Stack<Integer> s = new Stack<Integer>();
		int []nextGreaterElement = nextGreaterLeft(arr,s);
		for(int i=0;i<nextGreaterElement.length;i++) {
			System.out.print(nextGreaterElement[i]+" ");
		}
		System.out.println();


	}

}
