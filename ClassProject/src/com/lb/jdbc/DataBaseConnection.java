package com.lb.jdbc;

import java.sql.*;

public class DataBaseConnection {

	public Connection db;

	public DataBaseConnection() {

	}

	public Connection getConnection() {
		try {
			// ������������
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// ���������ݿ������
			db = DriverManager
					.getConnection("jdbc:odbc:DateBase", "sa", "1234");
		} catch (ClassNotFoundException e1) {
		} catch (SQLException e2) {
		}
		return db;
	}
}
