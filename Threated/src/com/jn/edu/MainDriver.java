/**
 * 
 */
package com.jn.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MainDriver {
	static MainDriver singleton = null;

	ConcurrentLinkedQueue<TransactionItem> theQueue;
	Producer p;
	Consumer c;
	static Connection conn;

	protected MainDriver() {
		theQueue = new ConcurrentLinkedQueue<TransactionItem>();

		// p = new Producer(theQueue, "c:\\temp\\transaction.xml");

		p = new Producer(theQueue);
		p.getConnection();
		c = new Consumer(theQueue);

	}

	public void run() {
		(new Thread(p)).start();
		(new Thread(c)).start();
	}

	public static MainDriver getSingleton() {
		if (singleton == null)
			singleton = new MainDriver();
		return singleton;
	}

	public static void update(InvItem user) {
		try {

			conn = DriverManager.getConnection("path");
			String query = "UPDATE inventory SET name = ?, quantity = ?,cost = ?,critical_level = ?, reorder_quantity = ? WHERE id=6";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setInt(2, user.getQty());
			ps.setDouble(3, user.getCost());
			ps.setInt(4, user.getCriticalLevel());
			ps.setInt(5, user.getReorderQty());

			ps.execute();
			ps.close();
			System.out.println(user.getName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainDriver m = MainDriver.getSingleton();
		m.run();

//		InvItem user = new InvItem(null, 0, 0, 0, 0);
//		user.setName("milk");
//		user.setQty(12);
//		user.setCost(11.50);
//		user.setCriticalLevel(13);
//		user.setReorderQty(40);
//
//		update(user);

	}

}
