<%@page import="java.util.Scanner"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Text Data Mining</title>
</head>
<body bgcolor="#FFE6E6">



<center>
		<h2>
			<font color="darkblue">Text Data Mining On BBC Data Sets</font>
		</h2>
	</center>
	<table align="right" border="0" >
		<tr>
			<td bgcolor="white"><a href="business.jsp"><font color="red">Business</font></a></td><td></td>
			<td bgcolor="white"><a href="politics.jsp"><font color="red">Politics</font></a></td><td></td>
			<td bgcolor="white"><a href="tech.jsp"><font color="red">Technology</font></a></td><td></td>
			
			<td bgcolor="red"><a href="enter.jsp"><font color="white">Entertainment</font></a></td><td></td>
			
			<td bgcolor="white"><a href="sports.jsp"><font color="red">Sports</font></a></td><td></td>
			<td bgcolor="white"><a href="index.html"><font color="red">Log Out</font></a></td><td></td>
		</tr>
	</table>
	<br /><br />
	
	<table align="left" border="0" >
		<tr>
			<td bgcolor="white"><a href="celeb.jsp"><font color="red">Celebrations</font></a></td><td></td>
			<td bgcolor="white"><a href="films.jsp"><font color="red">Films</font></a></td><td></td>
			<td bgcolor="red"><a href="enter_others.jsp"><font color="white">Others</font></a></td><td></td>
			<!-- <td bgcolor="white"><a href="enter.jsp"><font color="red">Entertainment</font></a></td><td></td>
			<td bgcolor="white"><a href="tech.jsp"><font color="red">Technology</font></a></td><td></td>
			<td bgcolor="white"><a href="index.html"><font color="red">Log Out</font></a></td><td></td> -->
		</tr>
	</table>
<br /><br />

<%

String file_name=request.getParameter("p");
File file =new File("D:\\do not delete\\bbc\\"+file_name);
Scanner sc=new Scanner(file);
//out=hres.getWriter();
if(sc.hasNextLine())
{
	out.println("<font color=\"red\">");
	out.println(sc.nextLine());
	out.println("</font>");
	out.println("<br />");
}
while(sc.hasNextLine())
{
	out.println(sc.nextLine());
}

%>

</body>
</html>