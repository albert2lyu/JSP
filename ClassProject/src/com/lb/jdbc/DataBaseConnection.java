package com.lb.jdbc;

import java.sql.*;

public class DataBaseConnection {

	public Connection db;

	public DataBaseConnection() {

	}

	public Connection getConnection() {
		try {
			// 加载驱动程序
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// 创建与数据库的连接
			db = DriverManager
					.getConnection("jdbc:odbc:DateBase", "sa", "1234");
		} catch (ClassNotFoundException e1) {
		} catch (SQLException e2) {
		}
		return db;
	}
}
