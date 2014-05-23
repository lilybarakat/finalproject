
/**
 * Write a description of class QuizQuestion here.
 * 
 * Lily Barakat
 * 5/20/14
 */
public class QuizQuestion
{
    private String question = "Question";
    private String answer1 = "Answer1";
    private String answer2 = "Answer2";
    private String answer3 = "Answer3";
    private String answer4 = "Answer4";
    
    public QuizQuestion() {
        this("Question", "Answer1", "Answer2", "Answer3", "Answer4");
    }
    
    public QuizQuestion(String question, String answer1, String answer2, String answer3, String answer4) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }
    
    public String getQuestion() {
        return this.question;
    }
    
    public String getAnswer1() {
        return this.answer1;
    }
    
    public String getAnswer2() {
        return this.answer2;
    }
    
    public String getAnswer3() {
        return this.answer3;
    }
    
    public String getAnswer4() {
        return this.answer4;
    }
}
