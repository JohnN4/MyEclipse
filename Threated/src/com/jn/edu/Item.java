/**
 * 
 */
package com.jn.edu;

/**
 * @author
 *
 */
public class Item {
	String name;
	int qty;

	/**
	 * @param name
	 * @param qty
	 */
	public Item(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}

	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

	public boolean equals(Item i) {
		return name.equals(i.getName());
	}
}
