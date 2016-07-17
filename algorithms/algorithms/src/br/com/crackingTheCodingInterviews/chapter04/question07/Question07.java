package br.com.crackingTheCodingInterviews.chapter04.question07;

import br.com.main.datastructures.trees.bst.BinarySearchTree;
import br.com.main.datastructures.trees.bst.TreeNode;

public class Question07 {

	public static void main(String[] args) {
		int[] nodes = {1,2,3,4,5,6,7,8,9,10};
		BinarySearchTree bst = BinarySearchTree.createMinimalHeightTree(nodes);
		TreeNode p = bst.find(8);
		TreeNode q = bst.find(10);
		TreeNode ancestor = commonAncestor(bst.getRoot(), p, q);
		System.out.println(ancestor.getData());
		
	}
	
	public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) return null;
		if (root == p || root == q) return root;
		boolean q_is_on_left = isOnTheSubTree(root.getLeft(), q);
		boolean p_is_on_left = isOnTheSubTree(root.getLeft(), p);
		if (p_is_on_left && q_is_on_left) {
			return commonAncestor(root.getLeft(), p, q); 
		} else if (p_is_on_left && !q_is_on_left)
			return root;
		else if (q_is_on_left && !p_is_on_left)
			return root;
		else 
			return commonAncestor(root.getRight(), p, q);
	}
	
	public static boolean isOnTheSubTree(TreeNode root, TreeNode p) {
		if (root == null) return false;
		if (root == p) return true;
		return isOnTheSubTree(root.getLeft(), p) || isOnTheSubTree(root.getRight(), p);
	}
	
}
