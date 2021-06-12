package studio7;

public abstract class Question {

    private String questionText;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public abstract boolean checkAnswer(String ans);
    public abstract boolean checkAnswerFormat(String ans);

    public String getQuestionText() {
        return questionText;
    }

    public abstract String getOptions();

    public String getPrompt() {
        return getQuestionText() + "\n--\n" + getOptions() + "\n";
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionText='" + questionText + '\'' +
                '}';
    }
}
