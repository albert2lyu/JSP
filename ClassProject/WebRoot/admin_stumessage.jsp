<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="com.lb.sev.studentServlet"%>
<%@ page import="com.lb.pg.Student"%>
<html>
<head>
<title>ѧ����Ϣ</title>
</head>
<body>
<p align="center">
			<font color="#6666FF" size="+3" face="�����п�">ѧ����Ϣ</font>
		</p>
		<p><a href="adminAddStu"><font size="+1" face="�����п�">�¼�ѧ����Ϣ</font></a></p>
	<center>
		<table border=1>
			<tr>
				<th width="320px" height="30px" colspan="3" align="center">ѧ����Ϣ</th>
				<th width="350px" height="30px" colspan="5" align="center">
					ѧ���ɼ�</th>
			</tr>
			<tr>
				<td width="100px" height="30px">ѧ��</td>
				<td width="100px" height="30px">����</td>
				<td width="120px" height="30px">�༶</td>
				<td width="70px" height="30px">Java</td>
				<td width="70px" height="30px">Android</td>
				<td width="70px" height="30px">Jsp</td>
				<td width="70px" height="30px" >����</td>
				<td width="70px" height="30px">ɾ��</td>
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
				<td align="center"><a href="adminUpdateStu?id=<%=cat.getId()%>">����</a>
				<td align="center"><a href="adminDeleteStu?id=<%=cat.getId()%>">ɾ��</a>
			</tr>
			<%
				}
				}
			%>
		</table>
	</center>
</body>
</html>