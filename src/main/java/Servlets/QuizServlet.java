package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/quiz.do")
public class QuizServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		// This will be used to send the user the array of questions later
		// request.setAttribute("Questions Array", );
		request.getRequestDispatcher("/WEB-INF/Quiz.jsp").forward(request, response);
		
			
	}//doGet
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		
			
	}//doGet
	
	
	

}//ENDOFCLASS
