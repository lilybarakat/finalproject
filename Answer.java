
/**
 * Write a description of class Answer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Answer
{
   public static void main(String[] args) {
       QuizQuestion[] question = new QuizQuestion[4];
       
       question[0] = new QuizQuestion("What is your name?", "Alice", "Bob", "Charlie", "Dean");
       
       String userInput = "";//scanner text
       
       int answer = 0;
       if (userInput.equalsIgnoreCase(question[0].getAnswer1())) {
           answer = 1;
       }
       
    }
}
