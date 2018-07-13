package com.java.jdbc.statement;

import java.sql.SQLException;
import java.sql.Statement;

import com.java.jdbc.connection.DBConnection;
import com.java.jdbc.connection.DatabaseConnection;

public class Update implements SQLUpdate{

	Statement smt;
	
	
	@Override
	public void updateSQL() throws SQLException {

		DBConnection con = new DatabaseConnection();
		con.connect();
		
		smt = con.connect().createStatement();
		String sql = "UPDATE actor SET first_name = 'test', last_name  = 'Wei' where actor_id = 6;";
		
		smt.executeUpdate(sql);
		smt.close();
		con.connect().close();
		
	}

	@Override
	public void insertSQL() throws SQLException {

		DBConnection con = new DatabaseConnection();
		con.connect();
		smt = con.connect().createStatement();
		
		String sql = "INSERT INTO actor(last_name,first_name,actor_id, last_update) VALUES('Lee', 'TEST',08, CURRENT_TIMESTAMP)";
		smt.executeUpdate(sql);
		smt.close();
		
	}

	@Override
	public void deleteSQL() {
		// TODO Auto-generated method stub
		
	}

}
