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

import com.lb.DAO.userDAO;

;

public class User extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建session会话对象
		HttpSession session = request.getSession();
		String selectedScreen = request.getServletPath();
		userDAO uDAO = (userDAO) session.getAttribute("uDAO");
		if (uDAO == null) {
			uDAO = new userDAO();
			session.setAttribute("userDAO", uDAO);
		}

		if (selectedScreen.equals("/changeUserPassword")) {
			//更改密码
			String id = request.getParameter("id");
			String newcode = request.getParameter("newcode");
			if (newcode == null || id == null) {
				selectedScreen = "/student_updatePassword.jsp";
			} else {
				uDAO.changeCode(id, newcode);
				selectedScreen = "/success.jsp";
			}
		} else if (selectedScreen.equals("/AdminSelectUser")) {
			//查询用户信息
			// 创建动态数组
			ArrayList cat = new ArrayList();
			cat = uDAO.getUser();
			request.setAttribute("User", cat);
			selectedScreen = "/admin_usermessage.jsp";
		}else if(selectedScreen.equals("/AdminAddUser")){
			//添加用户
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String kind = request.getParameter("kind");
			String code = request.getParameter("code");
			if(id == null || name == null || kind == null || code == null){
				selectedScreen = "/adim_adduser.jsp";
			}else{
				uDAO.InsertUser(id, name, code, kind);
				selectedScreen = "/AdminSelectUser";
			}
		}else if(selectedScreen.equals("/AdminUpdateUser")){
			//更新用户
			String name = request.getParameter("name");
			String kind = request.getParameter("kind");
			String code = request.getParameter("code");
			if( name == null || kind == null || code == null){
				session.setAttribute("id",request.getParameter("id"));
				selectedScreen = "/admin_updateuser.jsp";
			}else{
				String id  = (String) session.getAttribute("id");
				uDAO.UpdatebyID(id, name, kind, code);
				selectedScreen = "/AdminSelectUser";
			}
		}else if(selectedScreen.equals("/AdminDelUser")){
			//删除用户
			String id = request.getParameter("id");
			uDAO.DeletebyID(id);
			selectedScreen = "/AdminSelectUser";
		}

		RequestDispatcher rd = getServletContext().getRequestDispatcher(
				selectedScreen);
		rd.forward(request, response);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doGet(req, res);

	}

}
