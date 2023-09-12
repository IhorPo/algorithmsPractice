package creationalPatterns.singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private Connection connection;

    // Private constructor to prevent instantiation from outside the class
    private DatabaseConnectionManager() {
        initializeConnection();
    }

    // Provide a global point of access to the instance
    // synchronized - prevents multiple instances from being created
    // , even in a multi-threaded environment.
    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    // Initialize the database connection
    private void initializeConnection() {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "username";
        String password = "password";

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to the database.");
        }
    }

    // Other methods related to database connection management
    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Closed the database connection.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}