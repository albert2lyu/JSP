<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="com.lb.sev.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>���ӿγ�</title>
</head>
<body link="#6666FF">

	<%
	String id = (String) session.getAttribute("id");
 %>
	<p align="center">
		<font color="#6666FF" size="+3" face="��������">�������</font>
	</p>
	<p align="center">&nbsp;</p>
	<form action="changeUserPassword?id=<%=id%>" method="post">
		<table width="49%" height="50" border="1" align="center"
			cellpadding="0" cellspacing="0">
			<tr>
				<td width="48%">�����룺</td>
				<td><input name="newcode" type="text"></td>
			</tr>
		</table>
		<p align="center">
			<input type="submit" name="Submit" value="�޸�����">
		</p>

	</form>
		<p>&nbsp;</p>
		<a href="student_main.jsp">&lt;&lt;Back</a>
	</p>
</body>
</html>
