<%@page import="java.util.ArrayList"%>
<%@page import="com.tm.gen.Classify"%>
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
			<td bgcolor="red"><a href="business.jsp"><font color="white">Business</font></a></td><td></td>
			<td bgcolor="white"><a href="politics.jsp"><font color="red">Politics</font></a></td><td></td>
			<td bgcolor="white"><a href="tech.jsp"><font color="red">Technology</font></a></td><td></td>
			<td bgcolor="white"><a href="enter.jsp"><font color="red">Entertainment</font></a></td><td></td>
			<td bgcolor="white"><a href="sports.jsp"><font color="red">Sports</font></a></td><td></td>
			
			<td bgcolor="white"><a href="index.html"><font color="red">Log Out</font></a></td><td></td>
		</tr>
	</table>
	<br /><br />
	
	<table align="left" border="0" >
		<tr>
			<td bgcolor="white"><a href="economics.jsp"><font color="red">Economics</font></a></td><td></td>
			<td bgcolor="white"><a href="trades.jsp"><font color="red">Trades</font></a></td><td></td>
			<td bgcolor="white"><a href="bus_others.jsp"><font color="red">Others</font></a></td><td></td>
			<!-- <td bgcolor="white"><a href="enter.jsp"><font color="red">Entertainment</font></a></td><td></td>
			<td bgcolor="white"><a href="tech.jsp"><font color="red">Technology</font></a></td><td></td>
			<td bgcolor="white"><a href="index.html"><font color="red">Log Out</font></a></td><td></td> -->
		</tr>
	</table>
	<!-- <font color="red">Available Data Sets are . . .</font>
 -->
 <%
 	Classify clasification=new Classify();
 ArrayList<String> al=new ArrayList<String>();
 al=clasification.classifyIt();
 
 out.println("<br /><br />");
 out.println("<font color=\"red\">");
 out.println("After Classification . . .");
 out.println("</font><br />");
 		for(int i=0;i<al.size();i++)
 		{
 			out.println("<br />");
 			out.println(al.get(i));
 		}
 %>
</body>
</html>