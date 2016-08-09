package com.tm.bus;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tm.gen.Classify;

public class Economics extends HttpServlet{
	ArrayList<String> al=null;
	

	@Override
	protected void service(HttpServletRequest hreq, HttpServletResponse hres)
			throws ServletException, IOException {
		PrintWriter out=hres.getWriter();
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		al=new ArrayList<String>();
		StringTokenizer al_data=null;
		System.out.println(out);
		
		out.println("hai how are u ?");
		Classify clasify= new Classify();
		al=clasify.classifyIt();
		
		out.println("<html>");
		out.println("<body bgcolor=\"#FFE6E6\">");
		out.println("");
		int index=0;
		String fileName=null;
		String fname=null;
		String lname=null;
		String category_code=null;
		String first_line=null;
		Scanner scanned_data=null;
		
		for(int i=0;i<al.size();i++)
		{
			al_data=new StringTokenizer(al.get(i));
			while(al_data.hasMoreElements())
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
				index++;
			}
			fileName=fname+" "+lname;
			if(category_code.equalsIgnoreCase("bs_eco"));
			{
				File text_file=new File("D:\\do not delete\\bbc\\"+fileName);
				scanned_data=new Scanner(text_file);
				if(scanned_data.hasNextLine())
				{
					first_line=scanned_data.nextLine();
				}
				
				out.println("<a href=\"economy_view?p="+fileName+"\">"+first_line+"</a>");
				//out.println("<form>");
				out.println("<br />");
			//	out.println("</form>");
			}
		}
		// TODO Auto-generated method stub
		//super.service(arg0, arg1);
		
		out.println("</body>");
		out.println("</html>");
	}
	
	

}
