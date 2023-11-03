/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anudipcoding;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

/**
 * Implementation of the EmployeeDao interface that interacts with a database to perform CRUD operations on Employee objects.
 *
 * @author DELL
 */
public class EmployeeDaoImpl implements EmployeeDao {
 

    Connection connection;

    public EmployeeDaoImpl() {
        connection = DatabaseConnection.getDatabaseConnectionObject().getConnectionObj();
    }

    @Override
    public Employee getEmployee(Integer employee_id) {
        // Implementation to retrieve an employee by ID, not provided in the current code.
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // Step 3: Create a statement
            statement = connection.createStatement();
            // Step 4: Execute the query
            resultSet = statement.executeQuery("SELECT * FROM employees");
            // Step 5: Process the results

            while (resultSet.next()) {
                Integer employee_id = resultSet.getInt("employee_id");
                String employee_name = resultSet.getString("employee_name");
                Double employee_salary = resultSet.getDouble("employee_salary");
                String employee_designation = resultSet.getString("employee_designation");
                Date employee_joiningdate = resultSet.getDate("employee_joiningdate");

                employees.add(new Employee(employee_id, employee_name, employee_salary, employee_designation,
                        employee_joiningdate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return employees;
    }

    @Override
    public Boolean addEmployee(Employee employee) {
        // Prepare the SQL INSERT statement
        String insertQuery = "INSERT INTO employees (employee_id, employee_name, employee_salary, employee_designation, employee_joiningdate) "
                + "VALUES (?, ?, ?, ?, ?)";

        try {
            // Create a PreparedStatement for the INSERT query
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            // Set the values for the placeholders in the query
            preparedStatement.setInt(1, employee.getEmployee_id()); // Assuming employee_id is an integer
            preparedStatement.setString(2, employee.getEmployee_name());
            preparedStatement.setDouble(3, employee.getEmployee_salary());
            preparedStatement.setString(4, employee.getEmployee_designation());
            preparedStatement.setDate(5, (employee.getEmployee_joiningdate())); // Assuming employee_joiningdate is a java.sql.Date

            // Execute the INSERT query
            int rowsInserted = preparedStatement.executeUpdate();

            // Check if the insertion was successful
            if (rowsInserted > 0) {
                return true; // Employee added successfully
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } 
 
        return false;
    }

    @Override
    public Employee deleteEmployee(Integer employee_id) {
        try {
            String query = "DELETE FROM employees where employee_id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, employee_id); // Set the value for the parameter
            statement.executeUpdate();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        } 
 
        return null;
    }

    @Override
    public Boolean updateEmployee(Employee employee) {
        try {
            PreparedStatement stm = connection.prepareStatement("UPDATE employees SET employee_name=?, employee_salary=?, employee_designation=?, employee_joiningdate=? WHERE employee_id=?");
            stm.setString(1, employee.getEmployee_name());
            stm.setDouble(2, employee.getEmployee_salary());
            stm.setString(3, employee.getEmployee_designation());
            stm.setDate(4, employee.getEmployee_joiningdate());
            stm.setInt(5, employee.getEmployee_id());

            int rowsUpdated = stm.executeUpdate();

            if (rowsUpdated > 0) {
                return true; // Update successful.
            } else {
                return false; // No rows were updated (employee not found).
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 

        return false; // Handle this better in a real application.
    }
}
