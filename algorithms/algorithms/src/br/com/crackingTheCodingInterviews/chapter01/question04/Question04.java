package br.com.crackingTheCodingInterviews.chapter01.question04;

public class Question04 {
	
	public static void main(String[] args) {
		char[] input = new char[]{'M','r',' ','J','o','h','n',' ','S','m','i','t','h'};
		char[] output = replace(input ); 
		System.out.println("Output lenght: "+output.length);
		for (int i = 0;i<output.length;i++) {
			System.out.print(output[i]+",");
		}
	}
	
	
	public static char[] replace(char[] input) {
		int blank = 0;
		for (int i = 0;i<input.length;i++) {
			if (input[i] == ' ')
				blank++;
		}
		int size = 2*blank + input.length;
		char[] output = new char[size];
		int outputIndex = 0;
		for (int i = 0;i<input.length;i++) {
			if (input[i] == ' ') {
				output[outputIndex] = '%';
				outputIndex++;
				output[outputIndex] = '2';
				outputIndex++;
				output[outputIndex] = '0';
				outputIndex++;
			} else {
				output[outputIndex] = input[i];
				outputIndex++;
			}
		}
		return output;
	}

}
