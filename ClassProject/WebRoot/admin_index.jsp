<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.util.*"%>
<html>
<head>
<title>学生管理系统-学生主页</title>
</head>
<body leftmargin="0" topmargin="0" >
<center>
<table>
<tr>
<td width=1100px height="100px" colspan="2">
<iframe name="head" src="head.jsp" width="1100px"  scrolling="no" frameborder="0"></iframe>
</td>
</tr>
<tr>
<td width="200px" height="500px">
<iframe name="left"  src="admin_left.jsp" width=200px height=500px scrolling="no" frameborder="0"
style="margin-top:0px; margin:0px; padding:0px " ></iframe>
</td>
<td width="900px" height="500px">
<iframe name="main" src="admin_main.jsp" width =  900px height=500px scrolling="no" frameborder="0" ></iframe>
</td>
</tr>
<tr>
<td width="1100px" height="40px" colspan="2">
<iframe name="footer" src="foot.jsp" width="1100px" height="60px"  scrolling="no" frameborder="0"    ></iframe>
</td>
</tr>
</table>
</center>
</body>
</html>