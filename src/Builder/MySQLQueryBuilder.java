package Builder;

public class MySQLQueryBuilder extends QueryBuilder {
    @Override
    public String generateLimitQuery(int limit) {
        return "SELECT * FROM table LIMIT " + limit;
    }

    @Override
    public String generateSubstringQuery(String str, int start, int length) {
        return "SELECT SUBSTRING(" + str + ", " + start + ", " + length + ")";
    }
}

