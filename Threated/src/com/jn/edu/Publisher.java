/**
 * 
 */
package com.jn.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author JohnN
 *
 */
public class Publisher implements Runnable {
	public static void getConnection() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/oltp?user=root");
			Statement st = conn.createStatement();

			ResultSet rs;

			rs = st.executeQuery("SELECT * FROM inventory");
			while (rs.next()) {
				String name = rs.getString("name");
				int quantity = rs.getInt("quantity");
				double cost = rs.getDouble("cost");
				int clevel = rs.getInt("critical_level");
				int reoder = rs.getInt("reorder_quantity");
				System.out.println(name);
			}
			conn.close();
		} catch (Exception e) {

			System.err.println(e.getMessage());
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getConnection();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
