package com.cognizant.medicare.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHandler {
    static Connection getConnection() {

        // for running JUnit test uncomment the below code

        /*
         * InputStream bufferedInputStream = (java.io.BufferedInputStream)
         * ConnectionHandler.class
         * .getClassLoader().getResourceAsStream("connection.properties");
         */

        // for running app uncomment the following code
        InputStream bufferedInputStream = (java.io.ByteArrayInputStream) ConnectionHandler.class
                .getClassLoader().getResourceAsStream("connection.properties");
        Properties properties = new Properties();
        try {
            properties.load(bufferedInputStream);
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Exception Message: " + e);
            throw new RuntimeException("Unable to find connection.properties in classpath.");
        }
        String driver = (String) properties.get("driver");
        String url = (String) properties.get("url");
        String username = (String) properties.get("user");
        String password = (String) properties.get("password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            // e.printStackTrace();
            System.out.println("Exception Message: " + e);
            throw new RuntimeException("Unable to load JDBC driver.");
        }
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            // e.printStackTrace();
            System.out.println("Exception Message: " + e);
            throw new RuntimeException("Unable to connect to the database.");
        }
        return connection;
    }
}
