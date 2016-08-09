<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Text Data Mining</title>
</head>
<body bgcolor="pink">
<%
	String uname=request.getParameter("uname");
	String pwd=request.getParameter("pwd");
	
	if(uname.equals("user")&&pwd.equals("user")){ %>
		<center>
		<h2>
			<font color="darkblue">Text Data Mining On BBC Data Sets</font>
		</h2>
	</center>
	<table align="right" border="0" >
		<tr>
			<td bgcolor="white"><a href="#"><font color="red">Data sets</font></a></td>
			<td bgcolor="white"><a href="\mining"><font color="red">Mine here</font></a></td>
			<td bgcolor="white"><a href="index.html"><font color="red">Log Out</font></a></td>
		</tr>
	</table>
	<%	
	}
	else
	{
		%>
		<%@ include file="login.jsp" %>
		<font color="red">
		<br />
		<br />
			<center>Authentication Failed . . .</center>
		</font>
		<%
	}
%>

</body>
</html>