package quiz;

public class Question {
  String myQuestion;
  String[] choices;
  int correctIndex;

//Constructors(Overloaded)
 public Question(String question, String[] choiceArray, int i) {
    myQuestion = question;
    choices = choiceArray;
    correctIndex = i;
  }

//Getters
 public String getQuestion() {
   return myQuestion;
 }

 public String[] getChoices() {
   return choices;
}

 public int getIndex() {
   return correctIndex;
}


//print Method
 public void print() {
   if (choices.length == 4) {
      System.out.println(myQuestion);
      System.out.println("A. " + choices[0] + "\t");
      System.out.println("B. " + choices[1] + "\t");
      System.out.println("C. " + choices[2] + "\t");
      System.out.println("D. " + choices[3] + "\t");
    }
   else if (choices.length == 3) {
      System.out.println(myQuestion);
      System.out.println("A. " + choices[0] + "\t");
      System.out.println("B. " + choices[1] + "\t");
      System.out.println("C. " + choices[2] + "\t");
    }
   else if (choices.length == 2) {
      System.out.println(myQuestion);
      System.out.println("A. " + choices[0] + "\t");
      System.out.println("B. " + choices[1] + "\t");
    }
  }
    
}
