package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public Connection connectTO(String nameDB){
        Connection connection = null;
        try {
            if (nameDB.compareToIgnoreCase("oracle") == 0) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "billiard", "billiard");
            } else if (nameDB.compareToIgnoreCase("postgres") == 0) {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/billiard", "postgres", "admin");
            }
        } catch (Exception e) {
        }
        return connection;
    }
}
