package simple.fms.util;

import java.sql.*;

public class DbUtil {
    private final Connection connection;
    private Statement statement;

    //Database connection details
    final String url = "jdbc:mysql://localhost:3306/farm_management_system";
    final String user= "mugo367";
    final String password = "mweiga_123";

        //To initialize connection to the database
    public DbUtil() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }
        //To close the connection to the database
    @Override
    protected void finalize() throws Throwable {
        this.closeConnection();
    }
        //To read data from the database
    /** Example
     * -> SELECT * || [column_names] FROM table_name
     * -> SELECT * || [column_names] FROM table_name WHERE [Condition (And||Or||Not)]
     * -> SELECT  * || [column_names] FROM table_name ORDER BY [column_names] ASC||DESC
     * */
    public ResultSet readData(String query) throws SQLException {
        statement = connection.createStatement();
        return statement.executeQuery(query);
    }
        //To write data to the database
        //To delete data from the database
        //To update date in the database
    /** Example
     * -> INSERT INTO table_name ([column_names]) VALUES ([values])
     * -> UPDATE table_name SET column1 = value1, column2 = value2, ... WHERE condition
     * -> DELETE FROM table_name WHERE condition
     * */
    public int writeData(String query) throws SQLException {
        statement = connection.createStatement();
        return statement.executeUpdate(query);
    }
        //To close the connection
    private void closeConnection() throws SQLException {
        statement.close();
        connection.close();
    }
}
