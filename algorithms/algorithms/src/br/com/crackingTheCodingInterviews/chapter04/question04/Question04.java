package br.com.crackingTheCodingInterviews.chapter04.question04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.main.datastructures.trees.bst.BinarySearchTree;
import br.com.main.datastructures.trees.bst.TreeNode;

public class Question04 {
	
	public static void main(String[] args) {
		int[] nodes = {1,2,3,4,5,6,7,8,9,10};
		BinarySearchTree bst = BinarySearchTree.createMinimalHeightTree(nodes);
		List<List<TreeNode>> result = createDepthList(bst);
		for (List<TreeNode> list:result) {
			for (TreeNode node:list) {
				System.out.print(node.getData()+" ");
			}
			System.out.println();
		}
	}
	
	private static List<List<TreeNode>> createDepthList(BinarySearchTree bst) {
		List<List<TreeNode>> result = new ArrayList<List<TreeNode>>();
		List<TreeNode> current = new LinkedList<TreeNode>();
		if (bst.getRoot() != null)
			current.add(bst.getRoot());
		while (current.size() > 0) {
			result.add(current);
			List<TreeNode> parents = current;
			current = new LinkedList<TreeNode>();
			for (TreeNode node:parents) {
				if (node.getLeft() != null)
					current.add(node.getLeft());
				if (node.getRight() != null)
					current.add(node.getRight());
			}
		}
		return result;
	}

}
