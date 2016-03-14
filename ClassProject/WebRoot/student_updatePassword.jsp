<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="com.lb.sev.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>增加课程</title>
</head>
<body link="#6666FF">

	<%
	String id = (String) session.getAttribute("id");
 %>
	<p align="center">
		<font color="#6666FF" size="+3" face="方正舒体">密码更改</font>
	</p>
	<p align="center">&nbsp;</p>
	<form action="changeUserPassword?id=<%=id%>" method="post">
		<table width="49%" height="50" border="1" align="center"
			cellpadding="0" cellspacing="0">
			<tr>
				<td width="48%">新密码：</td>
				<td><input name="newcode" type="text"></td>
			</tr>
		</table>
		<p align="center">
			<input type="submit" name="Submit" value="修改密码">
		</p>

	</form>
		<p>&nbsp;</p>
		<a href="student_main.jsp">&lt;&lt;Back</a>
	</p>
</body>
</html>
