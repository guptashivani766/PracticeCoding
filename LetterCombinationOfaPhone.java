package com.programs;
import java.util.*;

public class LetterCombinationOfaPhone {

	public static List<String> letterCombination(String digits){
		String [] digitLetter= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		List<String> result = new ArrayList<String>();
		if(digits.length()==0) {
			return result;
		}
		result.add("");
		for(int i=0;i<digits.length();i++) {
			result = combine(digitLetter[digits.charAt(i)-'0'],result);
		}
		return result;
	}
	public static List<String> combine(String digit,List<String> l){
		List<String> result = new ArrayList<String>();
		
		for(int i=0;i<digit.length();i++) {
			for(String x:l)
				result.add(x+digit.charAt(i));
		}
		return result;
	}
	public static void main(String[] args) {
		
		String digits ="23";
		List<String> finalResult = letterCombination(digits);
		System.out.println(finalResult);
	}

}
