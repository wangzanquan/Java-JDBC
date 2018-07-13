package com.java.jdbc.statement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.jdbc.connection.DBConnection;
import com.java.jdbc.connection.DatabaseConnection;

public class SelectStatement implements SQLStatement {

	Statement smt;

	public void selectStatementForActor() throws SQLException {

		DBConnection con = new DatabaseConnection();
		con.connect();

		smt = con.connect().createStatement();
		String sql = "Select * From actor;";

		ResultSet rs = smt.executeQuery(sql);

		while (rs.next()) {
			int id = rs.getInt("actor_id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			String last = rs.getString("last_update");

			System.out.print("ID: " + id);
			System.out.print(", First Name : " + firstName);
			System.out.print(", Last Name: " + lastName);
			System.out.println(", Last Update: " + last);

		}
		rs.close();
		smt.close();
		con.connect().close();

	}

	public void selectOnlyNameFromActor() throws SQLException {

		DBConnection con = new DatabaseConnection();
		con.connect();

		smt = con.connect().createStatement();
		String sql = "Select first_name,last_name From actor;";

		ResultSet rs = smt.executeQuery(sql);

		while (rs.next()) {

			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");

			System.out.print("\n First Name : " + firstName);
			System.out.print("	\t Last Name: " + lastName);

		}
		rs.close();
		smt.close();
		con.connect().close();

	}

}
