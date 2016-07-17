package br.com.crackingTheCodingInterviews.chapter02.question05;

import br.com.main.datastructures.linkedlist.LinkedList;
import br.com.main.datastructures.linkedlist.LinkedListNode;

public class Question05 {
	
	public static void main(String[] args) {
		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
		linkedList1.insert(1);
		linkedList1.insert(0);
		linkedList1.insert(0);
		linkedList1.insert(1);
		System.out.println(linkedList1.toString());
		System.out.println();
		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.insert(9);
		linkedList2.insert(9);
		linkedList2.insert(4);
		System.out.println(linkedList2.toString());
		System.out.println();
		LinkedList<Integer> sum = sum(linkedList1, linkedList2);
		System.out.println(sum.toString());
	}

	private static LinkedList<Integer> sum(LinkedList<Integer> linkedList1,
			LinkedList<Integer> linkedList2) {
		LinkedList<Integer> sum = new LinkedList<Integer>();
		sumNode( sum, linkedList1.getRoot(), linkedList2.getRoot(), 0);
		return sum;
	}

	private static void sumNode(LinkedList<Integer> sumList,
			LinkedListNode<Integer> node1, LinkedListNode<Integer> node2, int carryOver) {
		if (node1 == null && node2== null) return;
		int sum = carryOver;
		if (node1 != null)
			sum += node1.getValue();
		if (node2 != null) 
			sum += node2.getValue();
		carryOver = sum > 9 ? 1 : 0;
		sum = sum > 9 ? sum - 10:sum;
		sumList.insert(sum);
		sumNode(sumList, node1 != null ? node1.getNext() : null, node2 != null? node2.getNext():null, carryOver);
	}

}
