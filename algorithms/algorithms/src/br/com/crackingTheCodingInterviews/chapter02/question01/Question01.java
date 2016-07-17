package br.com.crackingTheCodingInterviews.chapter02.question01;

import java.util.HashMap;
import java.util.Map;

import br.com.main.datastructures.linkedlist.LinkedList;
import br.com.main.datastructures.linkedlist.LinkedListNode;

public class Question01 {
	
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		linkedList.insert(3);
		linkedList.insert(3);
		System.out.println(linkedList.toString());
		System.out.println();
		removeDuplicates(linkedList);
		System.out.println(linkedList.toString());
	}

	private static void removeDuplicates(LinkedList<Integer> linkedList) {
		Map<Integer, Boolean> occurences = new HashMap<Integer, Boolean>();
		LinkedListNode<Integer> node = linkedList.getRoot();
		LinkedListNode<Integer> previous = null;
		while ( node != null) {
			if (occurences.containsKey(node.getValue())) {
				previous.setNext(node.getNext());
			} else {
				occurences.put(node.getValue(), true);
				previous = node;
			}
			node = node.getNext();
		}
	}
	
	

}
