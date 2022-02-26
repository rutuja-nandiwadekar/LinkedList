/*
 *Ability to delete 40 from the Linked List sequence of 56->30->40->70 and show the size of LinkedList is 3 
 *Final Sequence: 56->30->70
 *Implement size() and show the Linked List size is 3
 */
package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(70);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(56);
		list.display();

		list.deleteElement(40);
		list.display();
		list.getSize();

	}
}
