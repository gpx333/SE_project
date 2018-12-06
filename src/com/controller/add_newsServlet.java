package com.controller;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.entity.User;
import com.service.UserService;


@WebServlet("/add_news")
public class add_newsServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s1 = request.getSession();
		if(s1.getAttribute("user") != null && "1".equals(s1.getAttribute("key"))) {
	    	request.getRequestDispatcher("/WEB-INF/jsp/add_news.jsp").forward(request, response);
		} else {
			response.sendRedirect("backstage_management");
		}
	}


}
