public class Main {
    public static void main(String[] args) {
        String user_request = readUserRequest();
        String response = performSearch(user_request);
        showResult(response);
    }
    private static String readUserRequest(){
        Request request = new Request();
        return request.readRequest();
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
