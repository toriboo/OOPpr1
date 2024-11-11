import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.net.HttpURLConnection;
public class Search {
    String question;
    void query(String user_question){
        question = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=" +'"'+ user_question+'"';
        question = URLEncoder.encode(question, StandardCharsets.UTF_8);
        try{
            URL url = new URL(question);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            //System.out.println(connection);
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

