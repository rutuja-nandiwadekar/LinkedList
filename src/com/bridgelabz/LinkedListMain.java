/*
 *Ability to search LinkedList to find Node with value 30
 */
package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(70);
		list.addFirst(56);
		list.addFirst(30);
		list.display();
		list.search(30);
	}
}
