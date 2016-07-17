package br.com.crackingTheCodingInterviews.chapter01.question07;


public class Question07 {
	
	public static int[][] zeroMatrix(int[][] matrix) {
		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];
		for (int i = 0;i<matrix.length;i++) {
			for (int j = 0;j<matrix[i].length;j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}
		for (int i = 0;i<matrix.length;i++) {
			for (int j = 0;j<matrix[i].length;j++) {
				if (row[i] == 1) {
					matrix[i][j] = 0;
				}
				if (column[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}
		return matrix;
	}
	
	public static int[][] randomMatrix(int M, int N, int min, int max) {
		int[][] matrix = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = randomIntInRange(min, max);
			}
		}
		return matrix;
	}
	
	public static int randomInt(int n) {
		return (int) (Math.random() * n);
	}
	
	public static int randomIntInRange(int min, int max) {
		return randomInt(max + 1 - min) + min;
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 10 && matrix[i][j] > -10) {
					System.out.print(" ");
				}
				if (matrix[i][j] < 100 && matrix[i][j] > -100) {
					System.out.print(" ");
				}					
				if (matrix[i][j] >= 0) {
					System.out.print(" ");
				}
				System.out.print(" " + matrix[i][j]);				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = randomMatrix(3, 5, 0, 5);
		printMatrix(matrix);
		zeroMatrix(matrix);
		System.out.println();
		System.out.println();
		printMatrix(matrix);
	}

}
