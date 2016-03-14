<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="com.lb.sev.*"%>
<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>学生管理系统头部</title>
</head>
<body bgcolor="#6666FF" width="1100px" height="100px" leftmargin="0" topmargin="0">
<%
	String name = (String) session.getAttribute("na");
 %>

	<table>
		<tr >
			<td width=800px height=100px><img src="img/login_logo.jpg" alt="欢迎登入学生成绩管理系统"></td>
			<td width=300px height=100px align="right" valign="bottom">欢迎你：<%=name %> | <a href="login.jsp" target="_top">退出</a></td>
			</tr>
	</table>
</body>
</html>
