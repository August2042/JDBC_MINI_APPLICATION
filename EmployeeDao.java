/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anudipcoding;

import java.util.List;

/**
 * This interface defines the contract for data access operations related to employees.
 * Any class that implements this interface should provide concrete implementations for these methods.
 *
 * @author DELL
 */
public interface EmployeeDao {

    /**
     * Retrieve an employee by their unique identifier.
     *
     * @param employee_id The unique identifier of the employee to retrieve.
     * @return The Employee object representing the retrieved employee.
     */
    public Employee getEmployee(Integer employee_id);

    /**
     * Retrieve a list of all employees.
     *
     * @return A list of Employee objects representing all employees.
     */
    public List<Employee> getEmployees();

    /**
     * Add a new employee to the data source.
     *
     * @param employee The Employee object to add.
     * @return true if the addition was successful, false otherwise.
     */
    public Boolean addEmployee(Employee employee);

    /**
     * Delete an employee by their unique identifier.
     *
     * @param employee_id The unique identifier of the employee to delete.
     * @return The Employee object that was deleted.
     */
    public Employee deleteEmployee(Integer employee_id);

    /**
     * Update an existing employee's information.
     *
     * @param employee The updated Employee object.
     * @return true if the update was successful, false otherwise.
     */
    public Boolean updateEmployee(Employee employee);
}
