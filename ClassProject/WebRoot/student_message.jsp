<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="com.lb.sev.studentServlet"%>
<%@ page import="com.lb.pg.Student"%>
<html>
<head>
<title>ѧ����Ϣ</title>
</head>
<body>
	<center>
		<p align="center">
			<font color="#6666FF" size="+3" face="�����п�">ѧ��������Ϣ</font>
		</p>
		<table border=1>
			<%
				if (request.getAttribute("Student") != null) {
					ArrayList aList = (ArrayList) request.getAttribute("Student");
					for (int i = 0; i < aList.size(); i++) {
						Student cat = (Student) aList.get(i);
			%>
			<tr>
				<th colspan="2" align="center" height=50>ѧ����Ϣ</th>
			<tr>
			<tr>
				<td width=100 height=50>����:</td>
				<td width=200 height=50><%=cat.getName()%></td>


			</tr>
			<tr>
				<td width=100 height=50>ѧ��:</td>
				<td width=200 height=50><%=cat.getId()%></td>

			</tr>
			<tr>
				<td width=100 height=50>�༶:</td>
				<td width=200 height=50><%=cat.getClas()%>
			</tr>
			<%
				}
				}
			%>
		</table>
	</center>
</body>
</html>