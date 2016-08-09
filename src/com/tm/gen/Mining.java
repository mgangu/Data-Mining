package com.tm.gen;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.FileWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tm.bus.BusinessProcess;

public class Mining extends HttpServlet{
	PrintWriter out=null;
	int devide_file_size=0;
	ArrayList al=null;
	private StringTokenizer st=null;

	@Override
	protected void service(HttpServletRequest hreq, HttpServletResponse hres)
			throws ServletException, IOException {
		al=new ArrayList<String>();
		out=hres.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Text Data Mining</title>");
		out.println("</head>");
		out.println("<body bgcolor=\"#FFE6E6\">");
		out.println("<center>");
		out.println("<h2>");
		out.println("<font color=\"darkblue\">Text Data Mining On BBC Data Sets</font>");
		out.println("</h2>");
		out.println("</center>");
		out.println("<table align=\"right\" border=\"0\" >");
		out.println("<tr>");
		out.println("<td bgcolor=\"white\"><a href=\"business.jsp\"><font color=\"red\">Business</font></a></td><td></td>");
		out.println("<td bgcolor=\"white\"><a href=\"sports.jsp\"><font color=\"red\">Sports</font></a></td><td></td>");
		out.println("<td bgcolor=\"white\"><a href=\"politics.jsp\"><font color=\"red\">Politics</font></a></td><td></td>");
		out.println("<td bgcolor=\"white\"><a href=\"enter.jsp\"><font color=\"red\">Entertainment</font></a></td><td></td>");
		out.println("<td bgcolor=\"white\"><a href=\"tech.jsp\"><font color=\"red\">Technology</font></a></td><td></td>");
		out.println("<td bgcolor=\"white\"><a href=\"index.html\"><font color=\"red\">Log Out</font></a></td><td></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<br /><br />");
		out.println("<font color=\"red\">Available Data Sets are . . .</font>");
		
		File file=new File("D:\\do not delete\\bbc");
		File[] file_list =file.listFiles();
/*		out.println("<table width=\"800\">");
		out.println("<tr>");
		out.println("<td>");
		out.println("<font color=\"red\">File Name</font>");
		out.println("</td>");
		
		//out.println("<td>");
		
		out.println("<td>");
		out.println("<font color=\"red\">File Size</font>");
		out.println("</td>");
		
		out.println("<td>");
		out.println("<font color=\"red\">Absolute Path</font>");
		out.println("</td>");
		
		out.println("</tr>");
		devide_file_size=1000;
		for(File f : file_list){
			//out.println("<br />");
			out.println("<tr>");
			out.println("<td>");
			out.println(f.getName());
			out.println("</td>");
			out.println("<td>");
			out.println((f.length()/devide_file_size)+" kb");
			out.println("</td>");
			out.println("<td>");
			out.println(f.getAbsolutePath());
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");*/
		
		out.println("</body>");
		out.println("</html>");
		//out.println("888888888888888");
		// TODO Auto-generated method stub
		//super.service(arg0, arg1);
		 PrintStream out2 = new PrintStream(new FileOutputStream("D:\\do not delete\\output.txt"));
		BusinessProcess bprocess=new BusinessProcess();
		
		al=bprocess.fileProcess();
		out.println("<table width=\"800\">");
		out.println("<tr>");
		out.println("<td>");
		out.println("File Name");
		out.println("</td><td>");
		out.println("bs_trades");
		out.println("</td><td>");
		out.println("bs_economy");
		out.println("</td><td>");
		out.println("bs_others");
		out.println("</td><td>");
		out.println("ent_celebr.");
		out.println("</td><td>");
		out.println("ent_films");
		out.println("</td><td>");
		out.println("ent_others");
		out.println("</td><td>");
		out.println("pol_parliament");
		out.println("</td><td>");
		out.println("pol_controv");
		out.println("</td><td>");
		out.println("pol_others");
		out.println("</td><td>");
		out.println("sp_achivments");
		out.println("</td><td>");
		out.println("sp_others");
		out.println("</td><td>");
		out.println("compu");
		out.println("</td><td>");
		out.println("science");
		out.println("</td><td>");
		out.println("othertech");
		out.println("</td>");
		
		out.println("</tr>");
		out.println("");
		for(int i=0;i<al.size();i++)
		{
			out.println("<tr>");
		//	out.println(al.get(i));
			st=new StringTokenizer(al.get(i).toString());
			while(st.hasMoreTokens()){
				out.println("<td>");
				out.print(st.nextToken());
				out.println("</td>");
				
			}
			out.println(" ");
			out2.println(al.get(i).toString());
			out.println("</tr>");
		}
		
	}
	

}
