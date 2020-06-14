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
	private int index = 0;
	private int points = 0;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		// This will be used to send the user the array of questions later
		giveAttributes(request);
		request.getRequestDispatcher("/WEB-INF/Quiz.jsp").forward(request, response);
				
	}//doGet
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println(request.getAttribute("userchoice"));
		if(answerCorrect((String) request.getAttribute("userchoice"))) {
			
			System.out.println("HORRAY");
			
		}else {
			
			System.out.println(request.getAttribute("userchoice"));
			
		}
			
	}//doGet
	
	
	private void giveAttributes(HttpServletRequest request) {
		
		String [] choices = theQuiz[index].getChoices();
		request.setAttribute("answer", theQuiz[index].getIndex());
		request.setAttribute("choices", choices);
		request.setAttribute("index", index);
		request.setAttribute("question", theQuiz[index].getQuestion());
		
		
	}//giveAttributes
	
	
	private boolean answerCorrect(String answer) {
		
		String [] choices = theQuiz[index].getChoices();
		if(answer.equals(choices[theQuiz[index].getIndex()])) {
			
			return true;
			
			
		}//if
		
		return false;
		
		
	}//compareAnswer
	
	

}//ENDOFCLASS
