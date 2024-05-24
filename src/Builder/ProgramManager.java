package Builder;

public class ProgramManager {
    private QueryBuilder queryBuilder;

    public void setQueryBuilder(QueryBuilder queryBuilder) {
        this.queryBuilder = queryBuilder;
    }

    public Program createProgram() {
        Program program;
        if (queryBuilder instanceof OracleQueryBuilder) {
            program = new OracleProgram();
        } else {
            program = new MySQLProgram();
        }

        program.addQuery(queryBuilder.generateLimitQuery(10));
        program.addQuery(queryBuilder.generateSubstringQuery("example", 1, 4));
        return program;
    }
}
