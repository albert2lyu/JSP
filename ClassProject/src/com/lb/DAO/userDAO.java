package com.lb.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.lb.jdbc.DataBaseConnection;
import com.lb.pg.User;

public class userDAO {

	public ArrayList getUser() {
		String qstr = "select *from Users ";
		ArrayList al = new ArrayList();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			DataBaseConnection dbConnection = new DataBaseConnection();
			stmt = dbConnection.getConnection().createStatement();
			rs = stmt.executeQuery(qstr);
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String code = rs.getString("code");
				String kind = rs.getString("kind");
				User user = new User(id, name, code, kind);
				al.add(user);
			}
		} catch (SQLException se) {
			System.out.println("SQLException while getting "
					+ "multiple categories : " + se.getMessage());
		} finally {
		}
		return al;
	}

	public User check(String id, String kind) throws Exception {
		User user = new User();
		String sql = "SELECT * FROM Users WHERE id='" + id + "'and kind='"
				+ kind + "'";
		Statement stmt = null;
		DataBaseConnection dbc = new DataBaseConnection();
		try {
			stmt = dbc.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setCode(rs.getString("code"));
				user.setKind(rs.getString("kind"));
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			throw new Exception("查询中出现错误！！！");
		} finally {
			// dbc.close();
		}
		System.err.println("erro");
		return user;
	}

	// 添加学生
	public void InsertUser(String id, String name, String code, String kind) {
		String sql = "INSERT INTO Users(id,name,code,kind) VALUES('" + id
				+ "','" + name + "','" + code + "','" + kind + "');";
		Statement stmt = null;
		DataBaseConnection dbc = null;
		dbc = new DataBaseConnection();

		try {
			stmt = dbc.getConnection().createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
		} catch (Exception e) {

		} finally {
			// dbc.close();

		}
	}

	// 删除
	public void DeletebyID(String id) {
		String sql = "DELETE FROM Users WHERE id='" + id + "';";
		Statement stmt = null;
		DataBaseConnection dbc = null;
		dbc = new DataBaseConnection();
		try {
			stmt = dbc.getConnection().createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
		} catch (Exception e) {

		} finally {
			// dbc.close();

		}
	}

	// 更新学生信息
	public void UpdatebyID(String id, String name, String kind, String code) {
		String sql = "UPDATE Users set name='" + name + "',kind='" + kind
				+ "',code='" + code + "' WHERE id='" + id + "';";
		Statement stmt = null;
		DataBaseConnection dbc = null;
		dbc = new DataBaseConnection();

		try {
			stmt = dbc.getConnection().createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
		} catch (Exception e) {

		} finally {
			// dbc.close();

		}
	}

	// 更改密码
	public void changeCode(String id, String code) {
		String sql = "UPDATE Users set code='" + code + "' WHERE id='" + id
				+ "';";
		Statement stmt = null;
		DataBaseConnection dbc = null;
		dbc = new DataBaseConnection();

		try {
			stmt = dbc.getConnection().createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
		} catch (Exception e) {

		} finally {
			// dbc.close();

		}
	}

}
