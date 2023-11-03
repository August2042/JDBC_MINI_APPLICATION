/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Import necessary Java SQL packages
package anudipcoding;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class represents a singleton database connection.
 * It ensures that only one database connection is established and reused throughout the application.
 *
 * @author DELL
 */
public class DatabaseConnection {

    private Connection con = null;
    private static DatabaseConnection databaseConnection;

    // Private constructor to restrict instantiation from other classes
    private DatabaseConnection() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection to the MySQL database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "August$106317");

        } catch (Exception e) {
            // Handle any exceptions that may occur during connection
            System.out.println(e);
        }
    }

    /**
     * Get an instance of the DatabaseConnection.
     * This method ensures that a single instance is created and reused.
     *
     * @return The DatabaseConnection object.
     */
    public static DatabaseConnection getDatabaseConnectionObject() {
        if (databaseConnection != null) {
            return databaseConnection;
        } else {
            // If the instance doesn't exist, create it
            databaseConnection = new DatabaseConnection();
            return databaseConnection;
        }

    }

    /**
     * Get the connection object.
     *
     * @return The Connection object representing the database connection.
     */
    public Connection getConnectionObj() {
        return databaseConnection.con;
    }
}
