<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="com.lb.sev.*" %> 
<%@ page import="com.lb.pg.*"%>
<html>
<head><title>ѧ��ѡ�����</title></head>
<body>
<p>&nbsp;</p>
<p align="center"><font color="#6666FF" size="+3" face="�����п�">ѧ���γ���Ϣ</font></p>
<p><a href="adminAddcourse"><font size="+1" face="�����п�">�¼ӿγ�</font></a></p>
<center>
<table border="2">
	<tr>
		<th colspan="7" align="center" height=30>�γ��б�</th>
		</tr>
		<tr>
		<td width=100  height=30>���</td>
		<td width=100  height=30>�γ�����</td>
		<td width=100  height=30>�γ̱��</td>
		<td width=100  height=30>������ʦ</td>
		<td width=100  height=30>�γ�ѧ��</td>
		<td width=100  height=30>���¿γ�</td>
		<td width=100  height=30>ɾ���γ�</td>
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
		<td align="center" height=30><a href="adminUpdatecourse?id=<%=cat.getId() %>">����</a></td>
		<td align="center" height=30><a href="adminDelcourse?id=<%=cat.getId() %>">ɾ��</a></td>
		</tr>
		<%
		
		}
		}
		 %>
</table>
</center>
</body>
</html>
