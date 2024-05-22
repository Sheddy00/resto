package hei.school.resto.db;

import hei.school.resto.exeption.DataConnectionException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String url = System.getenv("URL");
    private static final String username = System.getenv("USERNAME");
    private static final String password = System.getenv("PASSWORD");

    public static Connection getConnection(String url, String username, String password) {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new DataConnectionException(e.getMessage());
        }
    }

    public static Connection getConnection() {
        return getConnection(url, username, password);
    }
}
