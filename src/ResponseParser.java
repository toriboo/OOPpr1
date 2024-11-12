import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

public class ResponseParser {
    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    List<SearchResult> parsing(String response) {
        ApiResponse apiResponse = gson.fromJson(response, ApiResponse.class);
        List<SearchResult> results = apiResponse.getQuery().getSearch();
        return results;
    }
}
