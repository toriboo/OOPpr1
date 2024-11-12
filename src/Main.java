public class Main {
    public static void main(String[] args) {
        String user_question = readUserQuestion();
        String response = performSearch(user_question);
        showResult(response);
    }
    private static String readUserQuestion(){
        Question question = new Question();
        return question.readQuestion();
    }
    private static String performSearch(String user_question){
        Search search = new Search();
         return String.valueOf(search.query(user_question));
    }
    private static void showResult(String response){
        ResponseParser parser = new ResponseParser();
        Result result = new Result();
        result.show(parser.parsing(response));
    }
}
