package br.com.crackingTheCodingInterviews.chapter04.question09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.main.datastructures.trees.bst.BinarySearchTree;
import br.com.main.datastructures.trees.bst.TreeNode;

public class Question09 {
	
	public static void main(String[] args) {
		int[] nodes = {1,2,3,4,5,6,7,8,9,10};
		BinarySearchTree bst = BinarySearchTree.createMinimalHeightTree(nodes);
		List<LinkedList<Integer>> paths = findSum(bst, 10);
		for (LinkedList<Integer> list:paths) {
			for (Integer i:list)
				System.out.print(i);
			System.out.println();
		}
	}
	
	public static List<LinkedList<Integer>> findSum(BinarySearchTree bst, int sum) {
		int depth = bst.depth();
		int[] path = new int[depth];
		List<LinkedList<Integer>> paths = new ArrayList<LinkedList<Integer>>();
		sumPath(paths, sum, path, bst.getRoot(), 0);
		return paths;
	}
	
	public static void sumPath(List<LinkedList<Integer>> paths, int sum, int[] path, TreeNode current, int level) {
		if (current == null) return ;
		path[level] = current.getData();
		
		int tempSum = 0;
		for (int i = level; i>= 0; i--) {
			tempSum += path[i];
			if (tempSum==sum) {
				addPath(paths, i, path, level);
			}
		}
		sumPath(paths, sum, path, current.getLeft(), level +1);
		sumPath(paths, sum, path, current.getRight(), level +1);
		
		path[level] = Integer.MIN_VALUE;
	}

	private static void addPath(List<LinkedList<Integer>> paths, int i,
			int[] path, int level) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int j = i; j<=level;j++ ) {
			list.add(path[j]);
		}
		paths.add(list);
	}

}
