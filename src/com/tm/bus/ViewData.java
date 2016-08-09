package com.tm.bus;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewData extends HttpServlet{
	Scanner sc=null;
	PrintWriter out=null;

	@Override
	protected void service(HttpServletRequest hreq, HttpServletResponse hres)
			throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		// super.service(arg0, arg1);
		String file_name=hreq.getParameter("p");
		File file =new File("D:\\do not delete\\bbc\\"+file_name);
		sc=new Scanner(file);
		out=hres.getWriter();
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
		
	}
	

}
