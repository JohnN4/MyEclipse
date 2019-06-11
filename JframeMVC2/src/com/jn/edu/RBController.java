/**
 * 
 */
package com.jn.edu;

/**
 * @author praka
 *
 */
public class RBController {
	private static RBController singleton = null;
	private ResumeModel theModel;
	private ResumeFrame theView;	
	
	public void createModel() {
		theModel = new ResumeModel();
	}
	
	public void clearModel() {
		theModel.clear();
		setFromModel();
	}
	
	public void setToModel() {
		
		theModel.firstName = theView.firstNameTextField.getText();
		theModel.lastName = theView.lastNameTextField.getText();
		theModel.addressStreet1 = theView.addrLine1TextField.getText();
		theModel.addressStreet2 = theView.addrLine2TextField.getText();
		theModel.addressCity = theView.cityTextField.getText();
		theModel.addressState = theView.stateTextField.getText();
		theModel.addressZip = theView.zipCodeTextField.getText();
		theModel.phoneNumber = theView.phoneTextField.getText();
		theModel.emailAddress = theView.emailTextField.getText();
		theModel.objective = theView.objectiveTextArea.getText();
		theModel.summary = theView.summaryTextArea.getText();
	}
	
	public void setFromModel() {
		theView.firstNameTextField.setText(theModel.firstName);
		theView.lastNameTextField.setText(theModel.lastName);
		theView.addrLine1TextField.setText(theModel.addressStreet1);
		theView.addrLine2TextField.setText(theModel.addressStreet2);
		theView.cityTextField.setText(theModel.addressCity);
		theView.stateTextField.setText(theModel.addressState);
		theView.zipCodeTextField.setText(theModel.addressZip);
		theView.phoneTextField.setText(theModel.phoneNumber);
		theView.emailTextField.setText(theModel.emailAddress);
		theView.objectiveTextArea.setText(theModel.objective);
		theView.summaryTextArea.setText(theModel.summary);
	}
	
	public static RBController getInstance() {
		if (singleton == null)
			singleton = new RBController();
		return singleton;
	}

	public static void main(String[] args) {
		RBController theInstance = RBController.getInstance();
		theInstance.createModel();
		theInstance.theView = new ResumeFrame();
	}
	
}
