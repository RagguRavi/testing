package Test1;

public class Test {
	public static void main(String args[]) {
		MyLinkedList li = new MyLinkedList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(7);
		
		li.print();
		
		System.out.println("Program ends");
		
		reverseList(li.head,li);
		
		li.print();
	}
	
	static void  reverseList(Node head,MyLinkedList li) {
		
		if(head  == null ) {
			return ;
		}
		
		reverseList(head.next,li);
		li.add(head.val);
		
	}
}


class MyLinkedList {
	 Node head;
	
	void add(int number) {
		
		if(head == null) {
			head = new Node(number);
		} else {
			
			Node lastNode = head;
			while(lastNode.next != null) {
				lastNode = lastNode.next;
			}
			
			lastNode.next = new Node(number);
			
		}
		
	}
	
	
	
	void print() {
		Node tempHead = head;
		while(tempHead  != null) {
			System.out.println(tempHead.val);
			tempHead = tempHead.next;
		}
	}
}
class Node  {
	int val;
	Node next;
	
	Node(int val){
		this.val =val;
	}
	
	Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
}
