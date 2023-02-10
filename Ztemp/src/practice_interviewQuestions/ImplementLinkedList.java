package practice_interviewQuestions;

public class ImplementLinkedList {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.print();
		
		Node node = list.reverse(list.headNode);
		
		list.print(node);
		
	}
	
	
	static class MyLinkedList {
		private Node headNode;
		
		void add(int data) {
			if(headNode == null) {
				headNode = new Node(data);
			} else {
				
				Node nextNode = headNode;
				while(nextNode.next != null) {
					nextNode = nextNode.next;
				}
				
				nextNode.next = new Node(data);
			}
		}
		
		
		Node reverse(Node node) {
			Node prev = null;
			Node current = node;
			Node next = null;

			while (current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			node = prev;
			return node;
		}
		
		void print() {
			Node node = headNode;
			while(node != null) {
				System.out.println(node.data);
				node = node.next;
			}
		}
		
		void print(Node headNode) {
			Node node = headNode;
			while(node != null) {
				System.out.println(node.data);
				node = node.next;
			}
		}
	}
	
	static class Node {
		int data;
		Node next;
		
		Node() {}
		Node(int data) {
			this.data = data;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
		
	}
}
