package Builder;

public class User {
    public static void main(String[] args) {
        ProgramManager manager = new ProgramManager();

        manager.setQueryBuilder(new OracleQueryBuilder());
        Program oracleProgram = manager.createProgram();
        System.out.println("Oracle Program Queries:");
        oracleProgram.executeQueries();

        manager.setQueryBuilder(new MySQLQueryBuilder());
        Program mySQLProgram = manager.createProgram();
        System.out.println("\nMySQL Program Queries:");
        mySQLProgram.executeQueries();
    }
}
