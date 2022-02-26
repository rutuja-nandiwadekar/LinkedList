/*
 *Ability to insert 30 between 56 and 70
 *Final Sequence: 56->30->70
 */
package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(70);
		list.addFirst(56);
		list.display();
		list.addMiddle(30);
		list.display();
	}
}
