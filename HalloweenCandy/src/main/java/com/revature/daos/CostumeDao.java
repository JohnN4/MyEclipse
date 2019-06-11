package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.frontcontroller.Costume;
import com.revature.util.ConnectionUtil;

public class CostumeDao {
	public Costume extractCostume(ResultSet rs) throws SQLException {
		Costume costume = new Costume();
		costume.setId(rs.getInt("id"));
		costume.setGenre(rs.getString("genre"));
		costume.setAuthenticity(rs.getInt("authenticity"));
		costume.setCreativeness(rs.getInt("creativeness"));
		costume.setCuteness(rs.getInt("cuteness"));
		costume.setScariness(rs.getInt("scariness"));
		costume.setName(rs.getString("name"));
		return costume;
	}
	
	public Costume getById(int id) {
		String query = "SELECT * FROM costumes WHERE id = ?";
		try(Connection conn = ConnectionUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				Costume costume = new Costume();
				costume.setId(rs.getInt("id"));
				costume.setGenre(rs.getString("genre"));
				costume.setAuthenticity(rs.getInt("authenticity"));
				costume.setCreativeness(rs.getInt("creativeness"));
				costume.setCuteness(rs.getInt("cuteness"));
				costume.setScariness(rs.getInt("scariness"));
				costume.setName(rs.getString("name"));
				return costume;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Costume save(Costume costume) {
		String query = "INSERT INTO costumes (genre, authenticity,"
				+ "	creativeness, cuteness, scariness, name) VALUES"
				+ " (?, ?, ?, ?, ?, ?) RETURNING *";
		try(Connection conn = ConnectionUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, costume.getGenre().toLowerCase());
			ps.setInt(2, costume.getAuthenticity());
			ps.setInt(3, costume.getCreativeness());
			ps.setInt(4, costume.getCuteness());
			ps.setInt(5, costume.getScariness());
			ps.setString(6, costume.getName());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return extractCostume(rs);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
	

