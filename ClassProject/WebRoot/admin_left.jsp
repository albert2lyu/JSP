<%@ page contentType="text/html; charset=gb2312" import="java.util.*"%>
<link rel="stylesheet" href="css/index.css" type="text/css">
<%@ page import="com.lb.sev.*"%>
<html>

<body bgcolor="#6666FF" width="200px" height="500px" >

 <table width="200px">
 <%
	String id = (String) session.getAttribute("id");
 %>
 <tr>
 <td width="200px" height="40px" align="center"><a href="admin_main.jsp" target="main" >��ҳ</a></td>
 </tr>
 
 <tr>
 <td width="200px" height="40px" align="center"> <a href="adminSelect" target="main">ѧ����Ϣ</a></td>
 </tr>
 <tr>
 <td width="200px" height="40px" align="center"><a href="adminCourse" target="main">ѧ���γ�</a></td>
 </tr >
 <tr>
 <td widht="200px" height="40px" align="center"><a href="AdminSelectUser" target="main">�û���Ϣ	</a></td>
 </tr>
 <tr>
 <td width="200px" height="40px" align="center"><a href="changeUserPassword" target="main">�����޸�</a></td>
 </table>
</body>
</html>