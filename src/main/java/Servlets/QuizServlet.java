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
	private int index = -1;
	private int points = 0;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		// This will be used to send the user the array of questions later
		index++;
		if(index + 1 < theQuiz.length) {
			
			giveAttributes(request);
			request.getRequestDispatcher("/WEB-INF/Quiz.jsp").forward(request, response);
			
		}
				
	}//doGet
	
	
	
	private void giveAttributes(HttpServletRequest request) {
		
		String [] choices = theQuiz[index].getChoices();
		request.getSession().setAttribute("answer", theQuiz[index].getChoices()[theQuiz[index].getIndex()]);
		request.getSession().setAttribute("choices", choices);
		request.getSession().setAttribute("index", index);
		request.getSession().setAttribute("question", theQuiz[index].getQuestion());
		
		
	}//giveAttributes
	
	

}//ENDOFCLASS
