package br.com.main.datastructures.trees.bst;

import java.util.Stack;

public class BinarySearchTree {
	
	private TreeNode root;
	
	public TreeNode insert(Integer data) {
		if (root==null) {
			root = new TreeNode(data);
			return root;
		} else {
			return root.insert(data);
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(8);
		tree.insert(9);
		tree.insert(7);
		tree.insert(6);
		tree.insert(10);
		System.out.println("Recursive");
		tree.printPreorderRecursive();
		System.out.println("Iterative");
		tree.printPreOrderIterativa();
	}

	public void printPreorderRecursive() {
		if (root!=null) {
			root.printPreOrderRecursive();
		} else {
			System.out.println("Arvore vazia");
		}
	}
	
	public void printPreOrderIterativa() {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.add(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			System.out.println(node.getData());
			if (node.getRight()!=null) {
				stack.add(node.getRight());
			}
			if (node.getLeft()!=null) {
				stack.add(node.getLeft());
			}
		}
	}

	public boolean isBalancedBrute(TreeNode root) {
		if (root == null) return true;
		if (getHeight(root.getLeft())-getHeight(root.getRight()) > 1)
			return false;
		else
			return isBalancedBrute(root.getLeft()) && isBalancedBrute(root.getRight());
	}
	
	public boolean isBalancedOptimized(TreeNode root) {
		if (getHeightOptimized(root) == -1)
			return false;
		return true;
	}
	
	
	public int getHeight(TreeNode root) {
		if (root==null)
			return 0;
		return Math.max(getHeight(root.getLeft()), getHeight(root.getRight()))+1;
	}
	
	public int getHeightOptimized(TreeNode root) {
		if (root == null) return 0;
		int left = getHeightOptimized(root.getLeft());
		if (left == -1)
			return -1;
		int right = getHeightOptimized(root.getRight());
		if (right == -1)
			return -1;
		if (Math.abs(left-right) > 1)
			return -1;
		else
			return Math.max(right, left) + 1;
	}
	
	public TreeNode getRoot() {
		return this.root;
	}
	
	public static BinarySearchTree createMinimalHeightTree(int[] nodes) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.root = createMinimalBST(null, nodes, 0, nodes.length -1 );
		return bst;
	}
	
	private static TreeNode createMinimalBST(TreeNode parent, int[] nodes, int start, int end) {
		if (end<start) return null;
		int indexMiddle = (start+end)/2;
		int middle = nodes[indexMiddle];
		TreeNode node = new TreeNode(middle);
		node.setParent(parent);
		node.setLeft(createMinimalBST(node, nodes, start, indexMiddle-1));
		node.setRight(createMinimalBST(node, nodes, indexMiddle+1, end));
		return node;
	}
	
	public TreeNode binaryFind(Integer data) {
		return root.binaryFind(data);
	}
	
	public TreeNode find(Integer data) {
		return root.find(data);
	}
	
	private int depth(TreeNode node) {
		if (node == null) return 0;
		return 1 + Math.max(depth(node.getLeft()), depth(node.getRight()));
		
	}

	public int depth() {
		return depth(getRoot());
	}
	
}
