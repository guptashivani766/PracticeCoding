package com.programs;
import java.util.*;

public class NextGreaterRight {
	public static int [] nextGreaterRight(int [] arr, Stack<Integer> s) {
		int [] nextGreater = new int [arr.length];
		for(int i =arr.length-1;i>=0;i--) {
		//1. while loop
		while(!s.isEmpty() && arr[s.peek()]<=arr[i]) {
			s.pop();
		}
		//2. else if
		if(s.isEmpty()) {
			nextGreater[i]=-1;
		}else {
			nextGreater[i]=arr[s.peek()];
		}
		//3. push
		s.push(i);
		
	}
		 return nextGreater;
	}

	public static void main(String[] args) {
		int arr[]= {6,8,0,1,3};
		Stack<Integer> s = new Stack<Integer>();
		int []nextGreaterElement = nextGreaterRight(arr,s);
		for(int i=0;i<nextGreaterElement.length;i++) {
			System.out.print(nextGreaterElement[i]+" ");
		}
		System.out.println();

	}

}
