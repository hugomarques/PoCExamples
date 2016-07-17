package br.com.crackingTheCodingInterviews.chapter03.question03;

public class Question03 {
	
	public static void main(String[] args) {
		StackOfPlates stackOfPlates = new StackOfPlates(3, 3);
		stackOfPlates.push(1);
		stackOfPlates.push(2);
		stackOfPlates.push(3);
		stackOfPlates.push(4);
		stackOfPlates.push(5);
		stackOfPlates.push(6);
		stackOfPlates.push(7);
		stackOfPlates.push(8);
		stackOfPlates.push(9);
		stackOfPlates.push(10);
		System.out.println(stackOfPlates.getActualStack());
		System.out.println(stackOfPlates.pop());
		System.out.println(stackOfPlates.getActualStack());
		System.out.println(stackOfPlates.pop());
		System.out.println(stackOfPlates.getActualStack());
		System.out.println(stackOfPlates.pop());
		System.out.println(stackOfPlates.getActualStack());
		System.out.println(stackOfPlates.pop());
		System.out.println(stackOfPlates.getActualStack());
		System.out.println(stackOfPlates.pop());
		System.out.println(stackOfPlates.getActualStack());
		System.out.println(stackOfPlates.pop());
		System.out.println(stackOfPlates.getActualStack());
		System.out.println(stackOfPlates.pop());
		System.out.println(stackOfPlates.getActualStack());
		System.out.println(stackOfPlates.pop());
		System.out.println(stackOfPlates.getActualStack());
		System.out.println(stackOfPlates.pop());
		System.out.println(stackOfPlates.getActualStack());
		System.out.println(stackOfPlates.pop());
		System.out.println(stackOfPlates.getActualStack());
	}

}
