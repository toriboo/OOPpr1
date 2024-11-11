
public class Main {
    public static void main(String[] args) {
        Question question = new Question();
        String user_question = question.readQuestion();
        Search search = new Search();
        search.query(user_question);
    }
}

