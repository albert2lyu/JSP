package com.lb.sev;

import java.io.IOException;
import java.util.ArrayList;

import javax.persistence.Id;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lb.DAO.StudentDAO;
import com.lb.DAO.userDAO;
import com.lb.pg.Student;

public class studentServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建session会话对象
		HttpSession session = request.getSession(true);
		String selectedScreen = request.getServletPath();
		StudentDAO stuDAO = (StudentDAO) session.getAttribute("stuDAO");
		if (stuDAO == null) {
			stuDAO = new StudentDAO();
			session.setAttribute("stuDAO", stuDAO);
		}
		if (selectedScreen.equals("/studentServlet")) {
			String idString = request.getParameter("id");

			// 创建动态数组
			ArrayList cat = new ArrayList();
			cat = stuDAO.selectStudentById(idString);
			request.setAttribute("Student", cat);
			selectedScreen = "/student_message.jsp";

		}else if (selectedScreen.equals("/scoreServlet")) {
			String idString = request.getParameter("id");

			// 创建动态数组
			ArrayList cat = new ArrayList();
			cat = stuDAO.selectStudentById(idString);
			request.setAttribute("Student", cat);
			selectedScreen = "/student_score.jsp";
		}else if(selectedScreen.equals("/adminSelect")){
			// 创建动态数组
			ArrayList cat = new ArrayList();
			cat = stuDAO.selectStudent();
			request.setAttribute("Student", cat);
			selectedScreen = "/admin_stumessage.jsp";
		}
		else if(selectedScreen.equals("/adminAddStu")){
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String clas = request.getParameter("class");
			String java = request.getParameter("java");
			String android =  request.getParameter("android");
			String jsp = request.getParameter("jsp");
			if(id == null || name == null || clas == null || java  == null || android  == null|| jsp  == null){
				selectedScreen = "/admin_addstu.jsp";
			}else{
				Student student = new Student(id, name, clas, java, android, jsp);
				stuDAO.addCourse(student);
				selectedScreen = "/adminSelect";
			}
			
		}else if(selectedScreen.equals("/adminUpdateStu")){
			String name = request.getParameter("name");
			String clas = request.getParameter("class");
			String java = request.getParameter("java");
			String android =  request.getParameter("android");
			String jsp = request.getParameter("jsp");
			if( name == null || clas == null || java == null || android == null || jsp == null){
				//session.setAttribute("id",request.getParameter("id"));
				session.setAttribute("id",request.getParameter("id"));
				//request.setAttribute("action",request.getParameter("id"));
				selectedScreen = "/admin_updatestu.jsp";
			}else{
				// String id =(String)session.getAttribute("id");
				//String action = request.getParameter("action");
				  String id =(String)session.getAttribute("id");
				 System.err.println(id);
				 System.err.println(name);
				 System.err.println(clas);
				 System.err.println(java);
				 System.err.println(android);
				Student student = new Student( id, name, clas, java, android, jsp);
				stuDAO.updateCategory(student);
				selectedScreen = "/adminSelect";
			}
			
		}else if(selectedScreen.equals("/adminDeleteStu")){
			String id = request.getParameter("id");
			stuDAO.deleteCourse(id);
			selectedScreen = "/adminSelect";
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(selectedScreen);
		rd.forward(request, response);
	}
}