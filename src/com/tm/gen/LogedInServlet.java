package com.tm.gen;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogedInServlet extends HttpServlet{
	ServletContext sc=null;
	RequestDispatcher rd=null;
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		sc=getServletContext();
		if(req.getParameter("uname").equalsIgnoreCase("user")&&req.getParameter("pwd").equalsIgnoreCase("user")){
			rd=sc.getRequestDispatcher("/mining");
			rd.forward(req, res);
		}
		else
		{
			rd=sc.getRequestDispatcher("index.html");
			rd.forward(req, res);
		}
		// TODO Auto-generated method stub
		
	}
	

}
