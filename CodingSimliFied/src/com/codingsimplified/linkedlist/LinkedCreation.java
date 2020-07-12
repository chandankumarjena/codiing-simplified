package com.codingsimplified.linkedlist;

class Node{
	int data;
	Node next;
}

public class LinkedCreation {

	public Node insert(int data, Node root) {
		if(root == null) {
			return getNode(data);
			
		}else {
			root.next = insert(data, root.next);
		}
		
		return root;
	}
	private Node getNode(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		return newNode;
	}
	
	public void print(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+ " ");
		print(root.next);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root  = null;
		LinkedCreation creation = new LinkedCreation();
		
		root = creation.insert(100, root);
		root = creation.insert(200, root);
		root = creation.insert(300, root);
		root = creation.insert(400, root);
		
		creation.print(root);
	}

}
