package org.manav.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String userName = req.getParameter("user");
		
		System.out.println("doGet called for the class XmlServlet");
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		writer.write("<h3>Welcome " + userName + "</h3>");
		
	}
	
	

}
