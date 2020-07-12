package com.codingsimplified.linkedlist;

public class InsertNodeAtFirst {
	class Node{
		int data;
		Node next;
	}
	
	public Node createNode(int data, Node root) {
		if(root == null) {
			return getNewNode(data);
		} else {
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
	public Node insertAtFirst(int data, Node root) {
		Node first = getNewNode(data);
		first.next = root;
		return first;
	}
	public void print(Node root) {
		 if(root == null) {
			 return;
		 }
		 System.out.print(root.data + " ");
		 print(root.next);
	 }

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		InsertNodeAtFirst atFirst = new InsertNodeAtFirst();
		
		root = atFirst.createNode(200, root);
		root = atFirst.createNode(300, root);
		root = atFirst.createNode(400, root);
		root = atFirst.createNode(500, root);
		
		System.out.println("before insert at first");
		atFirst.print(root);
		
		root = atFirst.insertAtFirst(100, root);
		System.out.println();
		System.out.println("after insert at first");
		atFirst.print(root);
		
		
	}

}
