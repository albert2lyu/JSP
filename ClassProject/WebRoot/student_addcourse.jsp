<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>���ӿγ�</title>
</head>
<body  link="#6666FF">


	<p align="center">
		<font color="#6666FF" size="+3" face="��������">��ӿγ�</font>
	</p>
	<p align="center">&nbsp;</p>
	<form  action="addcourseServlet" method="get">
		<table width="49%" height="50" border="1" align="center"
			cellpadding="0" cellspacing="0">
			<tr>
				<td width="48%">�γ����ƣ�</td>
				<td ><input name="name" type="text"></td>
			</tr>
			<tr>
			<td width="48%">�γ̱�ţ�</td>
			<td ><input name="id" type="text"></td>
			</tr>
			<tr>
			<td width="48%">������ʦ��</td>
			<td ><input name="teacher" type="text"></td>
			</tr>
			<tr>
			<td width="48%">�γ�ѧ�֣�</td>
			<td width="52%"><input name="credit" type="text"></td>
			</tr>
		</table>
		<p align="center">
			<input type="submit" name="Submit" value="��ӿγ�" >
		</p>
		
	</form>
	<p>&nbsp;</p>
	<p>
		<a href="courseServlet">&lt;&lt;Back</a>
	</p>
</body>
</html>