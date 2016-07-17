package br.com.crackingTheCodingInterviews.chapter03.question04;

public class Question04 {
	
	public static void main(String[] args) {
		Tower init = new Tower(1);
		Tower buffer = new Tower(2);
		Tower dest = new Tower(3);
		init.addDisk(5);
		init.addDisk(4);
		init.addDisk(3);
		init.addDisk(2);
		init.addDisk(1);
		System.out.println(init);
		System.out.println(buffer);
		System.out.println(dest);
		System.out.println("Movendo discos");
		init.moveDisks(5, dest, buffer);
		System.out.println(init);
		System.out.println(buffer);
		System.out.println(dest);
	}

}
