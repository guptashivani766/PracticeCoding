package com.programs;

public class RemoveAdjacentDublicate {
	public static String removeAdjacentDublicate(String s) {
		StringBuilder sb = new StringBuilder();
		for(char ch : s.toCharArray()) {
			if(sb.length()!=0 && sb.charAt(sb.length()-1)==ch) {
				sb.deleteCharAt(sb.length()-1);
			}
			else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s ="abbaca";
		
		System.out.println(removeAdjacentDublicate(s));

	}

}
