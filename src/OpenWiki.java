import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class OpenWiki {
    String startPage = "https://ru.wikipedia.org/w/index.php?curid=";
    ApiResponse apiResponse = new ApiResponse();

    String page;
     void open(int variant, List<SearchResult> results) {
         if (variant > 0 && results != null && !results.isEmpty()) {
             page = startPage+ results.get(variant - 1).getPageid();
             try {
                 if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                     Desktop.getDesktop().browse(new URI(page));
                 }
             }
             catch (IOException e) {
                 throw new RuntimeException(e);
             }
             catch (URISyntaxException e) {
                 throw new RuntimeException(e);
             }
         }
     }
}
