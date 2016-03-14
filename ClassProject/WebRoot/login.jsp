<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>学生成绩管理系统-登录</title>
<meta http-equiv="windows-Target">
<SCRIPT Language="JavaScript">
<!--
	function isValid() {
		if (formlogin.id.value == "") {
			window.alert("请输入用户名！");
			document.formlogin.elements(0).focus();
			return false;
		}
		if (formlogin.password.value == "") {
			window.alert("请输入密码！");
			document.formlogin.elements(1).focus();
			return false;
		}
	}
	-->
</SCRIPT>

</head>

<body>
	<center>
		<form name="formlogin" action="login" method="post"
			onSubmit="return isValid(this);">
			<table width=800 bgcolor=#6666FF>
				<tr>
					<td colspan="3" width=800 height=100><img
						src="img/login_logo.jpg"></td>
				</tr>
				<tr>
					<td rowspan="5" height=300 width=400><img src="img/login.jpg">
					</td>
					<td colspan="2" align=center style="height: 50px; "><img
						src="img/login_user.jpg"></td>


				</tr>
				<tr>

					<td>用&nbsp;&nbsp;户&nbsp;&nbsp;名：</td>
					<td><input type="text" name="id" style="width: 180px"></td>
				</tr>
				<tr>

					<td>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
					<td><input type="password" name="password"
						style="width: 180px; "></td>
				</tr>
				<tr>

					<td>用&nbsp;户&nbsp;登&nbsp;入：</td>
					<td><input type="radio" name="kind" checked="checked"
						value="student">学生 &nbsp;&nbsp;&nbsp;&nbsp; <input
						type="radio" name="kind" value="admin">管理员<br></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit"  value="登入"">
						&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset"
						value="重置"></td>
				</tr>
				<tr>
					<td colspan="3" style="height: 30px; ">
						<p align=center>
							Copyright © 2004 Adobe Systems Incorporated. All rights reserved.<br>
							Author@linbots&nbsp;&nbsp;&nbsp;&nbsp;Created：2015/11/11.
						</p>

					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>