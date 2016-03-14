package com.lb.DAO;

import java.sql.*;
import java.util.ArrayList;

import com.lb.jdbc.DataBaseConnection;
import com.lb.pg.Course;
import com.lb.pg.Student;



public class StudentDAO {


	//通过学号查询学生
	public ArrayList selectStudentById(String id) {
		String ids = id;
		String qstr = "select id ,name, class ,cjavacredit,andriodcredit,jspcredit from Stu where id=" + ids;
		
		ArrayList al = new ArrayList();
		
		Statement stmt = null;
		
		
		try {
			DataBaseConnection db = new DataBaseConnection();
			stmt = db.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(qstr);
			
			while (rs.next()) {
				String sid = rs.getString("id").trim();
				String sname = rs.getString("name").trim();
				String sclass = rs.getString("class").trim();
				String cjava = rs.getString("cjavacredit").trim();
				String candroid = rs.getString("andriodcredit").trim();
				String cjsp = rs.getString("jspcredit").trim();
				Student cat = new Student(sid, sname, sclass, cjava, candroid,
						cjsp);
				al.add(cat);

			}
		} catch (SQLException se) {
			
		} finally {

		}
		return al;
	}
	
	//查询学生
	public ArrayList selectStudent() {
		
		
		String qstr = "select id ,name, class ,cjavacredit,andriodcredit,jspcredit from Stu " ;
		
		ArrayList al = new ArrayList();
		
		Statement stmt = null;
		
		
		try {
			DataBaseConnection db = new DataBaseConnection();
			stmt = db.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(qstr);
			
			while (rs.next()) {
				String sid = rs.getString("id").trim();
				String sname = rs.getString("name").trim();
				String sclass = rs.getString("class").trim();
				String cjava = rs.getString("cjavacredit").trim();
				String candroid = rs.getString("andriodcredit").trim();
				String cjsp = rs.getString("jspcredit").trim();
				Student cat = new Student(sid, sname, sclass, cjava, candroid,
						cjsp);
				al.add(cat);

			}
		} catch (SQLException se) {
			
		} finally {

		}
		return al;
	}
	
	
	// 添加学生信息
		public void addCourse(Student aStudent) {
			String qstr = "Insert Into Stu (id , name, class, cjavacredit, andriodcredit, jspcredit) Values(" + "'"
					+ aStudent.getId()+ "'" + "," + "'" + aStudent.getName()
					+ "'" + "," +"'" + aStudent.getClas() + "'" + "," + "'" + aStudent.getJava() +"'" 
					+ "," + "'" + aStudent.getAndroid() + "'"+ "," + "'" + aStudent.getJsp() +"')";
			Statement stmt = null; 
			try {
				DataBaseConnection dbConnection = new DataBaseConnection();
				stmt = dbConnection.getConnection().createStatement();
				stmt.executeUpdate(qstr);

			} catch (SQLException se) {
				System.out.println("SQLException while Inserting " + "Student "
						+ " : " + se.getMessage());
			} finally {
			
			}
		}
		
		//更新学生信息
		 public void  updateCategory(Student aStudent)	{
			 String qstr = "Update Stu  set name="
		          +"'"+aStudent.getName()+"'"+","+"class=" + "'" + aStudent.getClas() +"'" 
		          + "," + "cjavacredit=" + "'" + aStudent.getJava() + "'" + ","  +
		          "andriodcredit="+ "'" + aStudent.getAndroid() + "'" + "," + "jspcredit=" + 
		          "'" + aStudent.getJsp() + "'" + "  Where id = "+ aStudent.getId();
		        Statement stmt = null;
		        try {
		        	DataBaseConnection dbConnection = new DataBaseConnection();
					stmt = dbConnection.getConnection().createStatement();
		            stmt.executeUpdate(qstr);
		            
		        } catch(SQLException se) {
		            System.out.println("SQLException while Updating " +
		                        "Student "  + " : " + se.getMessage());
		        } finally {
		           
		        }  
		 }	 
		
		
		// 删除学生信息
		public void deleteCourse(String id) {
			String qstr = "Delete Stu " + " Where id = " + id;
			Statement stmt = null;
			try {
				DataBaseConnection dbConnection = new DataBaseConnection();
				stmt = dbConnection.getConnection().createStatement();
				stmt.executeUpdate(qstr);

			} catch (SQLException se) {
				System.out.println("SQLException while deleting " + "Student "
						+ id + " : " + se.getMessage());
			} finally {
				
			}
		}


}
