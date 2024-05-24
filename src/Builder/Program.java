package Builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Program {
    protected List<String> queries = new ArrayList<>();

    public void addQuery(String query) {
        queries.add(query);
    }

    public void executeQueries() {
        for (String query : queries) {
            System.out.println(query);
        }
    }
}

