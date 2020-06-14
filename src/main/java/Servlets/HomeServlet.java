package Servlets;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/covid.do")
public class HomeServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//forward to our home.jsp upon entry to our page
		QuizServlet.index = -1;
		request.getRequestDispatcher("/WEB-INF/Home.jsp").forward(request, response);
			
	}//doGet
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
			
	}//doGet
	
	
}//ENDOFCLASS
