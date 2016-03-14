<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="com.lb.sev.studentServlet"%>
<%@ page import="com.lb.pg.Student"%>
<html>
<head>
<title>学生成绩</title>
</head>
<body>
	<center>
		<p align="center">
			<font color="#6666FF" size="+3" face="华文行楷">学生成绩</font>
		</p>
		<table border="2">
			<%
				if (request.getAttribute("Student") != null) {
					ArrayList aList = (ArrayList) request.getAttribute("Student");
					for (int i = 0; i < aList.size(); i++) {
						Student cat = (Student) aList.get(i);
			%>
			<tr>
				<th colspan="2" height=50>学生成绩</th>
			</tr>
			<tr>
				<td width=150 height=50>Java程序设计</td>
				<td width=150 height=50><%=cat.getJava() %></td>
			</tr>
			<tr>
				<td width=150 height=50>Android程序设计</td>
				<td width=150 height=50><%=cat.getAndroid() %></td>
			</tr>
			<tr>
				<td width=150 height=50>Jsp与Servlet</td>
				<td width=150 height=50><%=cat.getJsp() %></td>
			</tr>
			<%
			}
			}
			 %>
		</table>
	</center>
</body>
</html>