package br.com.crackingTheCodingInterviews.chapter04.question08;

import br.com.main.datastructures.trees.bst.BinarySearchTree;
import br.com.main.datastructures.trees.bst.TreeNode;

public class Question08 {
	
	public static void main(String[] args) {
		int[] nodes = {1,2,3,4,5,6,7,8,9,10};
		BinarySearchTree bst = BinarySearchTree.createMinimalHeightTree(nodes);
		TreeNode p = bst.find(8);
		System.out.println(isSubTree(bst.getRoot(), p));
		
	}
	
	private static boolean isSubTree(TreeNode root1, TreeNode root2) {
		if (root2 == null) return true;
		if (root1==null) return false;
		if (root1.getData()==root2.getData())
			if (matchTree(root1, root2)) return true;
		return isSubTree(root1.getLeft(), root2) || isSubTree(root1	.getRight(), root2);
		
	}
	
	private static boolean matchTree(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		if (root1.getData() != root2.getData())
			return false;
		return matchTree(root1.getLeft(), root2.getLeft()) && matchTree(root1.getRight(), root2.getRight());
		
	}

}
