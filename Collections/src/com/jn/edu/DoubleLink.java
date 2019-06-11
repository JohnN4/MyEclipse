/**
 * 
 */
package com.jn.edu;

/**
 * @author JohnN
 *
 */
public class DoubleLink {
	DoubleLink next;
	DoubleLink prev;
	String content;

	/**
	 * Default Constructor
	 */
	public DoubleLink() {
		content = "";
		next = null;
	}

	/**
	 * @param content
	 */
	public DoubleLink(String content) {
		this.content = content;
	}

	/**
	 * @param next
	 * @param content
	 */
	public DoubleLink(DoubleLink next, String content) {
		this.next = next;
		this.content = content;
	}

	/**
	 * @return the next
	 */
	public DoubleLink getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(DoubleLink next) {
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

	public DoubleLink getPrev() {
		return prev;
	}

	public void setPrev(DoubleLink prev) {
		this.prev = prev;
	}

	/**
	 * findlast
	 */
	public DoubleLink findLast(DoubleLink s) {
		DoubleLink retVal = s;
		if (s.getNext() != null)
			retVal = findLast(s.getNext());
		return retVal;
	}

	/**
	 * append
	 */
	public DoubleLink append(String s) {
		DoubleLink retVal = findLast(this);
		if (retVal.getContent().equals(""))
			retVal.setContent(s);
		else {
			DoubleLink x = new DoubleLink(s);
			retVal.setNext(x);
			x.setPrev(retVal);
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
		DoubleLink sll = new DoubleLink();
		for (String month : months) {
			sll.append(month);
		}
		for (DoubleLink iterator = sll; iterator != null; iterator = iterator.getNext()) {
			System.out.println(iterator.getContent());
		}
	}

}
