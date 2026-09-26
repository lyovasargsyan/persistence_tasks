package com.example.jdbc.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseUtil {

    private static final Properties PROPERTIES = new Properties();

    static {
        try (InputStream inputStream = DatabaseUtil.class.getClassLoader().getResourceAsStream("database.properties")) {
            if (inputStream == null) {
                throw new IllegalStateException("database.properties file was not found.");
            }
            PROPERTIES.load(inputStream);
        } catch (IOException e) {
            throw new IllegalStateException("Could not read database.properties file.", e);
        }
    }

    private DatabaseUtil() {
    }

    public static Connection getConnection() throws SQLException {
        String url = PROPERTIES.getProperty("db.url");
        String username = PROPERTIES.getProperty("db.username");
        String password = PROPERTIES.getProperty("db.password");

        return DriverManager.getConnection(url, username, password);
    }
}

