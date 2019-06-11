package com.jn.edu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Course implements DataAccessCommon {

	int courseId;
	String english;
	String math;
	int grade;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Course(int courseId, String english, String math, int grade) {
		super();
		this.courseId = courseId;
		this.english = english;
		this.math = math;
		this.grade = grade;
	}

	@Override
	public String getSelectStmt() {
		// TODO Auto-generated method stub
		return "select courseId, english, math, grade from course";
	}

	@Override
	public String getInsertStmt() {
		// TODO Auto-generated method stub
		return String.format("insert into course (english, math, grade) values ('%s', '%s', %f)", english, math, grade);
	}

	@Override
	public String updateStud() {
		// TODO Auto-generated method stub
		return "UPDATE course WHERE name=?";
	}

	@Override
	public void setFromResultSet(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		courseId = rs.getInt("id");
		english = rs.getString("english");
		math = rs.getString("math");
		grade = rs.getInt("grade");

	}

	@Override
	public void setUpdateStud(PreparedStatement ps) throws SQLException {
		// TODO Auto-generated method stub

	}

}