package core.algo.linkedList;

import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		MyLinkedList li = new MyLinkedList(List.of(2,2,2,0,0,2,2,2));
		
		li.print();
		
		System.out.println("==============================");
		
		MyNode node = segregate(li.head);
		node.print();
	}
	
	static MyNode segregate(MyNode head) {
		MyNode top = null;
		MyNode _0 = null;
		MyNode _1 = null;
		MyNode top1 = null;
		
		MyNode _2 = null;
		MyNode top2 = null;
		
		while(head != null) {
			int data = head.data;
			
			if(data ==  0) {
				if(_0 == null) {
					_0 = head;
					top = _0;
				} else {
					_0.next = head;
					_0 = _0.next;
				}
				
			} else if(data == 1) {
				if(_1 == null) {
					_1 = head;
					top1 = _1;
				} else {
					_1.next = head;
					_1= _1.next;
				}
			} else if(data == 2) {
				if(_2 == null) {
					_2 = head;
					top2 = _2;
				} else {
					_2.next = head;
					_2 = _2.next;
				}
			}
			
			head = head.next;
		}
		
		if(top == null) {
			top = top1;
		} else {
			_0.next = top1;
		}
		
		if(top == null) {
			top = top2;
		} else {
			if (top1 == null) {
				_0.next = top2;
			} else {
				_1.next = top2;
			}
		}
		
		if(_2 != null)
			_2.next = null;
		
		return top;
	}
}
