<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>���ӿγ�</title>
</head>
<body link="#6666FF">


	<p align="center">
		<font color="#6666FF" size="+3" face="��������">���ѧ����Ϣ</font>
	</p>
	<p align="center">&nbsp;</p>
	<form action="adminAddStu" method="get">
		<table width="49%" height="50" border="1" align="center"
			cellpadding="0" cellspacing="0">
			<tr>
				<td width="48%">ѧ��ѧ�ţ�</td>
				<td><input name="id" type="text"></td>
			</tr>
			<tr>
				<td width="48%">ѧ��������</td>
				<td><input name="name" type="text"></td>
			</tr>
			<tr>
				<td width="48%">ѧ���༶��</td>
				<td><input name="class" type="text"></td>
			</tr>
			<tr>
				<td width="48%">Java�ɼ���</td>
				<td width="52%"><input name="java" type="text"></td>
			</tr>
			<tr>
				<td width="48%">Android�ɼ���</td>
				<td width="52%"><input name="android" type="text"></td>
			</tr>
			<tr>
				<td width="48%">Jsp�ɼ���</td>
				<td width="52%"><input name="jsp" type="text"></td>
			</tr>
		</table>
		<p align="center">
			<input type="submit" name="Submit" value="���ѧ����Ϣ">
		</p>

	</form>
	<p>&nbsp;</p>
	<p>
		<a href="adminSelect">&lt;&lt;Back</a>
	</p>
</body>
</html>