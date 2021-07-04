package com.bst;

public class BSTMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Binary Search Tree...!!!");

		BinarySearchTree bst = new BinarySearchTree();
		Node root = null;

		root = bst.insert(root, 56);

		root = bst.insert(root, 30);

		root = bst.insert(root, 70);

		bst.print(root); // tree created

	}

}
