package com.abc.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// http://localhost:8888/09-requestPath4/welcome.jsp
		// request.getRequestDispatcher("/welcome.jsp").forward(request, response);
		
		response.sendRedirect(request.getContextPath() + "/welcome.jsp");
	}

}
