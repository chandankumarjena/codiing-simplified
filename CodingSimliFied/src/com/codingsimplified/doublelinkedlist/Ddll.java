package com.codingsimplified.doublelinkedlist;

class Node{
	int data;
	Node next;
	Node previous;
}
class DoubleLinkedList{
	public Node getNewNode(int data) {
		Node a = new Node();
		a.data = data;
		a.next = null;
		a.previous = null;
		return a;
	}
	public Node insert(int data, Node node) {
		if( node  == null) {
			return getNewNode(data);
		}
		Node head = node;
		while (node.next != null) {
			node = node.next;
		}
		
		Node newNode = getNewNode(data);
		node.next = newNode;
		newNode.previous = node;
		
		return head;
	}
	
	public void visit(Node root) {
		while(root != null) {
			System.out.println(root.data);
			root = root.next;
		}
	}
	public Node insertAtFirst(Node root, int data) {
		if(root == null) {
			return getNewNode(data);
		}
		Node t = getNewNode(data);
		t.data = data;
		t.next = root;
		root.previous = t;
		return t;
	}
	
	public Node insertAtAnyPosition(Node root, int data, int position) {
		if(root == null) {
			if(position == 1) {
				return getNewNode(data);
			} else {
				return null;
			}
		}
		
		if(position == 1) {
			Node t = getNewNode(data);
			root.previous = t;
			t.next = root;
			return t;
		}
		
		Node node = root;
		while(node != null && position > 2) {
			node = node.next;
			position--;
		}
		
		if(node == null) {
			System.out.println("not a valid position");
			return root;
		}

		Node t = getNewNode(data);
		t.next = node.next;
		t.previous = node;
		if(node.next != null) {
			node.next.previous = t;
		}
		node.next = t;
		return root;
		
	}
	
	public Node deleteFirstNode(Node root) {
		if(root == null) {
			return null;
		}
		if(root.next != null) {
			root.next.previous = null;
		}
		
		return root.next;
	}
	
	public Node deleteNodeAtAnyPosition(Node head, int position) {
		if(head == null) {
			return head;
		}
		if(position == 1) {
			if(head.next != null) {
				head.next.previous = null;
			}
			return head.next;
		}
		Node node = head;
		
		while(node != null && position>1) {
			node = node.next;
			position--;
		}
		
		if(node == null) {
			System.out.println("node not exist to delete");
			return head;
		}
		
		if(node.next != null) {
			node.next.previous = node.previous;
		}
		node.previous.next = node.next;
		
		return head;
			
	}
	
	public int size(Node root) {
		if(root == null) {
			return 0;
		}
		int count = 0;
		while(root != null) {
			count++;
			root = root.next;
		}
		return count;
	}
}
public class Ddll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		Node head = null;
		System.out.println(doubleLinkedList.size(head));
		head = doubleLinkedList.insert(100, head);
		head = doubleLinkedList.insert(200, head);
		head = doubleLinkedList.insert(300, head);
		head = doubleLinkedList.insert(400, head);
		head = doubleLinkedList.insert(500, head);
		System.out.println(doubleLinkedList.size(head));
	}
}
