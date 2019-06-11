/**
 * 
 */
package com.jn.edu;

import java.util.ArrayList;

/**
 * <p><strong>ResumeModel<strong> is the internal representation of resume for the MVC architecture</p>
 * @author praka
 *
 */
public class ResumeModel {
	String firstName;
	String middleNames;
	String lastName;
	String addressStreet1;
	String addressStreet2;
	String addressCity;
	String addressState;
	String addressZip;
	String phoneNumber;
	String emailAddress;
	String objective;
	String summary;
	//ArrayList<EducationItem> education;
	/**
	 * 
	 */
	public ResumeModel() {
		clear();
	}
	/**
	 * @param firstName
	 * @param middleNames
	 * @param lastName
	 * @param addressStreet1
	 * @param addressStreet2
	 * @param addressCity
	 * @param addressState
	 * @param addressZip
	 * @param phoneNumber
	 * @param emailAddress
	 * @param objective
	 * @param summary
	 */
	public ResumeModel(String firstName, String middleNames, String lastName, String addressStreet1,
			String addressStreet2, String addressCity, String addressState, String addressZip, String phoneNumber,
			String emailAddress, String objective, String summary) {
		this.firstName = firstName;
		this.middleNames = middleNames;
		this.lastName = lastName;
		this.addressStreet1 = addressStreet1;
		this.addressStreet2 = addressStreet2;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressZip = addressZip;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.objective = objective;
		this.summary = summary;
	}
	public void clear() {
		firstName = new String();
		middleNames = new String();
		lastName = new String();
		addressStreet1 = new String();
		addressStreet2 = new String();
		addressCity = new String();
		addressState = new String();
		addressZip = new String();
		phoneNumber = new String();
		emailAddress = new String();
		objective = new String();
		summary = new String();
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the middleNames
	 */
	public String getMiddleNames() {
		return middleNames;
	}
	/**
	 * @param middleNames the middleNames to set
	 */
	public void setMiddleNames(String middleNames) {
		this.middleNames = middleNames;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the addressStreet1
	 */
	public String getAddressStreet1() {
		return addressStreet1;
	}
	/**
	 * @param addressStreet1 the addressStreet1 to set
	 */
	public void setAddressStreet1(String addressStreet1) {
		this.addressStreet1 = addressStreet1;
	}
	/**
	 * @return the addressStreet2
	 */
	public String getAddressStreet2() {
		return addressStreet2;
	}
	/**
	 * @param addressStreet2 the addressStreet2 to set
	 */
	public void setAddressStreet2(String addressStreet2) {
		this.addressStreet2 = addressStreet2;
	}
	/**
	 * @return the addressCity
	 */
	public String getAddressCity() {
		return addressCity;
	}
	/**
	 * @param addressCity the addressCity to set
	 */
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	/**
	 * @return the addressState
	 */
	public String getAddressState() {
		return addressState;
	}
	/**
	 * @param addressState the addressState to set
	 */
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
	/**
	 * @return the addressZip
	 */
	public String getAddressZip() {
		return addressZip;
	}
	/**
	 * @param addressZip the addressZip to set
	 */
	public void setAddressZip(String addressZip) {
		this.addressZip = addressZip;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the objective
	 */
	public String getObjective() {
		return objective;
	}
	/**
	 * @param objective the objective to set
	 */
	public void setObjective(String objective) {
		this.objective = objective;
	}
	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	

}
