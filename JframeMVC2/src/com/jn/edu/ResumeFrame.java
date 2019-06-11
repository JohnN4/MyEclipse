/**
 * 
 */
package com.jn.edu;

import java.awt.Dimension;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author praka
 *
 */
public class ResumeFrame extends JFrame {
	JPanel mainPanel;
	JPanel namePanel;
	JPanel phEmailPanel;
	JPanel addressPanel;
	JPanel objectivePanel;
	JPanel summaryPanel;
	
	JLabel firstNameLabel;
	JLabel lastNameLabel;
	JLabel phoneLabel;
	JLabel emailLabel;
	JLabel addrLine1Label;
	JLabel addrLine2Label; // optional
	JLabel cityLabel;
	JLabel stateLabel;
	JLabel zipCodeLabel;
	
	JLabel summaryLabel;
	JLabel objectiveLabel;
	
	JTextField firstNameTextField;
	JTextField lastNameTextField;
	JTextField phoneTextField;
	JTextField emailTextField;
	JTextField addrLine1TextField;
	JTextField addrLine2TextField; // optional
	JTextField cityTextField;
	JTextField stateTextField;
	JTextField zipCodeTextField;
	
	JTextArea summaryTextArea;
	JTextArea objectiveTextArea;
	
	JButton saveToModelButton;
	JButton exitButton;
	
	JMenuBar mbar;
	JMenu fileMenu;
	JMenuItem clearMenuItem;
	JMenuItem saveMenuItem;
	JMenuItem exitMenuItem;
	
	public ResumeFrame() {
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationByPlatform(true);
		addComponents();
		pack();
		setVisible(true);
	}
	
	public void addComponents() {
		addMenuBar();
		addPanel();
	}
	
	public void addMenuBar() {
		mbar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		mbar.add(fileMenu);
		
		clearMenuItem = new JMenuItem("Clear");
		clearMenuItem.setMnemonic(KeyEvent.VK_C);
		clearMenuItem.addActionListener(e->{RBController.getInstance().clearModel();});
		fileMenu.add(clearMenuItem);
		saveMenuItem = new JMenuItem("Save");
		saveMenuItem.setMnemonic(KeyEvent.VK_S);
		saveMenuItem.addActionListener(e->{RBController.getInstance().setToModel();});
		fileMenu.add(saveMenuItem);
		exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setMnemonic(KeyEvent.VK_X);
		exitMenuItem.addActionListener(e->{System.exit(0);});
		fileMenu.add(exitMenuItem);
		this.setJMenuBar(mbar);
	}
	
	public void addPanel() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		mainPanel.setPreferredSize(new Dimension(800,600));
		addNamePanel();
		addPhEmailPanel();
		addAddressPanel();
		addObjectivePanel();
		addSummaryPanel();
		mainPanel.add(Box.createVerticalGlue());
		mainPanel.add(namePanel);
		mainPanel.add(Box.createVerticalGlue());
		mainPanel.add(phEmailPanel);
		mainPanel.add(Box.createVerticalGlue());
		mainPanel.add(addressPanel);
		mainPanel.add(Box.createVerticalGlue());
		mainPanel.add(objectivePanel);
		mainPanel.add(Box.createVerticalGlue());
		mainPanel.add(summaryPanel);
		mainPanel.add(Box.createVerticalGlue());
		this.add(mainPanel);
	}
	
	public void addNamePanel() {
		namePanel = new JPanel();
		namePanel.setLayout(new BoxLayout(namePanel, BoxLayout.PAGE_AXIS));
		namePanel.setPreferredSize(new Dimension(800, 80));

		JPanel fName = new JPanel();
		fName.setLayout(new BoxLayout(fName, BoxLayout.LINE_AXIS));
		firstNameLabel= new JLabel("First Name: ");
		firstNameTextField = new JTextField();
		firstNameTextField.setSize(new Dimension(250, 25));
		fName.add(Box.createHorizontalGlue());
		fName.add(firstNameLabel);
		fName.add(Box.createHorizontalGlue());
		fName.add(firstNameTextField);
		fName.add(Box.createHorizontalGlue());
		namePanel.add(Box.createVerticalGlue());
		namePanel.add(fName);
		
		JPanel lName = new JPanel();
		lName.setLayout(new BoxLayout(lName, BoxLayout.LINE_AXIS));
		lastNameLabel= new JLabel("Last Name: ");
		lastNameTextField = new JTextField();
		lastNameTextField.setSize(new Dimension(250, 25));
		lName.add(Box.createHorizontalGlue());
		lName.add(lastNameLabel);
		lName.add(Box.createHorizontalGlue());
		lName.add(lastNameTextField);
		lName.add(Box.createHorizontalGlue());

		namePanel.add(Box.createVerticalGlue());
		namePanel.add(lName);
		namePanel.add(Box.createVerticalGlue());
	}
	
	public void addPhEmailPanel() {
		phEmailPanel = new JPanel();
		phEmailPanel.setLayout(new BoxLayout(phEmailPanel, BoxLayout.LINE_AXIS));
		phEmailPanel.setPreferredSize(new Dimension(800, 80));
		
		phoneLabel = new JLabel("Phone number: ");
		phoneTextField = new JTextField();
		phoneTextField.setSize(new Dimension(100,30));
		phEmailPanel.add(Box.createHorizontalGlue());
		phEmailPanel.add(phoneLabel);
		phEmailPanel.add(Box.createHorizontalGlue());
		phEmailPanel.add(phoneTextField);
		phEmailPanel.add(Box.createHorizontalGlue());

		emailLabel = new JLabel("Email Address: ");
		emailTextField = new JTextField();
		emailTextField.setSize(new Dimension(100,30));
		phEmailPanel.add(Box.createHorizontalGlue());
		phEmailPanel.add(emailLabel);
		phEmailPanel.add(Box.createHorizontalGlue());
		phEmailPanel.add(emailTextField);
		phEmailPanel.add(Box.createHorizontalGlue());

	}
	
	public void addAddressPanel() {
		addressPanel = new JPanel();
		addressPanel.setLayout(new BoxLayout(addressPanel, BoxLayout.PAGE_AXIS));
		
		JPanel addr1 = new JPanel();
		addr1.setLayout(new BoxLayout(addr1, BoxLayout.LINE_AXIS));
		addrLine1Label = new JLabel("Address Line 1");
		addrLine1TextField = new JTextField();
		addrLine1TextField.setSize(new Dimension(150,30));
		addr1.add(Box.createHorizontalGlue());
		addr1.add(addrLine1Label);
		addr1.add(Box.createHorizontalGlue());
		addr1.add(addrLine1TextField);
		addr1.add(Box.createHorizontalGlue());
		
		JPanel addr2 = new JPanel();
		addr2.setLayout(new BoxLayout(addr2, BoxLayout.LINE_AXIS));
		addrLine2Label = new JLabel("Address Line 2");
		addrLine2TextField = new JTextField();
		addrLine2TextField.setSize(new Dimension(150,30));
		addr2.add(Box.createHorizontalGlue());
		addr2.add(addrLine2Label);
		addr2.add(Box.createHorizontalGlue());
		addr2.add(addrLine2TextField);
		addr2.add(Box.createHorizontalGlue());
		
		JPanel cityStateZipPanel = new JPanel();
		cityStateZipPanel.setLayout(new BoxLayout(cityStateZipPanel, BoxLayout.LINE_AXIS));
		cityLabel = new JLabel("City");
		cityTextField = new JTextField();
		cityTextField.setSize(new Dimension(150,30));
		stateLabel = new JLabel("State");
		stateTextField = new JTextField();
		stateTextField.setSize(new Dimension(50,30));
		zipCodeLabel = new JLabel("Zip Code");
		zipCodeTextField = new JTextField();
		zipCodeTextField.setSize(new Dimension(100,30));
		cityStateZipPanel.add(Box.createHorizontalGlue());
		cityStateZipPanel.add(cityLabel);
		cityStateZipPanel.add(Box.createHorizontalGlue());
		cityStateZipPanel.add(cityTextField);
		cityStateZipPanel.add(Box.createHorizontalGlue());
		cityStateZipPanel.add(stateLabel);
		cityStateZipPanel.add(Box.createHorizontalGlue());
		cityStateZipPanel.add(stateTextField);
		cityStateZipPanel.add(Box.createHorizontalGlue());
		cityStateZipPanel.add(zipCodeLabel);
		cityStateZipPanel.add(Box.createHorizontalGlue());
		cityStateZipPanel.add(zipCodeTextField);
		cityStateZipPanel.add(Box.createHorizontalGlue());
		
		addressPanel.add(Box.createVerticalGlue());
		addressPanel.add(addr1);
		addressPanel.add(Box.createVerticalGlue());
		addressPanel.add(addr2);
		addressPanel.add(Box.createVerticalGlue());
		addressPanel.add(cityStateZipPanel);
		addressPanel.add(Box.createVerticalGlue());
	}
	
	public void addObjectivePanel() {
		objectivePanel = new JPanel();
		objectivePanel.setLayout(new BoxLayout(objectivePanel, BoxLayout.LINE_AXIS));
		objectiveLabel = new JLabel("Objective: ");
		objectiveTextArea = new JTextArea();
		objectiveTextArea.setSize(new Dimension(600, 200));
		
		objectivePanel.add(Box.createHorizontalGlue());
		objectivePanel.add(objectiveLabel);
		objectivePanel.add(Box.createHorizontalGlue());
		objectivePanel.add(objectiveTextArea);
		objectivePanel.add(Box.createHorizontalGlue());
	}
	
	public void addSummaryPanel() {
		summaryPanel = new JPanel();
		summaryPanel.setLayout(new BoxLayout(summaryPanel, BoxLayout.LINE_AXIS));
		summaryLabel = new JLabel("summary: ");
		summaryTextArea = new JTextArea();
		summaryTextArea.setSize(new Dimension(600, 200));
		
		summaryPanel.add(Box.createHorizontalGlue());
		summaryPanel.add(summaryLabel);
		summaryPanel.add(Box.createHorizontalGlue());
		summaryPanel.add(summaryTextArea);
		summaryPanel.add(Box.createHorizontalGlue());
	}
}
