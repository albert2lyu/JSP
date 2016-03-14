<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>更新用户</title>
</head>
<body  link="#6666FF">


	<p align="center">
		<font color="#6666FF" size="+3" face="方正舒体">更新用户信息</font>
	</p>
	<p align="center">&nbsp;</p>
	<form  action="AdminUpdateUser" method="get">
		<table width="49%" height="50" border="1" align="center"
			cellpadding="0" cellspacing="0">
			
			<tr>
			<td width="48%">用户名：</td>
			<td ><input name="name" type="text"></td>
			</tr>
			<tr>
			<td width="48%">用户类型：</td>
			<td ><input name="kind" type="text"></td>
			</tr>
			<tr>
			<td width="48%">用户密码：</td>
			<td width="52%"><input name="code" type="text"></td>
			</tr>
		</table>
		<p align="center">
			<input type="submit" name="Submit" value="更新用户" >
		</p>
		
	</form>
	<p>&nbsp;</p>
	<p align="center"  ><font color="#FF0000" size="+2" face="方正舒体">注意：更新用户信息会更新用户类型和用户密码！</font> </p>
	<p>
		<a href="AdminSelectUser">&lt;&lt;Back</a>
	</p>
</body>
</html>