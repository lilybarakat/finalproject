
/**
 * Write a description of class Answer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javafx.application.Application;

import java.util.Scanner;

public class Answer
{
    static Scanner scanner = new Scanner(System.in);
    static QuizQuestion[] question = new QuizQuestion[8];

    static String userInput = "";
    static String answer = "";

    static int beatleJohn = 0;
    static int beatleRingo = 0;
    static int beatleGeorge = 0;
    static int beatlePaul = 0;

    public static void main(String[] args) {
        System.out.println("\f");

        question[0] = new QuizQuestion("Who do you have the biggest crush on?", "John", "Ringo", "George", "Paul");

        question[1] = new QuizQuestion("Which word best describes you?", "Hippie", "Funny", "Quiet", "Cute");

        question[2] = new QuizQuestion("What makes you happiest?", "Peace and Love", "Respect", "To be understood",
                                       "No stress");

        question[3] = new QuizQuestion("What kind of music do your prefer?", "Clever lyrics", "Anything",
                                       "Mystic and thoughtful", "Fun pop songs");

        question[4] = new QuizQuestion("How do you feel about Yoko Ono?", "Adore her", "Annoyed by her",
                                       "Hate her guts", "Can we just get back to the music?");

        question[5] = new QuizQuestion("Your dream vacation is:", "Your bed, away from the nonsense",
                                       "On a yellow submarine", "In India, getting enlightened",
                                       "A tropical island with your other half");

        question[6] = new QuizQuestion("Fame is:", "A distraction from the music", "Funny, everything is funny",
                                       "Absurd and annoying", "Addictive, you can't get enough!");

        question[7] = new QuizQuestion("Lily is:", "A great student!", "A fantastic student!",
                                       "Tardy, yet a joy to have in class!", "A bit spacey, but created a wonderful project!");

        for (int i = 0; i<question.length; i++) {
            System.out.println("");
            System.out.println("" + question[i].getQuestion());
            System.out.println("");
            System.out.println("a. " + question[i].getAnswer1());
            System.out.println("b. " + question[i].getAnswer2());
            System.out.println("c. " + question[i].getAnswer3());
            System.out.println("d. " + question[i].getAnswer4());
            System.out.println("");
            System.out.print("Type your answer here: ");
            userInput = scanner.nextLine();
            makeResult(userInput, i);
        }

        System.out.println("");
        getAnswer();

    }

    private static void makeResult(String userInput, int i) {
        if (userInput.equalsIgnoreCase(question[i].getAnswer1()) || userInput.equalsIgnoreCase("a")) {
            beatleJohn++;
        }
        else if (userInput.equalsIgnoreCase(question[i].getAnswer2()) || userInput.equalsIgnoreCase("b")) {
            beatleRingo++;
        }
        else if (userInput.equalsIgnoreCase(question[i].getAnswer3()) || userInput.equalsIgnoreCase("c")) {
            beatleGeorge++;
        }
        else if (userInput.equalsIgnoreCase(question[i].getAnswer4()) || userInput.equalsIgnoreCase("d")) {
            beatlePaul++;
        }
    }


    public static void getAnswer() {

        int[] beatleJuice = {beatleJohn, beatleRingo, beatleGeorge, beatlePaul};
        int fours = 0;
        for (int i = 0; i < beatleJuice.length; i++) {
            if (beatleJuice[i] == 4) {
                fours++;
            }
        }
        if (fours == 2) {
            System.out.println("Uh oh... I hate to be the bearer of bad news, " +
                    " but you seem to have split personality disorder, just try" +
                    " to get help as soon as possible.");
            Application.launch(PsychoAnimation.class);
            return;
        }


        if (beatleJohn>=4) {
            System.out.println("John: The leader of a pack! You're the boss, and you own it!" +
                    " You're a genius with words and a true hippie. You spread peace and love wherever you go <3");
            Application.launch(JohnAnimation.class);
            return;
        }
        else if (beatleRingo>=4) {
            System.out.println("Ringo: Hey there funny guy! You're always coming up with quirky fun one liners "
                    + "to make everyone laugh, and are a real team player. Rock on Ringo! ");
            Application.launch(RingoAnimation.class);
            return;
        }
        else if (beatleGeorge>=4) {
            System.out.println("George: You keep to yourself, but you care a lot about your surroundings. "
                    + "You work hard, and put love in everything you do. You are Lily's favorite :)");
            Application.launch(GeorgeAnimation.class);
            return;
        }
        else if (beatlePaul>=4) {
            System.out.println("Paul: You're fun, cute, and the ladies/dudes are all swooning over you. "
                    + "You're happy, carefree, and super popular!");
            Application.launch(PaulAnimation.class);
            return;
        }
        else {System.out.println("Psychopath: I recommend you get help.");}
            Application.launch(PsychoAnimation.class);
            return;
        }




    }
