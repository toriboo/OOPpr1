import java.util.List;

public class ApiResponse {
    private Query query;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}

class Query {
    private List<SearchResult> search;

    public List<SearchResult> getSearch() {
        return search;
    }

    public void setSearch(List<SearchResult> search) {
        this.search = search;
    }
}

class SearchResult {

    private int ns;
    private String title;
    private  int pageid;
    private  int size;
    private  int wordcount;
    private  String snippet;
    private  String timestamp;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public int getPageid() {
        return pageid;
    }

    public void setPageid(int pageid) {
        this.pageid = pageid;
    }
}
