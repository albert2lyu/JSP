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
				href="student_main.jsp" target="main">��ҳ</a></td>
		</tr>

		<tr>
			<td width="200px" height="40px" align="center"><a
				href="studentServlet?id=<%=id%>" target="main">������Ϣ</a></td>
		</tr>
		<tr>
			<td width="200px" height="40px" align="center"><a
				href="scoreServlet?id=<%=id%>" target="main">�鿴�ɼ�</a></td>
		</tr>
		<tr>
			<td widht="200px" height="40px" align="center"><a
				href="courseServlet" target="main">�γ�ѡ�� </a></td>
		</tr>
		<tr>
			<td width="200px" height="40px" align="center"><a
				href="changeUserPassword" target="main">�����޸�</a></td>
			<!--  
	<ul >
		<li><a href="student_main.jsp" target="main">��ҳ</a></li>
		<li><a href="studentServlet?id=<%=id%>" target="main">������Ϣ</a></li>
		<li><a href="scoreServlet?id=<%=id%>" target="main">�鿴�ɼ�</a></li>
		<li><a href="courseServlet" target="main">�γ�ѡ��</a></li>
		<li><a href="changeUserPassword" target="main">�����޸�</a></li>
	</ul>
	-->
	</table>
</body>
</html>