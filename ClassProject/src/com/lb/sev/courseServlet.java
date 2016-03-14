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
		// ����session�Ự����
		HttpSession session = request.getSession();
		String selectedScreen = request.getServletPath();
		courseDAO goodsDAO = (courseDAO) session.getAttribute("goodsDAO");
		if (goodsDAO == null) {
			goodsDAO = new courseDAO();
			session.setAttribute("goodsDAO", goodsDAO);
		}

		if (selectedScreen.equals("/courseServlet")) {
			//ѧ����ѯ�γ�
			// ������̬����
			ArrayList cat = new ArrayList();
			cat = goodsDAO.getCategories();
			request.setAttribute("Goods", cat);
			selectedScreen = "/student_course.jsp";
		}else if(selectedScreen.equals("/adminCourse")){ 
			//����Ա��ѯ�γ�
			// ������̬����
						ArrayList cat = new ArrayList();
						cat = goodsDAO.getCategories();
						request.setAttribute("Goods", cat);
						selectedScreen = "/admin_stucourse.jsp";
		}else if (selectedScreen.equals("/addcourseServlet")) {
			//ѧ�����ӿγ̣�ѡ�Σ�
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
			//����Ա��ӿγ�
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
			//����Ա���¿γ���Ϣ
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
			//ѧ��ɾ��ѧ���γ̣��˿Σ�
			int id = Integer.parseInt(request.getParameter("id"));
			goodsDAO.deleteCourse(id);
			selectedScreen = "/courseServlet";
		}else if(selectedScreen.equals("/adminDelcourse")){
			//����Աɾ��ѧ���γ�
			int id = Integer.parseInt(request.getParameter("id"));
			goodsDAO.deleteCourse(id);
			selectedScreen = "/adminCourse";
		}
		// ��ת��ָ��ҳ��
		RequestDispatcher rd = getServletContext().getRequestDispatcher(
				selectedScreen);
		rd.forward(request, response);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doGet(req, res);
	}
}
