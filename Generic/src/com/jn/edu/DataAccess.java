/**
 * 
 */
package com.jn.edu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author praka
 *
 */
public class DataAccess<T extends DataAccessCommon> {
	private Class<T> thisObj;

	public DataAccess(Class<T> obj) {
		thisObj = obj;
	}

	public int insert(Connection c, T instance) throws SQLException {
		int retVal = 0;
		try {
			// T myNewT = thisObj.newInstance();
			String query = instance.getInsertStmt();
			Statement stmt = c.createStatement();
			retVal = stmt.executeUpdate(query);
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}

	public ArrayList<T> getAll(Connection c) throws SQLException {
		ArrayList<T> ret = new ArrayList<T>();
		try {
			T myNewT = thisObj.newInstance();
			String query = myNewT.getSelectStmt();
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				T anotherT = thisObj.newInstance();
				anotherT.setFromResultSet(rs);
				ret.add(anotherT);
			}
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	public T getById(Connection c, int id) throws SQLException {
		T ret = null;
		try {
			T myNewT = thisObj.newInstance();
			String query = myNewT.getSelectStmt() + " where id = " + id;
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next()) {
				ret = thisObj.newInstance();
				ret.setFromResultSet(rs);
			}
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	public T updateStud(Connection c) throws SQLException {
		T id = null;
		try {
			T myId = thisObj.newInstance();
			String query = myId.updateStud();
			PreparedStatement ps = c.prepareStatement(query);
			myId.setUpdateStud(ps);
			ps.executeUpdate();

		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return id;
	}
}
