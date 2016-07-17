package br.com.crackingTheCodingInterviews.chapter01.question01;

import java.util.HashMap;
import java.util.Map;

public class Question01 {
	
	public static void main(String[] args) {
		System.out.println("ABCDE*&^%a is unique? "+hasUniqueChars("ABCDE*&^%a" ));
		System.out.println("ABCDE*&A^%a is unique? "+hasUniqueChars("ABCDE*&A^%a" ));
		System.out.println(" is unique? "+hasUniqueChars("" ));
	}
	
	public static boolean hasUniqueChars(String str) {
		Map<Character, Integer> occurencesMap = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++ ) {
			char cr = str.charAt(i);
			if (occurencesMap.get(cr) != null)
				return false;
			else
				occurencesMap.put(cr, 1);
		}
		return true;
	}

}
