package com.codingsimplified.tree;

class Node{
	int data;
	Node left;
	Node right;
}
class BST{
	public Node createNode(int data) {
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		return node;
	}
	public Node insert(Node node, int data) {
		if(node == null) {
			return createNode(data);
		}
		if(data > node.data) {
			node.right = insert(node.right, data);
		}
		if(data < node.data) {
			node.left = insert(node.left, data);
		}
		return node;
	}
	
	public void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data +" ");
		inOrder(root.right);
	}
	public void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data +" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data +" ");
	}
	
	public boolean findElementPresent(Node node, int element) {
		if(node == null) {
			return false;
		}
		boolean isPresent = false;
		while(node != null) {
			if(element < node.data) {
				node = node.left;
			}else if(element > node.data) {
				node = node.right;
			}else {
				isPresent = true;
				break;
			}
		}
		return isPresent;
	}
	
	public Node getParentNode(Node root, int element) {
		if( root == null) {
			return null;
		}
		Node parentNode = null;
		while(root != null) {
			if(element < root.data) {
				parentNode = root;
				root = root.left;
			}
			if(element > root.data) {
				parentNode = root;
				root = root.right;
			}
			if(element == root.data) {
				break;
			}
		}
		return parentNode;
	}
	
	public Node getSiblingNode(Node root, int value) {
		if(root == null || root.data == value) {
			return null;
		}
		
		Node parentNode = null;
		while(root != null) {
			if(value < root.data) {
				parentNode = root;
				root = root.left;
			}
			else if(value > root.data) {
				parentNode = root;
				root = root.right;
			}
			else{
				break;
			}
		}
		if(parentNode.left != null && value == parentNode.left.data) {
			return parentNode.right;
		}
		if (parentNode.right != null && value == parentNode.right.data) {
			return parentNode.left;
		}
		
		return null;
	}
	
	public int getMaxElement(Node root) {
		if(root == null) {
			System.out.println("tree doesn't wxists");
			return -1;
		}
		while(root.right != null) {
			root = root.right;
		}
		return root.data;
	}
	
	public int getMinElement(Node root) {
		if(root == null) {
			System.out.println("tree doesn't wxists");
			return -1;
		}
		while(root.left != null) {
			root = root.left;
		}
		return root.data;
	}
}
public class BSTTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		BST bst = new BST();
		root = bst.insert(root, 8);
		root = bst.insert(root, 3);
		root = bst.insert(root, 6);
		root = bst.insert(root, 10);
		root = bst.insert(root, 4);
		root = bst.insert(root, 7);
		root = bst.insert(root, 3);
		root = bst.insert(root, 1);
		root = bst.insert(root, 14);
		root = bst.insert(root, 13);
		
		System.out.println("max element"+ bst.getMaxElement(root));
		System.out.println("min element"+ bst.getMinElement(root));
	}

}
