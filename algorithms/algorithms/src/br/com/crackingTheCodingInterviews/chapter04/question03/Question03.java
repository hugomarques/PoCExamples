package br.com.crackingTheCodingInterviews.chapter04.question03;

import br.com.main.datastructures.trees.bst.BinarySearchTree;

public class Question03 {
	
	public static void main(String[] args) {
		int[] nodes = {1,2,3,4,5,6,7,8,9,10};
		BinarySearchTree bst = BinarySearchTree.createMinimalHeightTree(nodes);
		bst.printPreOrderIterativa();
		System.out.println(bst.isBalancedOptimized(bst.getRoot()));
	}

}
