package mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDonnee {
    private static final String HOST = "localhost";
    private static final int PORT = 3306;
    private static final String DB_NOM = "projet";
    private static final String UTILISATEUR_NOM = "root";
    private static final String MOTPASS = "";

    public static Connection connection;

    private static final String URL = String.format("jdbc:mysql://%s:%d/%s", HOST, PORT, DB_NOM);

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, UTILISATEUR_NOM, MOTPASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
