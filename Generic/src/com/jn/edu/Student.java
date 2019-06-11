/**
 * 
 */
package com.jn.edu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author praka
 *
 */
public class Student implements DataAccessCommon {
	int id;
	String lName;
	String fName;
	double gpa;

	/**
	 * 
	 */
	public Student() {
	}

	/**
	 * @param lName
	 * @param fName
	 * @param gpa
	 */
	public Student(String lName, String fName, double gpa) {
		this.lName = lName;
		this.fName = fName;
		this.gpa = gpa;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
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

	public String getSelectStmt() {
		return "select id, lname, fname, gpa from student";
	}

	public String getInsertStmt() {
		return String.format("insert into student (lname, fname, gpa) values ('%s', '%s', %f)", lName, fName, gpa);
	}

	public void setFromResultSet(ResultSet rs) throws SQLException {
		id = rs.getInt("id");
		lName = rs.getString("lname");
		fName = rs.getString("fname");
		gpa = rs.getDouble("gpa");
	}

	public String updateStud() {
		return "UPDATE student WHERE name=?";

	}

	public void setUpdateStud(PreparedStatement ps) throws SQLException {
		ps.setString(1, "lname");

	}

	public String toString() {
		return id + "-" + lName + ", " + fName + ": " + gpa;
	}
}
