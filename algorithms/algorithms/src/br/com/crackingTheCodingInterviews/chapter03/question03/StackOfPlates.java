package br.com.crackingTheCodingInterviews.chapter03.question03;

import java.util.Stack;

public class StackOfPlates {
	
	private Stack<Integer>[] stack;
	private int index = 0;
	private int limit = 0;
	
	public StackOfPlates(int size, int limit) {
		this.stack = new Stack[size];
		this.limit = limit;
		if (stack[index] == null)
			stack[index] = new Stack<Integer>();
	}
	
	public void push(Integer plate) {
		if (stack[index].size() == limit && index != stack.length - 1) {
			addIndex();
			if (stack[index] == null) stack[index] = new Stack<Integer>(); 
		}
		if (index < stack.length && stack[index].size() != limit)
			stack[index].push(plate);
	}
	
	public Integer pop() {
		if (stack[index].isEmpty()) return null;
		Integer plate = stack[index].pop();
		if (stack[index].isEmpty() && index != 0) {
			decreaseIndex();
		}
		return plate;
	}
	
	private void addIndex() {
		this.index++;
	}
	
	private void decreaseIndex() {
		this.index--;
	}
	
	public int getIndex() {
		return index;
	}
	
	public Stack<Integer> getActualStack() {
		return stack[index];
	}

}
