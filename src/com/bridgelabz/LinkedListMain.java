/*
 *Ability to delete the first element in the LinkedList of sequence 56->30->70
 *Final Sequence: 30->70
 */
package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);
		list.display();
		list.deleteFirst();
		list.display();
	}
}
