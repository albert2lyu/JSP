package com.lb.sev;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lb.DAO.userDAO;
import com.lb.pg.User;

public class Login extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String kind = request.getParameter("kind");
		// System.err.println(id);
		// System.err.println(password);
		// System.err.println(kind);
		userDAO udao = new userDAO();
		User user = null;

		try {
			user = udao.check(id, kind);
			// System.err.println("1");
			if (user.getId().equals(id)) {
				HttpSession session = request.getSession(true);
				session.setAttribute("id", user.getId());
				session.setAttribute("na", user.getName());
				session.setAttribute("pa", user.getCode());
				session.setAttribute("kind", user.getKind());
				// System.err.println(user.getId());
				// System.err.println(user.getName());
				// System.err.println(user.getCode());
				// System.err.println(user.getKind());
				if (kind.equals("admin")) {
					if (password.equals(user.getCode())) {
						// System.out.println(nowtime);
						response.sendRedirect("admin_index.jsp");
					} else {
						response.setHeader("refresh", "2;URL=login.jsp");
						out.print("<font size=5 color=red>ÃÜÂë´íÎó£¡ÇëÖØĞÂµÇÂ¼......</font>");
					}
				} else if (kind.equals("student")) {
					if (password.equals(user.getCode())) {
						response.sendRedirect("student_index.jsp");
					} else {

						response.setHeader("refresh", "2;URL=login.jsp");
						out.print("<font size=5 color=red>ÃÜÂë´íÎó£¡ÇëÖØĞÂµÇÂ¼......</font>");
					}
				}
			}

		} catch (Exception e) {

			response.setHeader("refresh", "2;URL=login.jsp");
			out.print("<font size=5 color=red>ÓÃ»§");
			out.print(id);
			out.print("²»´æÔÚ£¡ÇëÖØĞÂµÇÂ¼......</font>");
		}
		out.flush();
		out.close();
	}

}
