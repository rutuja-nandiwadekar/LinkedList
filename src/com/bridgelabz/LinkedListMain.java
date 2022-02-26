/*
 *Ability to insert 40 after 30 to the Linked List sequence of 56->30->70
 *Final Sequence: 56->30->40->70
 */
package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);
		list.display();
		list.addMiddle(40);
		list.display();
	}
}
