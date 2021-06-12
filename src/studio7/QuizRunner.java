package studio7;

public class QuizRunner {

    public static void main(String[] args) {

        Question president = new MultipleChoice(
                "Who was the first President?",
                "George Washington",
                "Dwayne, The Rock, Johnson",
                "Chuck Norris",
                "Andrew Hamilton"
        );

        Question tOrF = new TrueFalse("Break?", true);


        Quiz q = new Quiz();
        q.addQuestion(president);
        q.addQuestion(tOrF);

        q.run();

    }
}
