package com.lb.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.lb.jdbc.DataBaseConnection;
import com.lb.pg.Course;
import com.lb.pg.Student;


public class courseDAO {

	//查询课程
	public ArrayList getCategories() {
		String qstr = "select *from course ";
		ArrayList al = new ArrayList();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			DataBaseConnection dbConnection = new DataBaseConnection();
			stmt = dbConnection.getConnection().createStatement();
			rs = stmt.executeQuery(qstr);
			while (rs.next()) {
				int id = rs.getInt("id");
				String cname = rs.getString("name").trim();
				String cid = rs.getString("cid").trim();
				String ctea = rs.getString("cteacher").trim();
				String credit = rs.getString("credit").trim();;
				Course cat = new Course(id,cname, cid, ctea, credit);
				al.add(cat);
			}
		} catch (SQLException se) {
			System.out.println("SQLException while getting "
					+ "multiple categories : " + se.getMessage());
		} finally {
			// closeResultSet(rs);
			// closeStatement(stmt);
			// closeConnection();
		}
		return al;
	}

	// 添加课程
	public void addCourse(Course aCourse) {
		String qstr = "Insert Into course (name , cid, cteacher, credit) Values(" + "'"
				+ aCourse.getCname()+ "'" + "," + "'" + aCourse.getCid()
				+ "'" + "," +"'" + aCourse.getCteacher() + "'" + "," + "'" + aCourse.getCredit() +"')";
		Statement stmt = null;
		try {
			DataBaseConnection dbConnection = new DataBaseConnection();
			stmt = dbConnection.getConnection().createStatement();
			stmt.executeUpdate(qstr);

		} catch (SQLException se) {
			System.out.println("SQLException while Inserting " + "Course "
					+ " : " + se.getMessage());
		} finally {
		
		}
	}
	
	//更新课程
	 public void  updateCourse(Course aCourse)	{
		 String qstr = "Update Course  set name="
	          +"'"+ aCourse.getCname() +"'"+","+"cid=" + "'" + aCourse.getCid() +"'" 
	          + "," + "cteacher=" + "'" + aCourse.getCteacher() + "'" + ","  +
	          "credit="+ "'" + aCourse.getCredit() + "'"  + "  Where id = "+ aCourse.getId();
	        Statement stmt = null;
	        try {
	        	DataBaseConnection dbConnection = new DataBaseConnection();
				stmt = dbConnection.getConnection().createStatement();
	            stmt.executeUpdate(qstr);
	            
	        } catch(SQLException se) {
	            System.out.println("SQLException while Updating " +
	                        "Course "  + " : " + se.getMessage());
	        } finally {
	           
	        }  
	 }	 
	
	

	// 删除课程（退课）
	public void deleteCourse(int id) {
		String qstr = "Delete course " + " Where id = " + id;
		Statement stmt = null;
		try {
			DataBaseConnection dbConnection = new DataBaseConnection();
			stmt = dbConnection.getConnection().createStatement();
			stmt.executeUpdate(qstr);

		} catch (SQLException se) {
			System.out.println("SQLException while deleting " + "Course "
					+ id + " : " + se.getMessage());
		} finally {
			
		}
	}

}
