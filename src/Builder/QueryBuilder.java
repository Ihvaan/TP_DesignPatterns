package Builder;

public abstract class QueryBuilder {
    public abstract String generateLimitQuery(int limit);

    public abstract String generateSubstringQuery(String str, int start, int length);
}
