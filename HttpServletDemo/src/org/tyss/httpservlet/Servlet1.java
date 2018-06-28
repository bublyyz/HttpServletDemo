package org.tyss.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user=req.getParameter("un");
		PrintWriter out= resp.getWriter();
		out.print("<html><body><h1>Welcome "+user+"</h1></body></html>");
		out.flush();
		out.close();	
	}

}
