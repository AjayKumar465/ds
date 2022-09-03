package com.aj;

public class LinkedList {
	/**
	* 
	*/
	static Node head;

	void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}

	void removeByIndex(int position) {
		Node temp = head;
		if (position == 0) {
			head = temp.next;
			return;
		}
		for (int i = 0; i < position - 1; i++)
			temp = temp.next;
		if (temp == null || temp.next == null) {
			return;
		}

		temp.next = temp.next.next;

	}
	
	public Node rotate(Node head, int k) {
        Node cur = head;
       while(k > 1 && cur.next != null){
           cur = cur.next;
           k--;
       }
       if(cur.next == null)
           return head;
           
       Node newHead = cur.next;
       cur.next = null;
       Node temp = newHead;
       
       while(temp.next != null)
           temp = temp.next;
   
       temp.next = head;

       return newHead;
    }

	void remove(int data) {
		if (head == null) {
			return;
		}

		if (head.data == data) {
			head = head.next;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}
	}

	int findMiddleElement() {
		Node slow = head;
		Node fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		if (fast.next != null) {
			return slow.next.data;
		} else {
			return slow.data;
		}

	}

	public class Node {
		@Override
		public String toString() {
			return data + "," + next;
		}

		public Node(int data) {
			this.data = data;
		}

		int data;
		Node next;

	}

	Node reverse(Node head) {
		// code here
		Node tempHead = head;
		Node cusr = null;
		while (tempHead != null) {
			Node next = tempHead.next;
			tempHead.next = cusr;
			cusr = tempHead;
			tempHead = next;
		}
		head = cusr;
		return head;

	}
	
	public  Node reverseInGroup(Node node, int k)
    {
		  //Your code here
	       Node curr_ptr = node;
	       Node prev_ptr = null;
	       Node next_ptr = null;
	       int i=0;
	       while(curr_ptr!=null && i<k)
	       {
	           next_ptr = curr_ptr.next;
	           curr_ptr.next = prev_ptr;
	           prev_ptr = curr_ptr;
	           curr_ptr = next_ptr;
	           i++;
	       }
	       
	       if(curr_ptr!=null){
	           node.next = reverseInGroup(next_ptr, k);
	       }
	       
	       return prev_ptr;
	       
	       
    }
    
	


	@Override
	public String toString() {
		return head.toString();
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.push(8);
		ll.push(7);
		ll.push(6);
		ll.push(5);
		ll.push(4);
		ll.push(2);
		ll.push(2);
		ll.push(1);

		// ll.removeByIndex(2);
		System.out.println(ll.reverseInGroup(head,4));
	}

}
