package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import quiz.Question;
import quiz.QuizQuestions;

@WebServlet(urlPatterns = "/quiz.do")
public class QuizServlet extends HttpServlet{
	
	private Question[] theQuiz = QuizQuestions.getQuizQuestions();

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		// This will be used to send the user the array of questions later
		request.getRequestDispatcher("/WEB-INF/Quiz.jsp").forward(request, response);
		request.setAttribute("quiz_questions", theQuiz);
		request.setAttribute("index", 0);
		
				
	}//doGet
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		
			
	}//doGet
	
	
	

}//ENDOFCLASS
