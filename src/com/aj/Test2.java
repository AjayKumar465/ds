package com.aj;

public class Test2 {
	Node head;

	class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return data + "," + next;
		}

	}
	
	void remove(int data) {
		if(head==null) {
			return;
		}
	
		if(head.data == data) {
			head = head.next;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			if(temp.next.data == data) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}
	}

	public void push(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node temp = head;
		head = new Node(data);
		head.next = temp;
	}
	
	public static void main(String[] args) {
		Test2 ll = new Test2();
		ll.push(8);
		ll.push(3);
		ll.push(4);
		ll.push(1);
		ll.push(0);
		ll.remove(4);
		System.out.println(ll);
	}

	@Override
	public String toString() {
		return head.toString();
	}

}
