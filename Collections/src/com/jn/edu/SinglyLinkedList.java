/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class SinglyLinkedList {
	/**
	 * head is the reference to the first element of a list
	 */
	SinglyLinkedList head;
	/**
	 * listElement is the content of this element
	 */
	String listElement;
	/**
	 * next is the reference to the next element
	 */
	SinglyLinkedList next;

	/**
	 * 
	 */
	public SinglyLinkedList() {
		listElement = "";
		next = null;
	}

	/**
	 * @param listElement
	 */
	public SinglyLinkedList(String listElement) {
		this.listElement = listElement;
		next = null;
	}

	/**
	 * @param listElement
	 * @param next
	 */
	public SinglyLinkedList(String listElement, SinglyLinkedList next) {
		this.listElement = listElement;
		this.next = next;
	}

	/**
	 * @return the listElement
	 */
	public String getListElement() {
		return listElement;
	}

	/**
	 * @param listElement the listElement to set
	 */
	public void setListElement(String listElement) {
		this.listElement = listElement;
	}

	/**
	 * @return the next
	 */
	public SinglyLinkedList getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(SinglyLinkedList next) {
		this.next = next;
	}

	/**
	 * @return the head
	 */
	public SinglyLinkedList getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(SinglyLinkedList head) {
		this.head = head;
	}

	/**
	 * method getLast Find the first, navigate until you have an element that has no
	 * next (i.e. next = null) return element whose next is null
	 */
	public SinglyLinkedList getLast(SinglyLinkedList element) {
		SinglyLinkedList retVal = element;
		System.out.println("Getting last: Current list element " + element.getListElement());
		if (element.getNext() != null)
			getLast(element.getNext());
		return retVal;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.setHead(sll); // We are setting first element
		SinglyLinkedList last = sll;
		for (String month : months) {
			last.setListElement(month);
			SinglyLinkedList newMonth = new SinglyLinkedList();
			last.setNext(newMonth);
			last = newMonth;
		}
		SinglyLinkedList iterator = sll.getHead();
		while (iterator.getNext() != null) {
			System.out.println(iterator.getListElement());
			iterator = iterator.getNext();
		}

	}

}
