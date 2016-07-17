package br.com.crackingTheCodingInterviews.chapter04.question05;

import br.com.main.datastructures.trees.bst.TreeNode;
import br.com.main.datastructures.trees.bst.BinarySearchTree;

public class Question05 {
	
	public static void main(String[] args) {
		int[] nodes = {1,2,3,4,5,6,7,8,9,10};
		BinarySearchTree bst = BinarySearchTree.createMinimalHeightTree(nodes);
		System.out.println(checkBinaryTree(bst));
	}
	
	private static boolean checkBinaryTree(BinarySearchTree tree) {
		return checkNode(tree.getRoot(), Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean checkNode(TreeNode root, Integer min, Integer max) {
		if (root == null) return true;
		if (root.getData() <= min || root.getData() > max) return false;
		if (!checkNode(root.getLeft(), min, root.getData()) || 
		!checkNode(root.getRight(), root.getData(), max)) {
			return false;
		}
		return true;
	}
	
	

}
