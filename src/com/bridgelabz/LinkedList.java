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

	/*
	 * This is the method to add first
	 */
	public void addFirst(Object data) {
		// create new node
		Node newNode = new Node(data);
		// list is empty
		if (head == null)
			head = newNode;
		// list is not empty
		else {
			newNode.ref = head;
			head = newNode;
		}
	}

	/*
	 * This is the method to display
	 */
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
