package quiz;

import java.util.*;

public class QuizQuestions {
  public static Question[] getQuizQuestions() {
    Question[] QuestionArray = new Question[10];
    HashMap choiceMap = new HashMap();
    choiceMap.put(0, "A");
    choiceMap.put(1, "B");
    choiceMap.put(2, "C");
    choiceMap.put(3, "D");

    //Question Instantiation
    ArrayList<Question> QuestionList = new ArrayList<Question>();
    Question Question1 = new Question("How many legs do humans have?", new String[] {"One", "Two", "Three", "Four"}, 1);
    Question Question2 = new Question("Are you a social persion?", new String[] {"Yes", "No"}, 0);
    Question Question3 = new Question("Are you dumb?", new String[] {"Yes", "No", "Maybe"}, 2);
  
    //QuestionList Declarations
    QuestionList.add(Question1);
    QuestionList.add(Question2);
    QuestionList.add(Question3);

   //Question Selection -- Change i<3 to i<10 after creating more than 10 questions
   for (int i = 0; i < 3; i++) {
      Question myQuestion;
      String[] myChoices;
      Boolean questionExists = false;
      myQuestion = randomize(QuestionList);
      questionExists = ArrayContains(QuestionArray, myQuestion);
      //System.out.println(i);
      
      if (!questionExists) {
        QuestionArray[i] = myQuestion;
        myChoices = myQuestion.getChoices();

        /*System.out.print((i+1) + ". ");
        myQuestion.print();
        System.out.println("Correct Answer is " + choiceMap.get(myQuestion.getIndex()) + ". " + myChoices[myQuestion.getIndex()]);
        System.out.println();*/
      }
      else {
        i--;
      }
      
    }
    return QuestionArray;
  }

 public static Question randomize(ArrayList<Question> qList) {
   Random rand = new Random();
   return qList.get(rand.nextInt(qList.size()));
 }

 public static Boolean ArrayContains(Question[] QuestionArray, Question Question) {
   for (int i = 0; i < QuestionArray.length; i++) {
        if (QuestionArray[i] == null) {
          return false;
        }
        if (Question == QuestionArray[i]) {
          return true;
        }
        
      }
   return false;
 }
}
