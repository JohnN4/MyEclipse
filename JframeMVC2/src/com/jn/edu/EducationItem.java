/**
 * 
 */
package com.jn.edu;

/**
 * @author praka
 *
 */
public class EducationItem {
	String institution;
	String location; // don't need full address on the resume anyway
	String degree;
	String major;
	double gpa;
	String additionalInfo;
	/**
	 * 
	 */
	public EducationItem() {
	}
	/**
	 * @param institution
	 * @param location
	 * @param degree
	 * @param major
	 * @param gpa
	 * @param additionalInfo
	 */
	public EducationItem(String institution, String location, String degree, String major, double gpa,
			String additionalInfo) {
		this.institution = institution;
		this.location = location;
		this.degree = degree;
		this.major = major;
		this.gpa = gpa;
		this.additionalInfo = additionalInfo;
	}
	/**
	 * @return the institution
	 */
	public String getInstitution() {
		return institution;
	}
	/**
	 * @param institution the institution to set
	 */
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}
	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}
	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}
	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}
	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	/**
	 * @return the additionalInfo
	 */
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	/**
	 * @param additionalInfo the additionalInfo to set
	 */
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
}
