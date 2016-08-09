<%@page import="com.tm.gen.Classify"%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.io.File"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Text Data Mining</title>
</head>
<body bgcolor="#FFE6E6">

<%-- <jsp:forward page="economy"></jsp:forward> --%>
<%-- <jsp:include page=""></jsp:include> --%>


<center>
		<h2>
			<font color="darkblue">Text Data Mining On BBC Data Sets</font>
		</h2>
	</center>
	<table align="right" border="0" >
		<tr>
			<td bgcolor="white"><a href="business.jsp"><font color="red">Business</font></a></td><td></td>
			
			<td bgcolor="white"><a href="politics.jsp"><font color="red">Politics</font></a></td><td></td>
			<td bgcolor="red"><a href="tech.jsp"><font color="white">Technology</font></a></td><td></td>
			<td bgcolor="white"><a href="enter.jsp"><font color="red">Entertainment</font></a></td><td></td>
			
			<td bgcolor="white"><a href="sports.jsp"><font color="red">Sports</font></a></td><td></td>
			<td bgcolor="white"><a href="index.html"><font color="red">Log Out</font></a></td><td></td>
		</tr>
	</table>
	<br /><br />
	
	<table align="left" border="0" >
		<tr>
			<td bgcolor="red"><a href="computer.jsp"><font color="white">Computer</font></a></td><td></td>
			<td bgcolor="white"><a href="science.jsp"><font color="red">Science</font></a></td><td></td>
			 <td bgcolor="white"><a href="tech_others.jsp"><font color="red">Others</font></a></td><td></td> 
			<!-- <td bgcolor="white"><a href="enter.jsp"><font color="red">Entertainment</font></a></td><td></td>
			<td bgcolor="white"><a href="tech.jsp"><font color="red">Technology</font></a></td><td></td>
			<td bgcolor="white"><a href="index.html"><font color="red">Log Out</font></a></td><td></td> -->
		</tr>
	</table>
<br /><br />

<%	//out.println("h2222222"); 
ArrayList<String> al=new ArrayList<String>();
StringTokenizer al_data=null;
Classify clasify= new Classify();
al=clasify.classifyIt();
//out.println(al);
//out.println("<html>");
//out.println("<body bgcolor=\"#FFE6E6\">");


String fileName=null;

String category_code=null;
String first_line=null;
Scanner scanned_data=null;

for(int i=0;i<al.size();i++)
{
//	out.println(al.get(i));
	//out.println("<br />");
	al_data=new StringTokenizer(al.get(i));
	int index=0;
	String fname=null;
	String lname=null;
	while(al_data.hasMoreTokens())
	{
		if(index==0)
		{
			category_code=al_data.nextToken();
		}
		if(index==1)
		{
			fname=al_data.nextToken();
		}
		if(index==2)
		{
			lname=al_data.nextToken();
		}
		//out.println(category_code);
		//out.println("<br />");
		index++;
	}
	fileName=fname+" "+lname;
	//out.println(category_code+"----"+fileName);
	if(category_code.equals("tech_comp"))
	{
		File file=new File("D:\\do not delete\\bbc\\"+fileName);
		scanned_data=new Scanner(file);
		if(scanned_data.hasNextLine())
		{
			first_line=scanned_data.nextLine();
			out.println("<a href=\"computer_data.jsp?p="+fileName+"\">"+first_line+"</a>");
		}
		out.println();
		out.println("<br />");
		out.println("<br />");
	}
	
	
	}

%>