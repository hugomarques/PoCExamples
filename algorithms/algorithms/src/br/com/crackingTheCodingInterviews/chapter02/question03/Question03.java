package br.com.crackingTheCodingInterviews.chapter02.question03;

import br.com.main.datastructures.linkedlist.LinkedList;
import br.com.main.datastructures.linkedlist.LinkedListNode;

public class Question03 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		LinkedListNode<Integer> root = list.getRoot();
		System.out.println(list);
		removeNode(root);
		System.out.println(list);
	}
	
	public static void removeNode(LinkedListNode<Integer> node) {
		if (node.getNext() == null) return;
		node.setValue(node.getNext().getValue());
		node.setNext(node.getNext().getNext());
	}

}
