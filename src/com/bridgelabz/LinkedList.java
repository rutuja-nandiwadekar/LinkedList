package com.bridgelabz;

public class LinkedList {
	Node head;

	// node creation
	public class Node {

		Object data;
		Node ref;

		// constructor
		public Node(Object data) {
			this.data = data;
		}
	}

	public void addFirst(Object data) {
		// 100 200 300
		// create new node
		Node newNode = new Node(data);// 400
		// list is empty
		if (head == null)
			head = newNode;
		// list is not empty
		else {
			newNode.ref = head; // head==>400 100 200 300
			head = newNode;
		}
	}

	public void display() {
		// list is empty
		if (head == null)
			System.out.println("No elements to display.");
		// list is not empty
		else {
			Node temp = head;
			// traverse up to null elements
			while (temp != null) {
				if (temp.ref != null)
					System.out.print(temp.data + " => ");
				else
					// display data
					System.out.println(temp.data);
				temp = temp.ref;
			}
		}
	}
}
