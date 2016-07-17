package br.com.crackingTheCodingInterviews.chapter02.question02;

import java.math.BigDecimal;

import br.com.main.datastructures.linkedlist.LinkedList;
import br.com.main.datastructures.linkedlist.LinkedListNode;

public class Question02 {
	
	private static int counter = 0;
	
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		linkedList.insert(4);
		linkedList.insert(5);
		System.out.println(linkedList.toString());
		System.out.println();
		LinkedListNode<Integer> kth = findKthElement(linkedList.getRoot(), 4);
		System.out.println(kth.getValue());
	}

	private static LinkedListNode<Integer> findKthElement(LinkedListNode<Integer> head, int k) {
		if (head == null) {
			return null;
		}
		LinkedListNode<Integer> node = findKthElement(head.getNext(), k);
		counter++;
		if (counter == k)
			return head;
		return node;
		
	}

}
