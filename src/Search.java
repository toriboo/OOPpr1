import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.net.URL;
import java.net.HttpURLConnection;

public class Search {
    String question;

    StringBuilder query(String user_question){
        String user_question_encode = URLEncoder.encode(user_question, StandardCharsets.UTF_8);
        question = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=" +user_question_encode;
        try{
            // запрос
            URL url = new URL(question);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // чтение ответа
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            //System.out.println(response);
            //заверешение запроса
            in.close();
            connection.disconnect();
            return response;

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

