package com.java.jdbc.demo;

import java.sql.SQLException;

import com.java.jdbc.statement.SQLStatement;
import com.java.jdbc.statement.SelectStatement;

public class Application {

	public static void main(String[] args) throws SQLException {
		
		SQLStatement select = new SelectStatement();
		select.selectStatementForActor();
		select.selectOnlyNameFromActor();

	}

}
