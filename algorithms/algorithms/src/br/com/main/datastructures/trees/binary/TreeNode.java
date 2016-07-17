package br.com.main.datastructures.trees.binary;

public class TreeNode {
	
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
		if (this.getLeft()==null) {
			setLeft(new TreeNode(data));
			return getLeft();
		} else if (this.getRight() == null) {
			setRight(new TreeNode(data));
			return getRight();
		}
		return getRight().insert(data);
	}

	public void printPreOrderRecursive() {
		if (this.getLeft() != null)
			this.getLeft().printPreOrderRecursive();
		System.out.println(this.getData());
		if (this.getRight() != null) 
			this.getRight().printPreOrderRecursive();
	}

}
