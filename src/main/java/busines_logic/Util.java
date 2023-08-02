package busines_logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private final String DB_DRIVER = "org.h2.Driver";
    private final String DB_URL = "jdbc:h2:~/testdb";
    private final String DB_USERNAME = "danny";
    private final String DB_PASSWORD = "";

    public Connection getConnection()  {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connection is OK");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failed...");
        }


        return connection;
    }
}
