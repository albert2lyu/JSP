<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="com.lb.sev.*" %> 
<%@ page import="com.lb.pg.*"%>
<html>
<head><title>学生选课情况</title></head>
<body>
<p>&nbsp;</p>
<p align="center"><font color="#6666FF" size="+3" face="华文行楷">学生课程信息</font></p>
<p><a href="adminAddcourse"><font size="+1" face="华文行楷">新加课程</font></a></p>
<center>
<table border="2">
	<tr>
		<th colspan="7" align="center" height=30>课程列表</th>
		</tr>
		<tr>
		<td width=100  height=30>编号</td>
		<td width=100  height=30>课程名称</td>
		<td width=100  height=30>课程编号</td>
		<td width=100  height=30>讲课老师</td>
		<td width=100  height=30>课程学分</td>
		<td width=100  height=30>更新课程</td>
		<td width=100  height=30>删除课程</td>
		</tr>

<%
			if (request.getAttribute("Goods") != null) {
				ArrayList aList = (ArrayList) request.getAttribute("Goods");
				for (int i = 0; i < aList.size(); i++) {
					Course cat = (Course) aList.get(i);
		%>
	
		<tr>
		<td height=30><%=cat.getId() %></td>
		<td height=30><%=cat.getCname() %></td>
		<td height=30><%=cat.getCid() %></td>
		<td height=30><%=cat.getCteacher() %></td>
		<td height=30><%=cat.getCredit()%></td>
		<td align="center" height=30><a href="adminUpdatecourse?id=<%=cat.getId() %>">更新</a></td>
		<td align="center" height=30><a href="adminDelcourse?id=<%=cat.getId() %>">删除</a></td>
		</tr>
		<%
		
		}
		}
		 %>
</table>
</center>
</body>
</html>
