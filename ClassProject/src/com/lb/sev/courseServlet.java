package com.lb.sev;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lb.DAO.courseDAO;
import com.lb.pg.Course;

public class courseServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建session会话对象
		HttpSession session = request.getSession();
		String selectedScreen = request.getServletPath();
		courseDAO goodsDAO = (courseDAO) session.getAttribute("goodsDAO");
		if (goodsDAO == null) {
			goodsDAO = new courseDAO();
			session.setAttribute("goodsDAO", goodsDAO);
		}

		if (selectedScreen.equals("/courseServlet")) {
			//学生查询课程
			// 创建动态数组
			ArrayList cat = new ArrayList();
			cat = goodsDAO.getCategories();
			request.setAttribute("Goods", cat);
			selectedScreen = "/student_course.jsp";
		}else if(selectedScreen.equals("/adminCourse")){ 
			//管理员查询课程
			// 创建动态数组
						ArrayList cat = new ArrayList();
						cat = goodsDAO.getCategories();
						request.setAttribute("Goods", cat);
						selectedScreen = "/admin_stucourse.jsp";
		}else if (selectedScreen.equals("/addcourseServlet")) {
			//学生增加课程（选课）
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			String teacher = request.getParameter("teacher");
			String ccredit = request.getParameter("credit");
			if (name == null || id == null || teacher == null || ccredit == null) {
				selectedScreen = "/student_addcourse.jsp";
			} else {
				Course aCourse = new Course(name, id, teacher, ccredit);
				goodsDAO.addCourse(aCourse);
				selectedScreen = "/courseServlet";
			}
		}else if(selectedScreen.equals("/adminAddcourse")){
			//管理员添加课程
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			String teacher = request.getParameter("teacher");
			String ccredit = request.getParameter("credit");
			if (name == null || id == null || teacher == null || ccredit == null) {
				selectedScreen = "/admin_addcourse.jsp";
			} else {
				Course aCourse = new Course(name, id, teacher, ccredit);
				goodsDAO.addCourse(aCourse);
				selectedScreen = "/adminCourse";
			}
		}else if(selectedScreen.equals("/adminUpdatecourse")){
			//管理员更新课程信息
			String name = request.getParameter("name");
			String id = request.getParameter("cid");
			String teacher = request.getParameter("teacher");
			String ccredit = request.getParameter("credit");
			if (name == null || id == null || teacher == null || ccredit == null) {
				session.setAttribute("id",request.getParameter("id"));
				selectedScreen = "/admin_updatecourse.jsp";
			}else{
				String cidString  = (String) session.getAttribute("id");
				int cid = Integer.parseInt(cidString);
				Course aCourse = new Course(cid,name, id, teacher, ccredit);
				goodsDAO.updateCourse(aCourse);
				selectedScreen = "/adminCourse";
			}
				
			
		}else if (selectedScreen.equals("/delcourseServlet")) {
			//学生删除学生课程（退课）
			int id = Integer.parseInt(request.getParameter("id"));
			goodsDAO.deleteCourse(id);
			selectedScreen = "/courseServlet";
		}else if(selectedScreen.equals("/adminDelcourse")){
			//管理员删除学生课程
			int id = Integer.parseInt(request.getParameter("id"));
			goodsDAO.deleteCourse(id);
			selectedScreen = "/adminCourse";
		}
		// 跳转到指定页面
		RequestDispatcher rd = getServletContext().getRequestDispatcher(
				selectedScreen);
		rd.forward(request, response);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doGet(req, res);
	}
}
