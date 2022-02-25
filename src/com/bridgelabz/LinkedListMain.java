/*
 *Ability to create Linked List by adding 30 and 56 to 70
 *LinkedList Sequence: 56->30->70
 */
package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(56);
		list.addLast(30);
		list.addLast(70);

		list.display();
	}
}
