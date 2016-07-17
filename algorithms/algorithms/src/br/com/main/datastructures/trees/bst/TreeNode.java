package br.com.main.datastructures.trees.bst;

public class TreeNode {
	
	private TreeNode parent;
	private TreeNode left;
	private TreeNode right;
	private Integer data;
	
	public TreeNode(Integer data) {
		this.data = data;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	public Integer getData() {
		return data;
	}
	
	public void setData(Integer data) {
		this.data = data;
	}

	public TreeNode insert(Integer data) {
		if (data<=this.data) {
			if (this.getLeft()==null) {
				TreeNode leftNode = new TreeNode(data);
				leftNode.setParent(this);
				setLeft(leftNode);
				return getLeft();
			} else {
				return getLeft().insert(data);
			}
		} else {
			if (this.getRight() == null) {
				TreeNode rightNode = new TreeNode(data);
				rightNode.setParent(this);
				setRight(rightNode);
				return getRight();
			} else {
				return getRight().insert(data);
			}
		}
	}

	public void printPreOrderRecursive() {
		System.out.println(this.getData());
		if (this.getLeft() != null)
			this.getLeft().printPreOrderRecursive();
		if (this.getRight() != null) 
			this.getRight().printPreOrderRecursive();
	}
	
	public TreeNode getParent() {
		return this.parent;
	}
	
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public TreeNode binaryFind(Integer data) {
		if (this.data == data) return this;
		else if (data<=this.data && this.getLeft() == null) return null;
		else if (data<=this.data && this.getLeft() != null) return this.getLeft().binaryFind(data);
		else if (data>this.data && this.getRight() == null) return null;
		else if (data>this.data && this.getRight() != null) return this.getRight().binaryFind(data);
		return null;
	}

	public TreeNode find(Integer data) {
		TreeNode current = null;
		if (this.data == data) 
			current = this;
		if (current == null && this.getLeft() != null) 
			current = this.getLeft().find(data);
		if (current == null && this.getRight() != null) 
			current = this.getRight().find(data);
		return current;
	}


}
