package br.com.crackingTheCodingInterviews.chapter01.question03;

import java.util.HashMap;
import java.util.Map;

public class Question03 {
	
	public static void main(String[] args) {
		System.out.println("sapo is permutation of papo? "+isPermutation("sapo",	"papo"));
		System.out.println("sapo is permutation of opas? "+isPermutation("sapo",	"opas"));
		System.out.println("null is permutation of papo? "+isPermutation("null",	"papo"));
		System.out.println("sapo is permutation of null? "+isPermutation("sapo",	"null"));
		System.out.println("sapao is permutation of papa? "+isPermutation("sapao",	"papa"));
		
	}
	
	public static boolean isPermutation(String str1, String str2) {
		if (str1 == null || str2 == null || str1.length() != str2.length())
			return false;
		Map<Character, Integer> occurencesMap = new HashMap<Character, Integer>();
		for(int i=0;i<str1.length();i++ ) {
			char cr = str1.charAt(i);
			occurencesMap.put(cr, 1);
		}
		for(int i=0;i<str2.length();i++ ) {
			char cr = str2.charAt(i);
			if (occurencesMap.get(cr) == null)
				return false;
			else
				occurencesMap.put(cr, occurencesMap.get(cr)-1);
		}
		for (Character cr:occurencesMap.keySet()) {
			Integer quantity = occurencesMap.get(cr);
			if (quantity != 0) {
				return false;
			}
		}
		
		return true;
	}

}
