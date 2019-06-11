/**
 * 
 */
package com.jn.edu;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author praka
 *
 */
public class ReadXMLFormat {
	String xmlFile;
	Document document;

	/**
	 * constructor: @param filename
	 */
	public ReadXMLFormat(String filename) {
		xmlFile = filename;
		setDocument();
	}

	/**
	 * setDocument: creates the xml dom object from the xml file
	 */
	public void setDocument() {
		// initialize document to null
		document = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			document = db.parse(new File(xmlFile));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Document getDocument() {
		return document;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReadXMLFormat rx = new ReadXMLFormat("C:\\Users\\JohnN\\Desktop\\Eclipse Work\\Draw.io\\grades.xml");
		// saving file on doc
		Document doc = rx.getDocument();
		// ?
		NodeList children = doc.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node n = children.item(i);

			if (n.getNodeName() != null) {
				Element y = (Element) n;
				String id = y.getAttribute("Student_data");
				System.out.print(id);
			}
		}

	}

//	static void printNode(Node c) {
////		String g = "the attribute";
////		String v = "value of Att";
////		System.out.print(String.format("|%-20s| ", g, v));
//
//		// System.out.print(String.format("|%-30s| ", c.getNodeName()));
//
//		System.out.print(String.format("%1$-10s %2$10s", c.getNodeName(), c.getNodeValue()));
//
//		// System.out.println("Value: " + c.getNodeValue());
//		System.out.println();
//		// System.out.print("Node type = ");
//
//		// Node Type
//		switch (c.getNodeType()) {
//		case Node.ELEMENT_NODE:
//			System.out.println("Element");
//			Element e = (Element) c;
//
//			if (e != null) {
//				if (e.hasAttributes()) {
//					NamedNodeMap attrs = e.getAttributes();
//
//					for (int i = 0; i < attrs.getLength(); i++) {
//						Node a = attrs.item(i);
//
//						printNode(a);
//					}
//				}
//
//				if (e != null) {
//					if (e.hasChildNodes()) {
//						NodeList children = e.getChildNodes();
//						for (int i = 0; i < children.getLength(); i++) {
//							Node n = children.item(i);
//							printNode(n);
//						}
//					}
//				}
//			}
//			break;
//		case Node.ATTRIBUTE_NODE:
//			System.out.println("Attribute");
//			System.out.println();
//			break;
//		}

	// }
}
