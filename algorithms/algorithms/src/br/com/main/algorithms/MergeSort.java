package br.com.main.algorithms;

public class MergeSort {

	public static void main(String[] args) {
		int[] l = {10,9,11,7,6};
		sort(l, 0, l.length-1);
		for (int i=0;i<l.length;i++)
			System.out.print(l[i]+",");
		
	}
	
	public static void sort(int[] v, int begin, int end) {
		int[] helper = new int[v.length];
		mergeSort(v, helper, begin, end);
	}
	
	public static void mergeSort(int[] v, int[] helper, int begin,int end) {
		if (begin<end) {
			int middle = (begin+end)/2;
			mergeSort(v, helper, begin, middle);
			mergeSort(v, helper, middle+1, end);
			merge(v, helper, begin, middle, end);
		}
	}

	private static void merge(int[] v, int[] helper, int begin,int middle, int end) {
		for (int i = 0;i<v.length;i++ ) {
			helper[i]=v[i];
		}
		
		int helperLeft = begin;
		int helperRight = middle+1;
		int current = begin;
		
		while (helperLeft<=middle && helperRight<=end) {
			if (helper[helperRight]<=helper[helperLeft]) {
				v[current] = helper[helperRight];
				helperRight++;
			} else {
				v[current] = helper[helperLeft];
				helperLeft++;
			}
			current++;
		}
		
		int remaining = middle - helperLeft;
		for (int i = 0; i<= remaining; i++) {
			v[current+i] = helper[helperLeft+i];
		}
	}
}
