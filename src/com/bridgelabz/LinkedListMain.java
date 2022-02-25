/*
 *Ability to create Linked List by adding 30 and 56 to 70
 */
package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);

		list.display();
	}

}
