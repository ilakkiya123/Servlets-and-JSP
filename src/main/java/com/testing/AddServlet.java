package com.testing;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;

public class AddServlet extends HttpServlet{
	//service is a method belongs to servlets life cycle
	//Using req you can fetch req from client and with res you can send response to Client
	public void service(HttpServletRequest req , HttpServletResponse resp) throws IOException {
	
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		//Now response from server to client is provided by the servlet response object
		PrintWriter out = resp.getWriter() ;
		out.println("Result is " + k);
	}
}
