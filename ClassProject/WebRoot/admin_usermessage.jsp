<%@page import="java.util.ArrayList"%>
<%@page import="com.lb.pg.User"%>
<%@ page contentType="text/html; charset=gb2312"%>
<%@ page import="com.lb.sev.*"%>
<%@ page import="com.lb.pg.Student"%>
<html>
<head>
<title>�û���Ϣ</title>
</head>
<body>

	<p align="center">
		<font color="#6666FF" size="+3" face="�����п�">�û���Ϣ</font>
	</p>
	<p>
		<a href="AdminAddUser"><font size="+1" face="�����п�">�����û�</font></a>
	</p>

	<center>
		<table border="1">
			<tr>
				<td width="100px" height="30px">������(ID)</td>
				<td width="100px" height="30px">�û���</td>
				<td width="100px" height="30px">�û�����</td>
				<td width="100px" height="30px">����</td>
				<td width="100px" height="30px">����</td>
				<td width="100px" height="30px">ɾ��</td>
			</tr>
			<%
				if (request.getAttribute("User") != null) {
					ArrayList aList = (ArrayList) request.getAttribute("User");
					for (int i = 0; i < aList.size(); i++) {
						User cat = (User) aList.get(i);
			%>
			<tr>
				<td width="100px" height="30px"><%=cat.getId()%></td>
				<td width="100px" height="30px"><%=cat.getName()%></td>
				<td width="100px" height="30px"><%=cat.getKind()%></td>
				<td width="100px" height="30px"><%=cat.getCode()%></td>
				<td width="100px" height="30px" align="center"><a href="AdminUpdateUser?id=<%=cat.getId()%>">����</a></td>
				<td width="100px" height="30px" align="center"><a href="AdminDelUser?id=<%=cat.getId()%>">ɾ��</a></td>
			</tr>
			<%
				}
				}
			%>
		</table>
	</center>
</body>
</html>