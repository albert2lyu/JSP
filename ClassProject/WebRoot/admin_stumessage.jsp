<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="com.lb.sev.studentServlet"%>
<%@ page import="com.lb.pg.Student"%>
<html>
<head>
<title>学生信息</title>
</head>
<body>
<p align="center">
			<font color="#6666FF" size="+3" face="华文行楷">学生信息</font>
		</p>
		<p><a href="adminAddStu"><font size="+1" face="华文行楷">新加学生信息</font></a></p>
	<center>
		<table border=1>
			<tr>
				<th width="320px" height="30px" colspan="3" align="center">学生信息</th>
				<th width="350px" height="30px" colspan="5" align="center">
					学生成绩</th>
			</tr>
			<tr>
				<td width="100px" height="30px">学号</td>
				<td width="100px" height="30px">姓名</td>
				<td width="120px" height="30px">班级</td>
				<td width="70px" height="30px">Java</td>
				<td width="70px" height="30px">Android</td>
				<td width="70px" height="30px">Jsp</td>
				<td width="70px" height="30px" >更新</td>
				<td width="70px" height="30px">删除</td>
			</tr>
			<%
				if (request.getAttribute("Student") != null) {
					ArrayList aList = (ArrayList) request.getAttribute("Student");
					for (int i = 0; i < aList.size(); i++) {
						Student cat = (Student) aList.get(i);
			%>
			<tr>
				<td><%=cat.getId() %></td>
				<td><%=cat.getName() %></td>
				<td><%=cat.getClas() %></td>
				<td><%=cat.getJava() %></td>
				<td><%=cat.getAndroid() %></td>
				<td><%=cat.getJsp() %></td>
				<td align="center"><a href="adminUpdateStu?id=<%=cat.getId()%>">更新</a>
				<td align="center"><a href="adminDeleteStu?id=<%=cat.getId()%>">删除</a>
			</tr>
			<%
				}
				}
			%>
		</table>
	</center>
</body>
</html>