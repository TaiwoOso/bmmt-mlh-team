package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/quizAnswerCheck.do")
public class QuizAnswerCheck extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String answerQuery = request.getQueryString();
		String rawAnswer = answerQuery.substring(11);
		
		String comparableAnswer = rawAnswer.replace('+', ' ');
		
		if(answerCorrect(comparableAnswer, request)) {
			
			request.setAttribute("result", "CORRECT");
			request.setAttribute("feedback", "Good Job");
			
		}else {
			
			request.setAttribute("result", "WRONG :(");
			request.setAttribute("feedback", request.getSession().getAttribute("answer"));
			
		}
		
		if(QuizServlet.index == 9) {
			
			request.setAttribute("action", "/covid.do");
			request.setAttribute("back-prompt", "Horray You Finished it! Now you know how to stop the spread!");
			
		}else {
			
			request.setAttribute("action", "/quiz.do");
			request.setAttribute("back-prompt", "");
			
		}
		
		request.getRequestDispatcher("/WEB-INF/Answer.jsp").forward(request, response);
			
	}//doGet
	
	private boolean answerCorrect(String userAnswer, HttpServletRequest request) {
		
		return userAnswer.equals(request.getSession().getAttribute("answer"));
		
	}//answerCorrect

}
