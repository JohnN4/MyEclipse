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
public interface DataAccessCommon {
	public String getSelectStmt();

	public String getInsertStmt();

	public String updateStud();

	public void setFromResultSet(ResultSet rs) throws SQLException;

	public void setUpdateStud(PreparedStatement ps) throws SQLException;
}
