<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>增加课程</title>
</head>
<body link="#6666FF">


	<p align="center">
		<font color="#6666FF" size="+3" face="方正舒体">添加学生信息</font>
	</p>
	<p align="center">&nbsp;</p>
	<form action="adminAddStu" method="get">
		<table width="49%" height="50" border="1" align="center"
			cellpadding="0" cellspacing="0">
			<tr>
				<td width="48%">学生学号：</td>
				<td><input name="id" type="text"></td>
			</tr>
			<tr>
				<td width="48%">学生姓名：</td>
				<td><input name="name" type="text"></td>
			</tr>
			<tr>
				<td width="48%">学生班级：</td>
				<td><input name="class" type="text"></td>
			</tr>
			<tr>
				<td width="48%">Java成绩：</td>
				<td width="52%"><input name="java" type="text"></td>
			</tr>
			<tr>
				<td width="48%">Android成绩：</td>
				<td width="52%"><input name="android" type="text"></td>
			</tr>
			<tr>
				<td width="48%">Jsp成绩：</td>
				<td width="52%"><input name="jsp" type="text"></td>
			</tr>
		</table>
		<p align="center">
			<input type="submit" name="Submit" value="添加学生信息">
		</p>

	</form>
	<p>&nbsp;</p>
	<p>
		<a href="adminSelect">&lt;&lt;Back</a>
	</p>
</body>
</html>