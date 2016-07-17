package br.com.main.datastructures.linkedlist;

 public class LinkedListNode<T> {
		
		private LinkedListNode<T> next;
		private T value;
		
		public LinkedListNode(T value) {
			this.value = value;
		}
		
		public void setNext(LinkedListNode<T> next) {
			this.next = next;
		}

		public LinkedListNode<T> getNext() {
			return next;
		}
		
		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}
		
 }