import java.util.*;

public class QuizQuestions {
  public static Question[] getQuizQuestions() {
    Question[] QuestionArray = new Question[10];
    HashMap choiceMap = new HashMap();
    choiceMap.put(0, "A");
    choiceMap.put(1, "B");
    choiceMap.put(2, "C");
    choiceMap.put(3, "D");

    //Question Delcarations
    ArrayList<Question> QuestionList = new ArrayList<Question>();
    Question Question1 = new Question("What is the best way to avoid the virus?", new String[] {"The best way to prevent illness is to avoid being exposed to this virus.", "Go to the movies and forget your problems!", "Find yourself a homemade vaccine.", "Become Osmosis Jones."}, 0);
    Question Question2 = new Question("How is the virus thought to spread mainly?", new String[] {"The virus is thought to spread mainly from person-to-console.", "The virus is thought to spread mainly from person-to-dog.", "The virus is thought to spread mainly from person-to-cat.", "The virus is thought to spread mainly from person-to-person."}, 3);
    Question Question3 = new Question("How are potentially virus spreading respiratory droplets produced?", new String[] {"When the person cries after taking this test at home.", "When a person coughs, sneezes or talks.", "When it rains.", "When someone sweats."}, 1);
    Question Question4 = new Question("What is an important aspect to remember about COVID-19?", new String[] {"No school.", "Some recent studies have suggested that COVID-19 may be spread by people who are not showing symptoms.", "It is the first virus to ever hit the United States.", "It is a bacteria."}, 1);
    Question Question5 = new Question("What is a way to help prevent catching COVID-19?", new String[] {"Wash your hands often with soap and water for at least 20 seconds especially after you have been in a public place.", "If soap and water are not readily available, use a hand sanitizer that contains at least 60% alcohol.", "Avoid touching your eyes, nose, and mouth with unwashed hands.", "All of the above."}, 3);
    Question Question6 = new Question("What is the minimum distance you should keep between a person? What is NOT a substitute for social distancing?", new String[] {"6 feet. A cloth face cover.", "4 feet. A cloth face cover.", "6 feet. An N95 face cover.", "5 feet. A comvination between a cloth and an N95 face cover."}, 0);
    Question Question7 = new Question("What are some ways to take precaution at home?", new String[] {"Clean AND disinfect frequently touched surfaces daily. This includes tables, doorknobs, light switches, countertops, handles, desks, phones, keyboards, toilets, faucets, and sinks.", "If surfaces are dirty, clean them. Use detergent or soap and water prior to disinfection.", "Use a household disinfectant.", "All of the above."}, 3);
    Question Question8 = new Question("What are some common signs to be alert for?", new String[] {"Those wearing a mask.", "People wearing no shoes.", "Watch for fever, cough, shortness of breath, or other symptoms of COVID-19.", "People sneezing into their arm."}, 2);
    Question Question9 = new Question("Which people might it be best to keep distance from?", new String[] {"People who are at lower risk of getting sick.", "People who are at higher risk of getting very sick.", "People that sneeze a lot.", "People who wash their hands daily."}, 1);
    Question Question10 = new Question("Who may be at higher risk for severe illness from COVID-19?", new String[] {"Healthy children.", "Older adults and people of any age who have serious underlying medical conditions.", "Adults that work out 3 times a week.", "Those working a public place."}, 1);
    Question Question11 = new Question("What type of people could be affected regardless of all age?", new String[] {"Those that work at a public place.", "Those who don't wash their hands.", "Those who have had a fever before.", "Those with an underlying medical conditions, particularly if not well controlled."}, 3);
    Question Question12 = new Question("What is a good idea when applying a mask?", new String[] {"Wash your hands before you touch the mask.", "Inspect the masks for damage.", "Cover your mouth, nose, and chin.", "All of the above."}, 3);
    Question Question13 = new Question("As an employer, which of these might be a good idea to implement?", new String[] {"Promote regular and thorough hand-washing by employees, contractors, and customers.", "Promote good respiratory hygiene in the workplace.", "Ensure that face masks1 or paper tissues are available at your workplaces.", "All of the above."}, 3);
    Question Question14 = new Question("What family is COVID-19 from? Are antibiotics effective against viruses?", new String[] {"COVID-19 is in a family of viruses called Coronaviridae. Antibiotics do not work against viruses.", "COVID-19 is in a family of viruses called Corolla. Antibiotics do not work against viruses.", "COVID-19 is in a family of viruses called Cooties. Antibiotics do not work against viruses.", "COVID-19 is in a family of viruses called Corolla. Antibiotics do work against viruses."}, 1);
    Question Question15 = new Question("The prolonged use of medical masks* when properly worn", new String[] {"DOES cause CO2 intoxication nor oxygen deficiency.", "DOES NOT cause CO2 intoxication nor oxygen deficiency.", "DOES cause H20 intoxication nor oxygen deficiency.", "DOES NOT change your DNA structure."}, 1);
    Question Question16 = new Question("Most people who get COVID-19 have", new String[] {"Mild or moderate symptoms and can recover due to supportive care.", "Severe symptoms but can recover due to supportive care.", "Severe symptoms and cannot recover.", "Mild or moderate symptoms but cannot recover due to supportive care."}, 0);
    Question Question17 = new Question("Thermal scanners are effective in detecting people", new String[] {"Who have a fever and can detect people who are infected with COVID-19.", "Who have a fever but they cannot detect people who are infected with COVID-19.", "Who don't wash their hands.", "Who wear masks."}, 1);
    

    //QuestionList Declarations
    QuestionList.add(Question1);
    QuestionList.add(Question2);
    QuestionList.add(Question3);
    QuestionList.add(Question4);
    QuestionList.add(Question5);
    QuestionList.add(Question6);
    QuestionList.add(Question7);
    QuestionList.add(Question8);
    QuestionList.add(Question9);
    QuestionList.add(Question10);
    QuestionList.add(Question11);
    QuestionList.add(Question12);
    QuestionList.add(Question13);
    QuestionList.add(Question14);
    QuestionList.add(Question15);
    QuestionList.add(Question16);
    QuestionList.add(Question17);

   //Question Selection -- Change i<3 to i<10 after creating more than 10 questions
   for (int i = 0; i < 10; i++) {
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
