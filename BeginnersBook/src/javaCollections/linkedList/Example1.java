package javaCollections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		// Adding elements to the Linked list
		list.add("Steve");
		list.add("Carl");
		list.add("Raj");

		// Adding an element to the first position
		list.addFirst("Negan");

		// Adding an element to the last position
		list.addLast("Rick");

		// Adding element to the 3rd position
		list.add(2, "Glemm");

		// Iterating LinkedList
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Removing First element
		// Same as list.remove(0);
		list.removeFirst();

		// Removing Last element
		list.removeLast();

		// Iterating LinkedList
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

	}
}
