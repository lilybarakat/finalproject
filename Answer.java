
/**
 * Write a description of class Answer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Answer
{
    static Scanner scanner = new Scanner(System.in);
    static QuizQuestion[] question = new QuizQuestion[4];
    static String userInput = "";
    static String answer = "";

    static int beatleJohn = 0;
    static int beatleRingo = 0;
    static int beatleGeorge = 0;
    static int beatlePaul = 0;

    public static void main(String[] args) {
        System.out.println("\f");

        question[0] = new QuizQuestion("What is your name?", "John", "Ringo", "George", "Paul");
        question[1] = new QuizQuestion("What is your name?", "Jack", "Roger", "Gerald", "Peter");
        question[2] = new QuizQuestion("What is your name?", "Julie", "Roxy", "Grandma", "Papa");
        question[3] = new QuizQuestion("What is your name?", "Jerry", "Robert", "Grant", "Perry");

        for (int i = 0; i<question.length; i++) {
            System.out.println("");
            System.out.println("" + question[i].getQuestion());
            System.out.println("");
            System.out.println(question[i].getAnswer1() + "? " + question[i].getAnswer2() + "? " + question[i].getAnswer3() + "? " + question[i].getAnswer4() + "?");
            System.out.println("");
            System.out.print("What is your answer --> ");
            userInput = scanner.nextLine();
            makeResult(userInput, i);
        }

        System.out.println("");
        System.out.println(getAnswer());

    }

    private static void makeResult(String userInput, int i) {
        if (userInput.equalsIgnoreCase(question[i].getAnswer1())) {
            beatleJohn++;
        }
        else if (userInput.equalsIgnoreCase(question[i].getAnswer2())) {
            beatleRingo++;
        }
        else if (userInput.equalsIgnoreCase(question[i].getAnswer3())) {
            beatleGeorge++;
        }
        else if (userInput.equalsIgnoreCase(question[i].getAnswer4())) {
            beatlePaul++;
        }
    }

    public static String getAnswer() {
        if (beatleJohn > beatleRingo && beatleJohn > beatleGeorge && beatleJohn > beatlePaul) {
            return ("John");
        }
        else if (beatleRingo > beatleJohn && beatleRingo > beatleGeorge && beatleRingo > beatlePaul) {
            return ("Ringo");
        }
        else if (beatleGeorge > beatleRingo && beatleGeorge > beatleJohn && beatleGeorge > beatlePaul) {
            return ("George");
        }
        else if (beatlePaul > beatleGeorge && beatlePaul > beatleRingo && beatlePaul > beatleJohn) {
            return ("Paul");
        }
        else {return "Psychopath";}
        }
    }


