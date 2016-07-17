package br.com.crackingTheCodingInterviews.chapter03.question04;

import java.util.Stack;

public class Tower {
	
	private Stack<Integer> stack;
	private int number;
	
	public Tower(int towerNumber) {
		number = towerNumber;
		stack = new Stack<Integer>();
	}
	
	public int getNumber() {
		return number;
	}



	public void addDisk(Integer disk) {
		if (!stack.isEmpty() && stack.peek() <= disk) 
			throw new IllegalStateException();
		else 
			stack.push(disk);
	}
	
	public void moveTopTo(Tower destination) {
		Integer disk = this.stack.pop();
		destination.addDisk(disk);
	}
	
	/**
	 * Move the disk to destination from this using buffer. 
	 * @param disk
	 * @param destination
	 * @param buffer
	 */
	public void moveDisks(int disk, Tower destination, Tower buffer) {
		if (disk>0) {
			moveDisks(disk-1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(disk-1, destination, this);
			
		}
	}
	
	@Override
	public String toString() {
		return stack.toString();
	}
	

}
