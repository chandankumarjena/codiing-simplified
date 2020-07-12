package com.codingsimplified.linkedlist;

public class InsertAtAPosition {
	class Node {
		int data;
		Node next;
	}
	
	public Node createNode(int data, Node root){
		if(root == null) {
			return getNewNode(data);
		}else {
			root.next = createNode(data, root.next);
		}
		return root;
	}
	

	private Node getNewNode(int data) {
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
		System.out.print(root.data +" ");
		print(root.next);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		InsertAtAPosition atAPosition = new InsertAtAPosition();
		root = atAPosition.createNode(1000, root);
		root = atAPosition.createNode(2000, root);
		root = atAPosition.createNode(3000, root);
		root = atAPosition.createNode(4000, root);
		
		atAPosition.print(root);

	}

}
