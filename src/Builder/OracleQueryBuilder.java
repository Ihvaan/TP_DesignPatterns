package Builder;
public class OracleQueryBuilder extends QueryBuilder {
    @Override
    public String generateLimitQuery(int limit) {
        return "SELECT * FROM table WHERE ROWNUM <= " + limit;
    }

    @Override
    public String generateSubstringQuery(String str, int start, int length) {
        return "SELECT SUBSTR(" + str + ", " + start + ", " + length + ") FROM dual";
    }
}

