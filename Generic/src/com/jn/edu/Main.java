/**
 * 
 */
package com.jn.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author praka
 *
 */
public class Main {
	Connection c;

	/**
	 * 
	 */
	public Main() {
		c = null;
	}

	public void connect() {
		try {
			c = DriverManager.getConnection("path");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main m = new Main();
		m.connect();// m
		DataAccess<Student> da = new DataAccess<Student>(Student.class);
		Scanner in = new Scanner(System.in);
		System.out.println("Enter next student last name, or done: ");
		String nextStudent = in.next();
		while (!nextStudent.equals("done")) {
			String lName = nextStudent;
			System.out.println("Enter student first name: ");
			String fName = in.next();
			System.out.println("Enter student gpa: ");
			double gpa = in.nextDouble();
			Student s = new Student(lName, fName, gpa);// s
			try {
				int rowsInserted = da.insert(m.c, s);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				break;
			}

			System.out.println("Enter next student last name, or done: ");
			nextStudent = in.next();
		}
		try {
			System.out.println("Entered. Now getting all");
			ArrayList<Student> allStudents = da.getAll(m.c);
			for (Student s : allStudents)
				System.out.println(s.id + "-" + s.lName + ", " + s.fName + ": " + s.gpa);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		in.close();
	}

}
