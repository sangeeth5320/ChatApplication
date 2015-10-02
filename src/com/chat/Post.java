package com.chat;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class Post
 */
@WebServlet("/Post")

public class Post extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Post() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter pw=response.getWriter();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		HttpSession hsession = request.getSession(true);
		response.setContentType("text/html;charset =UTF-8");
		
		//Getting userName and chatMessage
		String userName= request.getParameter("userName");
		hsession.setAttribute("username", userName);
		String chatMsg = request.getParameter("getMsg");
		hsession.setAttribute("chatMsg", chatMsg);
		
		RequestDispatcher rd= request.getRequestDispatcher("home.jsp");
		request.setAttribute("welcome", userName);
		System.out.println(rd);
		rd.forward(request, response);
	}

}

