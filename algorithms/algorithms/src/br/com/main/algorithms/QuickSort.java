package br.com.main.algorithms;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] l = {10,9,11,7,6};
		sort(l, 0, l.length-1);
		for (int i=0;i<l.length;i++)
			System.out.print(l[i]+",");
		
	}
	
	public static void sort(int[] array, int begin, int end) {
		if (begin < end) {
			int pivot_index = partition(array, begin, end);
			sort(array, begin, pivot_index);
			sort(array, pivot_index+1, end);
		}
	}

	private static int partition2(int[] v, int begin, int end) {
		int pivot = v[begin];
		int top = begin;
		for (int i = begin + 1; i <= end; i++) {
			if (v[i] < pivot) {
				v[top] = v[i];
				v[i] = v[top + 1];
				top++; 
			}
		}
		v[top] = pivot;
		return top;
	}
	
	private static int partition(int[] v, int begin, int end) {
		int pivot = v[begin];
		while (true) {
			while (v[begin]<pivot) begin++;
			while (v[end]>pivot) end--;
			if (begin<end)
				swap(v, begin, end);
			else
				return begin;
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
