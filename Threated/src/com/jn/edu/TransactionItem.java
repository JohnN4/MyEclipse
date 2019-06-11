/**
 * 
 */
package com.jn.edu;

/**
 * @author
 *
 */
public class TransactionItem extends Item {

	/**
	 * @param name
	 * @param qty
	 */
	public TransactionItem(String name, int qty) {
		super(name, qty);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return super.getName();
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		super.setName(name);
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return super.getQty();
	}

	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		super.setQty(qty);
	}
}
