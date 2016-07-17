package br.com.crackingTheCodingInterviews.chapter02.question06;

import br.com.main.datastructures.linkedlist.LinkedList;
import br.com.main.datastructures.linkedlist.LinkedListNode;

public class Question06 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insert(1);
		LinkedListNode<Integer> nodeLoop = list.insert(31);
		list.insert(6);
		LinkedListNode<Integer> endLoop = list.insert(30);
		endLoop.setNext(nodeLoop);
		LinkedListNode<Integer> node = findLoop(list);
		System.out.println(node.getValue());
	}

	private static LinkedListNode<Integer> findLoop(LinkedList<Integer> list) {
		LinkedListNode<Integer> slow = null;
		LinkedListNode<Integer> fast = null;
		if (list.getRoot() != null) {
			slow = list.getRoot();
		}
		if (list.getRoot() != null) {
			fast = list.getRoot();
		}

		while (slow != null && fast != null) {
			slow = slow.getNext();
			fast = fast.getNext();
			if (fast != null) 
				fast = fast.getNext();
			if (slow == fast) break;
		}
		fast = list.getRoot();
		while (slow != null && fast != null) {
			slow = slow.getNext();
			fast = fast.getNext();
			if (slow == fast) break;
		}
		return fast;
	}
	
}
