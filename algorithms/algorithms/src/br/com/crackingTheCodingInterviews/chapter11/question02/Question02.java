package br.com.crackingTheCodingInterviews.chapter11.question02;

import java.util.Arrays;
import java.util.Comparator;

public class Question02 {
	
	public static void main(String[] args) {
		String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
		sortAnagrams(array);
		for (String i:array)
			System.out.print(i+",");
	}
	
	public static void sortAnagrams(String[] array) {
		Arrays.sort(array, new AnagramComparator());
	}

}


class AnagramComparator implements Comparator<String> {
	
	public String sortString(String s) {
		char[] cs = s.toCharArray();
		Arrays.sort(cs);
		return new String(cs);
	}

	@Override
	public int compare(String s1, String s2) {
		return sortString(s1).compareTo(sortString(s2));
	}
	
	
}