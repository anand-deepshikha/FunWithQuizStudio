package studio7;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions;

    public Quiz(Question... questions) {
        this.questions = new ArrayList<>(Arrays.asList(questions));
    }

    public void addQuestion(Question q) {
        this.questions.add(q);
    }

    public void run() {
        int score = 0;
        Scanner src = new Scanner(System.in);

        for (Question cur: questions) {
            String input;
            do {
                System.out.println(cur.getPrompt());
                input = src.nextLine().trim();
            } while (!cur.checkAnswerFormat(input));

            if (cur.checkAnswer(input)) {
                score++;
            }
        }

        System.out.println("The score was: " + score);
    }
}
