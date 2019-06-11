/**
 * 
 */
package com.jn.edu;

public class InvItem extends Item {
	double cost;
	int criticalLevel;
	int reorderQty;

	/**
	 * @param name
	 * @param qty
	 * @param cost
	 * @param criticalLevel
	 * @param reorderQty
	 */
	public InvItem(String name, int qty, double cost, int criticalLevel, int reorderQty) {
		super(name, qty);
		this.cost = cost;
		this.criticalLevel = criticalLevel;
		this.reorderQty = reorderQty;
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

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * @return the criticalLevel
	 */
	public int getCriticalLevel() {
		return criticalLevel;
	}

	/**
	 * @param criticalLevel the criticalLevel to set
	 */
	public void setCriticalLevel(int criticalLevel) {
		this.criticalLevel = criticalLevel;
	}

	/**
	 * @return the reorderQty
	 */
	public int getReorderQty() {
		return reorderQty;
	}

	/**
	 * @param reorderQty the reorderQty to set
	 */
	public void setReorderQty(int reorderQty) {
		this.reorderQty = reorderQty;
	}

	public void show() {
		System.out.println(String.format("%20s%5d%9.2f%4d%4d", getName(), getQty(), cost, criticalLevel, reorderQty));
	}

	public String getXMLString() {
		return "<item name=\"" + getName() + "\" cost=\"" + getCost() + "\" qty=\"" + getQty() + "\" critical_level=\""
				+ getCriticalLevel() + "\" reorder_qty=\"" + getReorderQty() + "\"/>\n";
	}

	public String getCSV() {
		return getName() + "," + getQty() + "," + getCost() + "," + getCriticalLevel() + "," + getReorderQty() + "\n";
	}
}
