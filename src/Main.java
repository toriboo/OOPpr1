
public class Main {
    public static void main(String[] args) {
        Question question = new Question();
        String user_question = question.readQuestion();
        Search search = new Search();
        String response = String.valueOf(search.query(user_question));
        Parse parse = new Parse();
        Result result = new Result();
        result.show(parse.parsing(response));

    }
}

