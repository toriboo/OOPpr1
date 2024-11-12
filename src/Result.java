import java.util.List;

public class Result {
    int counter = 1;
    int var;
    Variant variant = new Variant();
    OpenWiki openWiki = new OpenWiki();
    void show(List<SearchResult> results)
    {
        if (results != null && !results.isEmpty()) {
            for (SearchResult result : results) {
                System.out.println(counter+ ". " + result.getTitle());
                counter ++;
            }
        } else {
            System.out.println("Нет статей для отображения.");
            counter = -1;
        }
        var = variant.choice(counter);
        openWiki.open(var, results);
    }
}
