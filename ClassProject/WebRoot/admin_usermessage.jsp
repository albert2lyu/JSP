<%@page import="java.util.ArrayList"%>
<%@page import="com.lb.pg.User"%>
<%@ page contentType="text/html; charset=gb2312"%>
<%@ page import="com.lb.sev.*"%>
<%@ page import="com.lb.pg.Student"%>
<html>
<head>
<title>用户信息</title>
</head>
<body>

	<p align="center">
		<font color="#6666FF" size="+3" face="华文行楷">用户信息</font>
	</p>
	<p>
		<a href="AdminAddUser"><font size="+1" face="华文行楷">新增用户</font></a>
	</p>

	<center>
		<table border="1">
			<tr>
				<td width="100px" height="30px">登入名(ID)</td>
				<td width="100px" height="30px">用户名</td>
				<td width="100px" height="30px">用户类型</td>
				<td width="100px" height="30px">密码</td>
				<td width="100px" height="30px">更新</td>
				<td width="100px" height="30px">删除</td>
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
				<td width="100px" height="30px" align="center"><a href="AdminUpdateUser?id=<%=cat.getId()%>">更新</a></td>
				<td width="100px" height="30px" align="center"><a href="AdminDelUser?id=<%=cat.getId()%>">删除</a></td>
			</tr>
			<%
				}
				}
			%>
		</table>
	</center>
</body>
</html>