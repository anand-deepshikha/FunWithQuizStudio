package studio7;

import java.util.*;

public class MultipleChoice extends Question {
    private int answerIdx;
    private String optionsText;
    private int nAnswers;

    public MultipleChoice(String question, String trueAnswer, String... falseAnswers) {
        super(question);
        Random rnd = new Random();

        List<String> answers = new ArrayList<>(Arrays.asList(falseAnswers));
        this.answerIdx = rnd.nextInt(1 + falseAnswers.length);
        Collections.shuffle(answers);
        answers.add(answerIdx, trueAnswer);

        optionsText = "Choose one of the following\n";
        for (int i = 0; i < answers.size(); i++) {
            optionsText += String.format("\n%c: %s", 'A' + i, answers.get(i));
        }
        nAnswers = answers.size();
    }


    @Override
    public boolean checkAnswer(String ans) {
        if (ans.length() != 1) {
            return false;
        }
        return ans.getBytes()[0] == 'A' + answerIdx;
    }

    @Override
    public boolean checkAnswerFormat(String ans) {
        if (ans.length() != 1) {
            return false;
        }
        byte response = ans.getBytes()[0];
        return response >= 'A' && response < 'A' + nAnswers;

    }

    @Override
    public String getOptions() {
        return optionsText;
    }
}