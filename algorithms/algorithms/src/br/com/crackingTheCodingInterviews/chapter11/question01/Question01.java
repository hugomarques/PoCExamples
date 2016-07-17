package br.com.crackingTheCodingInterviews.chapter11.question01;

public class Question01 {
	
	public static void main(String[] args) {
		int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
		int[] b = {1, 4, 7, 6, 7, 7};
		merge(a, b, 8, 6);
		for(int i:a) {
			System.out.print(i+",");
		}
	}
	
	public static void merge(int[] a, int[] b, int lastA, int lastB) {
		int current = lastA+lastB -1;
		int indexA = lastA-1;
		int indexB = lastB-1;
		while(indexB>=0) {
			if (indexA>= 0 && a[indexA]>b[indexB]) {
				a[current] = a[indexA];
				indexA--;
			} else {
				a[current] = b[indexB];
				indexB--;
			}
			current--;
		}
		
	}

}
