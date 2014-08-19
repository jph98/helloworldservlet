package com.froyo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/plain");
		res.setStatus(200);
		PrintWriter writer = res.getWriter();
		writer.println("Hello world with method: " + req.getMethod());
		writer.close();
	}
}
