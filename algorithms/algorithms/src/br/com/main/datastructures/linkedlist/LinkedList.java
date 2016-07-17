package br.com.main.datastructures.linkedlist;


public class LinkedList<T> {
	
	private LinkedListNode<T> root;
	private LinkedListNode<T> tail;
	
	public LinkedListNode<T> getRoot() {
		return root;
	}
	
	public LinkedListNode<T> getTail() {
		return tail;
	}
	
	public LinkedListNode<T> insert(T value){
		LinkedListNode<T> node = new LinkedListNode<T>(value);
		if (root == null)
			root = node;
		if (tail == null) {
			tail = node;
		} else {  
			tail.setNext(node);
			tail = node;
		}
		return node;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		LinkedListNode<T> no = getRoot();
		while (no != null) {
			buffer.append(no.getValue());
			buffer.append(",");
			no = no.getNext();
		}
		return buffer.toString();
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		LinkedListNode<Integer> slow = null;
		LinkedListNode<Integer> fast = null;
		
		slow = list.getRoot();
		fast = list.getRoot();
		while ((fast != null && fast.getNext()!=null) ) {
			if (fast.getNext() != null) {
				fast = fast.getNext();
				if (fast.getNext() != null) {
					fast = fast.getNext();
					if (slow.getNext() != null)
						slow = slow.getNext();
				}
			}
		}
		System.out.println(fast.getValue());
		System.out.println(slow.getValue());
	}

}


