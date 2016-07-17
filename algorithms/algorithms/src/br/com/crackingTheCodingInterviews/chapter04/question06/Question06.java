package br.com.crackingTheCodingInterviews.chapter04.question06;

import br.com.main.datastructures.trees.bst.BinarySearchTree;
import br.com.main.datastructures.trees.bst.TreeNode;

public class Question06 {
	
	public static void main(String[] args) {
		int[] nodes = {1,2,3,4,5,6,7,8,9,10};
		BinarySearchTree bst = BinarySearchTree.createMinimalHeightTree(nodes);
		TreeNode node = bst.binaryFind(1);
		System.out.println(node.getData());
		node = nextInOrderElement(node);
		System.out.println(node.getData());
		node = nextInOrderElement(node);
		System.out.println(node.getData());
		node = nextInOrderElement(node);
		System.out.println(node.getData());
		node = nextInOrderElement(node);
		System.out.println(node.getData());
		node = nextInOrderElement(node);
		System.out.println(node.getData());
		node = nextInOrderElement(node);
		System.out.println(node.getData());
		node = nextInOrderElement(node);
		System.out.println(node.getData());
		node = nextInOrderElement(node);
		System.out.println(node.getData());
		node = nextInOrderElement(node);
		System.out.println(node.getData());
	}
	
	private static TreeNode nextInOrderElement(TreeNode node) {
		if (node == null) return null;
		if (node.getRight() != null)
			return leftMost(node.getRight());
		else {
			return firstLeftParent(node);
		}
	}

	private static TreeNode firstLeftParent(TreeNode node) {
		TreeNode current = node;
		TreeNode parent = node.getParent();
		while (parent != null && parent.getLeft() != current) {
			current = parent;
			parent = parent.getParent();
		}
		return parent;
	}

	private static TreeNode leftMost(TreeNode right) {
		TreeNode next = right;
		while (next.getLeft() != null)
			next = next.getLeft();
		return next;
	}

}
