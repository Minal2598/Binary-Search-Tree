package com.bst;

class Node {
	int data;
	Node left;
	Node right;

}

public class BinarySearchTree {
		//Insert Method
	public Node insert(Node root, int val) {
		if (root == null) {
			return craeteNewNode(val);
		}
		if (val < root.data) {
			root.left = insert(root.left, val);
		} else if (val > root.data) {
			root.right = insert(root.right, val);
		}
		return root;

	}
		//New Node Creation Method
	public Node craeteNewNode(int temp) {
		Node bst = new Node();
		bst.data = temp;
		bst.left = null;
		bst.right = null;
		return bst;
	}
	 
	public void print(Node root) {  //print method
		if (root == null) {
			return;
		}
		print(root.left);
		System.out.println(root.data);
		print(root.right);

	}

}
