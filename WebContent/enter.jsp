<%@page import="java.util.StringTokenizer"%>
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
			<td bgcolor="white"><a href="enter_others.jsp"><font color="red">Others</font></a></td><td></td>
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
 out.println("<table>");
 out.println("<tr>");
 out.println("<td><font color=\"red\">Category Code</font></td>");
 out.println("<td><font color=\"red\">File Name</td></font>");
 out.println("</tr>");
 String fname=null;
 String lname=null;

 String code=null;
 		for(int i=0;i<al.size();i++)
 		{
 			//out.println("<br />");
 			StringTokenizer line=new StringTokenizer(al.get(i));
 			//out.println(al.get(i));
 			int p=0;
 			while(line.hasMoreTokens())
 			{
 				if(p==0)
 				{
 					code=line.nextToken();
 				}
 				if(p==1)
 				{
 					fname=line.nextToken();
 				}
 				if(p==2)
 				{
 					lname=line.nextToken();
 				}
 				p++;
 				
 			}
 			out.println("<tr>");
 			out.println("<td>");
 			out.println(code);
 			out.println("</td>");
 			
 			out.println("<td>");
 			out.println(fname+" "+lname);
 			out.println("</td>");
 			out.println("</tr>");
 			
 		}
 		
 		out.println("</table>");
 %>
</body>
</html>