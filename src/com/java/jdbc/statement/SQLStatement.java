package com.java.jdbc.statement;

import java.sql.SQLException;

public interface SQLStatement {
	
	void selectStatementForActor() throws SQLException;
	void selectOnlyNameFromActor() throws SQLException;

}
