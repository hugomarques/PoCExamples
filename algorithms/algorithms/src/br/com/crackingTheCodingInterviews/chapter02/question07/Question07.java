package br.com.crackingTheCodingInterviews.chapter02.question07;

import br.com.main.datastructures.linkedlist.LinkedList;
import br.com.main.datastructures.linkedlist.LinkedListNode;

public class Question07 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insert(1);
		list.insert(2);
		list.insert(0);
		list.insert(2);
		list.insert(1);
		System.out.println(list);
		boolean isPalindrome = isPalindrome(list, 5);
		System.out.println(isPalindrome?"ƒ palindromo":"N‹o Ž palindromo");
		list = new LinkedList<Integer>();
		list.insert(1);
		list.insert(2);
		list.insert(0);
		list.insert(0);
		list.insert(2);
		list.insert(1);
		System.out.println(list);
		isPalindrome = isPalindrome(list,6);
		System.out.println(isPalindrome?"ƒ palindromo":"N‹o Ž palindromo");
		list = new LinkedList<Integer>();
		list.insert(1);
		list.insert(2);
		list.insert(0);
		list.insert(0);
		list.insert(2);
		list.insert(1);
		list.insert(3);
		System.out.println(list);
		isPalindrome = isPalindrome(list,7);
		System.out.println(isPalindrome?"ƒ palindromo":"N‹o Ž palindromo");
	}

	private static boolean isPalindrome(LinkedList<Integer> list,int count) {
		Result res = isPalindrome(list.getRoot(), count);
		return res.result;
	}
	
	private static Result isPalindrome(LinkedListNode<Integer> node, int counter) {
		if (counter == 0 || node == null)
			return new Result(null, true);
		if (counter == 1)
			return new Result(node.getNext(), true);
		if (counter == 2)
			return new Result(node.getNext().getNext(), node.getValue() == node.getNext().getValue());
		Result res = isPalindrome(node.getNext(), counter - 2);
		if (!res.result || res.node == null)
			return res;
		else
			res.result = node.getValue() == res.getNode().getValue();
			res.node = res.getNode().getNext();
		return res;
	}
	
}

class Result {
	LinkedListNode<Integer> node;
	boolean result;
	
	public Result(LinkedListNode<Integer> node, boolean result) {
		this.node = node;
		this.result = result;
	}

	public LinkedListNode<Integer> getNode() {
		return node;
	}

	public void setNode(LinkedListNode<Integer> node) {
		this.node = node;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	
}
