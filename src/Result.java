import java.util.List;

public class Result {
    int counter = 1;
    int var;
    private Variant variant = new Variant();
    private OpenWiki openWiki = new OpenWiki();
    void show(List<SearchResult> results)
    {
        int counter = 0;
        if (results != null && !results.isEmpty()) {
            while  (counter < results.size()) {
                SearchResult result = results.get(counter);
                System.out.println(counter+1 + ". " + result.getTitle());
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
