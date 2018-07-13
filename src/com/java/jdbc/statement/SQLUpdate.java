package com.java.jdbc.statement;

import java.sql.SQLException;

public interface SQLUpdate {
	void updateSQL() throws SQLException;
	void insertSQL() throws SQLException;
	void deleteSQL() throws SQLException;
}
