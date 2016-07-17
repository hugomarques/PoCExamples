package br.com.crackingTheCodingInterviews.chapter02.question04;

import br.com.main.datastructures.linkedlist.LinkedList;
import br.com.main.datastructures.linkedlist.LinkedListNode;

public class Question04 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insert(1);
		list.insert(12);
		list.insert(3);
		list.insert(13);
		list.insert(2);
		list.insert(31);
		list.insert(4);
		list.insert(20);
		list.insert(5);
		list.insert(112);
		list.insert(6);
		list.insert(30);
		System.out.println(list);
		list = partition(10, list);
		System.out.println(list);
	}
	
	public static LinkedList<Integer> partition(int n, LinkedList<Integer> original) {
		LinkedList<Integer> result = new LinkedList<Integer>();
		LinkedList<Integer> lesser = new LinkedList<Integer>();
		LinkedList<Integer> greater = new LinkedList<Integer>();
		LinkedListNode<Integer> node = original.getRoot();
		while (node != null) {
			if (node.getValue() <= n) lesser.insert(node.getValue());
			else greater.insert(node.getValue());
			node = node.getNext();
		}
		node = lesser.getRoot();
		while (node != null) {
			result.insert(node.getValue());
			node = node.getNext();
		}
		result.insert(n);
		node = greater.getRoot();
		while (node != null) {
			result.insert(node.getValue());
			node = node.getNext();
		}
		return result;
	}

}
