package studio7;

public class TrueFalse extends Question {

    private boolean answer;

    public TrueFalse(String questionText, boolean answer) {
        super(questionText);
        this.answer = answer;
    }

    @Override
    public boolean checkAnswer(String ans) {
        if (!checkAnswerFormat(ans)) {
            return false;
        }

        if (answer) {
            return ans.equalsIgnoreCase("True")
                    || ans.equalsIgnoreCase("t");
        } else {
            return ans.equalsIgnoreCase("False")
                    || ans.equalsIgnoreCase("f");
        }
    }

    @Override
    public boolean checkAnswerFormat(String ans) {
        return ans.equalsIgnoreCase("False")
                || ans.equalsIgnoreCase("f")
                || ans.equalsIgnoreCase("True")
                || ans.equalsIgnoreCase("t");

    }

    @Override
    public String getOptions() {
        return "(T)rue or (F)alse";
    }
}
