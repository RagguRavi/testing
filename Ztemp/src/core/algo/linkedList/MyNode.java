package core.algo.linkedList;

import java.util.List;

public class MyNode {
	int data;
	MyNode next;
	
	MyNode(int data) {
		this.data = data;
	}
	
	void print() {
		MyNode temp = this;
		while(temp != null) {
			System.out.println(temp.data+"\t");
			temp = temp.next;
		}
	}
}


class MyLinkedList {
	MyNode head;
	
	public MyLinkedList() {}
	public MyLinkedList(List<Integer> arr) {
		for(int i: arr) {
			add(i);
		}
	}
	void add(int data) {
		if(head == null) {
			head = new MyNode(data);
		} else {
			MyNode temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = new MyNode(data);
		}
	}
	
	
	void print() {
		MyNode temp = head;
		while(temp != null) {
			System.out.println(temp.data+"\t");
			temp = temp.next;
		}
	}
}


