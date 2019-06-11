package com.jn.edu;
/**
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Producer implements Runnable {
	ConcurrentLinkedQueue<TransactionItem> theQueue;
	static ArrayList<TransactionItem> transactions;

	/**
	 * @param theQueue
	 */

	// passing in String
	// public Producer(ConcurrentLinkedQueue<TransactionItem> theQueue, String
	// transactionFileName )

	// passing in Object
	public Producer(ConcurrentLinkedQueue<TransactionItem> theQueue) {
		this.theQueue = theQueue;
		transactions = new ArrayList<>();
		// loadTransactions(transactionFileName);
	}

	/**
	 * loadTransactions
	 */
	public void loadTransactions(String xmlFileName) {
		Document doc = openXMLFile(xmlFileName);
		if (doc != null) {
			NodeList invItems = doc.getElementsByTagName("item");
			for (int i = 0; i < invItems.getLength(); i++) {
				Node item = invItems.item(i);
				NamedNodeMap attrs = item.getAttributes();
				String name = attrs.getNamedItem("name").getNodeValue();
				int qty = Integer.parseInt(attrs.getNamedItem("qty").getNodeValue());
				TransactionItem ti = new TransactionItem(name, qty);
				transactions.add(ti);
			}
		}
	}

	/**
	 * 
	 */
	Document openXMLFile(String xmlFileName) {
		Document retVal = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			retVal = db.parse(xmlFileName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return retVal;
	}

	// Sql connection
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
				TransactionItem ti = new TransactionItem(name, quantity);
				transactions.add(ti);
			}
			conn.close();
		} catch (Exception e) {

			System.err.println(e.getMessage());
		}

	}

	public void run() {
		try {
			for (TransactionItem ti : transactions) {
				System.out.println("Producer: Adding transaction: " + ti.getName());
				theQueue.add(ti);
				int sleepTime = (int) (Math.random() * 15000.0); // sleep time is in milliseconds
				Thread.sleep(sleepTime);
			}
			System.out.println("Producer: Adding END transaction: ");

			theQueue.add(new TransactionItem("END", 0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
