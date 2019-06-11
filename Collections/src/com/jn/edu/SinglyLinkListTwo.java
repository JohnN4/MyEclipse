/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class SinglyLinkListTwo {
	SinglyLinkListTwo next;
	String content;

	/**
	 * Default Constructor
	 */
	public SinglyLinkListTwo() {
		content = "";
		next = null;
	}

	/**
	 * @param content
	 */
	public SinglyLinkListTwo(String content) {
		this.content = content;
	}

	/**
	 * @param next
	 * @param content
	 */
	public SinglyLinkListTwo(SinglyLinkListTwo next, String content) {
		this.next = next;
		this.content = content;
	}

	/**
	 * @return the next
	 */
	public SinglyLinkListTwo getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(SinglyLinkListTwo next) {
		this.next = next;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * findlast
	 */
	public SinglyLinkListTwo findLast(SinglyLinkListTwo s) {
		SinglyLinkListTwo retVal = s;
		if (s.getNext() != null)
			retVal = findLast(s.getNext());
		return retVal;
	}

	/**
	 * append
	 */
	public SinglyLinkListTwo append(String s) {
		SinglyLinkListTwo retVal = findLast(this);
		if (retVal.getContent().equals(""))
			retVal.setContent(s);
		else {
			SinglyLinkListTwo x = new SinglyLinkListTwo(s);
			retVal.setNext(x);
			retVal = x;
		}
		return retVal;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		SinglyLinkListTwo sll = new SinglyLinkListTwo();
		for (String month : months) {
			sll.append(month);
		}
		for (SinglyLinkListTwo iterator = sll; iterator != null; iterator = iterator.getNext()) {
			System.out.println(iterator.getContent());
		}
	}

}
