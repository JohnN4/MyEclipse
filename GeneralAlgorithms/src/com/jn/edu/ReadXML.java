/**
 * 
 */
package com.jn.edu;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author praka
 *
 */
public class ReadXML {
	String xmlFile;
	Document document;

	/**
	 * constructor: @param filename
	 */
	public ReadXML(String filename) {
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
		ReadXML rx = new ReadXML("C:\\Users\\JohnN\\Desktop\\Eclipse Work\\Draw.io\\grades.xml");
		// saving file on doc
		Document doc = rx.getDocument();
		// ?
		NodeList children = doc.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node n = children.item(i);
			printNode(n);
		}

	}

	static void printNode(Node c) {
		System.out.println("Node: " + c.getNodeName());
		System.out.println("Value:" + c.getNodeValue());
		System.out.print("Node type = ");

		// Node Type
		switch (c.getNodeType()) {
		case Node.ELEMENT_NODE:
			System.out.println("Element");
			Element e = (Element) c;
			if (e.hasAttributes()) {
				NamedNodeMap attrs = e.getAttributes();
				for (int i = 0; i < attrs.getLength(); i++) {
					Node a = attrs.item(i);
					printNode(a);
				}
			}
			if (e.hasChildNodes()) {
				NodeList children = e.getChildNodes();
				for (int i = 0; i < children.getLength(); i++) {
					Node n = children.item(i);
					printNode(n);
				}
			}
			break;
		case Node.ATTRIBUTE_NODE:
			System.out.println("Attribute");
			break;
		}
	}

}
