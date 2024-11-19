import java.util.List;

public class Result {
    int variant;
    private Selector selector = new Selector();
    private BrowseOpener browseOpener= new BrowseOpener();
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
            System.exit(0);
        }
        variant = selector.choice(counter);
        browseOpener.open(variant, results);
    }

}
