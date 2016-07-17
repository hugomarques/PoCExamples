package br.com.main.datastructures.trees.binary;

public class Tree {
	
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
		Tree tree = new Tree();
		tree.insert(7);
		tree.insert(6);
		tree.insert(10);
		tree.insert(9);
		tree.insert(8);
		tree.printPreorder();
	}

	private void printPreorder() {
		if (root!=null) {
			root.printPreOrderRecursive();
		} else {
			System.out.println("Arvore vazia");
		}
		
		
	}

	public TreeNode getRoot() {
		return root;
	}

}
