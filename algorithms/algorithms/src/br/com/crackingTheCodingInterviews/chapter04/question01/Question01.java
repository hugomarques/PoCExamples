package br.com.crackingTheCodingInterviews.chapter04.question01;

import br.com.main.datastructures.trees.bst.BinarySearchTree;

public class Question01 {
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		for (int i = 0; i<10;i++) {
			bst.insert((int)(Math.random()*100));
		}
		bst.printPreorderRecursive();
		System.out.println(bst.isBalancedBrute(bst.getRoot()));
		bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(2);
		bst.insert(1);
		bst.insert(3);
		bst.insert(12);
		bst.insert(11);
		bst.insert(13);
		bst.printPreorderRecursive();
		System.out.println(bst.isBalancedBrute(bst.getRoot()));
		bst = new BinarySearchTree();
		bst.insert(10);
		for (int i = 0; i<10;i++) {
			bst.insert((int)(Math.random()*100));
		}
		bst.printPreorderRecursive();
		System.out.println(bst.isBalancedOptimized(bst.getRoot()));
		bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(2);
		bst.insert(1);
		bst.insert(3);
		bst.insert(12);
		bst.insert(11);
		bst.insert(13);
		bst.printPreorderRecursive();
		System.out.println(bst.isBalancedOptimized(bst.getRoot()));
	}

}
