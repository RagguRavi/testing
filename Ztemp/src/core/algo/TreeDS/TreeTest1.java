package core.algo.TreeDS;

import java.util.Scanner;

public class TreeTest1 {
	static Scanner sc = null;
	public static void main(String [] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
		System.out.println("In Order -->");
		inOrder(root);
		System.out.println("Pre Order -->");

		preOrder(root);
		System.out.println("Post Order -->");
		postOrder(root);
	}
	
	public static int[] createTreeUsingArray() {
	
		return null;
	}
	
	//LNR - >Left Node Right
	public static void inOrder(Node root) {
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	
	//NLR --> Node Left Right
	public static void preOrder(Node root) {
		if(root == null) return;
		
		System.out.print(root.data+ " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	
	//LRN Left Right Node
	public static void postOrder(Node root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+ " ");
	}
	
	public static Node createTree() {
		Node root = null;
		
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		if(data == -1) return null;
		
		root  = new Node(data);
		
		System.out.println("Enter left for: "+data);
		root.left = createTree();
		
		System.out.println("Enter Right for: "+data);
		root.right = createTree();
		
		return root;
	}
	
}

class Node {
	Node left,right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}