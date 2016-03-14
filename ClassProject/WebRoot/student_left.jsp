<%@ page contentType="text/html; charset=gb2312" import="java.util.*"%>
<link rel="stylesheet" href="css/index.css" type="text/css">
<%@ page import="com.lb.sev.*"%>
<html>
<head>
<title>left_list</title>
</head>
<body bgcolor="#6666FF" width="200px" height="500px">
	<table width="200px">
		<%
			String id = (String) session.getAttribute("id");
		%>
		<tr>
			<td width="200px" height="40px" align="center"><a
				href="student_main.jsp" target="main">首页</a></td>
		</tr>

		<tr>
			<td width="200px" height="40px" align="center"><a
				href="studentServlet?id=<%=id%>" target="main">个人信息</a></td>
		</tr>
		<tr>
			<td width="200px" height="40px" align="center"><a
				href="scoreServlet?id=<%=id%>" target="main">查看成绩</a></td>
		</tr>
		<tr>
			<td widht="200px" height="40px" align="center"><a
				href="courseServlet" target="main">课程选择 </a></td>
		</tr>
		<tr>
			<td width="200px" height="40px" align="center"><a
				href="changeUserPassword" target="main">密码修改</a></td>
			<!--  
	<ul >
		<li><a href="student_main.jsp" target="main">首页</a></li>
		<li><a href="studentServlet?id=<%=id%>" target="main">个人信息</a></li>
		<li><a href="scoreServlet?id=<%=id%>" target="main">查看成绩</a></li>
		<li><a href="courseServlet" target="main">课程选择</a></li>
		<li><a href="changeUserPassword" target="main">密码修改</a></li>
	</ul>
	-->
	</table>
</body>
</html>