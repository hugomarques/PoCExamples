package br.com.crackingTheCodingInterviews.chapter11.question03;

public class Question03 {
	
	
	public static int findNumber(int n, int[] array) {
		return binarySearch(n, array, 0, array.length-1);
	}

	private static int binarySearch(int n, int[] array, int begin, int end) {
		if (begin<end) {
			int middle = (begin+end)/2;
			if (array[middle] == n) 
				return middle;
			if (array[begin] > array[middle]) {
				
			}
		}
		return 0;
	}

}
