package br.com.crackingTheCodingInterviews.chapter01.question05;

public class Question05 {
	
	public static String compress(String str) {
		int count = 1;
		Character temp = null;
		StringBuffer buffer = new StringBuffer();
		for (int i = 0;i<str.length();i++) {
			Character cr = str.charAt(i);
			if (temp==null) {
				temp = cr;
				buffer.append(cr);
			} else if (cr != null && cr == temp){
				count++;
			} else if (cr != null && cr != temp) {
				buffer.append(count);
				buffer.append(cr);
				temp = cr;
				count = 1;
			}
			
		}
		buffer.append(count);
		if (buffer.length() > str.length())
			return str;
		return buffer.toString();
	}
	
	public static void main(String[] args) {
		String str = "abbccccccdeee";
		System.out.println(compress(str));
	}

}
