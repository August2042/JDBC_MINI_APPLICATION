/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anudipcoding;

import java.sql.Date;

/**
 * This class represents an Employee entity, and it serves as a Java Bean.
 * It contains properties and getter and setter methods for the employee's attributes.
 *
 * @author DELL
 */
public class Employee {

    private Integer employee_id;
    private String employee_name;
    private Double employee_salary;
    private String employee_designation;
    private Date employee_joiningdate;

    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Parameterized constructor to create an Employee instance with all attributes.
     *
     * @param employee_id The unique identifier for the employee.
     * @param employee_name The name of the employee.
     * @param employee_salary The salary of the employee.
     * @param employee_designation The designation or job title of the employee.
     * @param employee_joiningdate The date when the employee joined.
     */
    public Employee(Integer employee_id, String employee_name, Double employee_salary, String employee_designation,
            Date employee_joiningdate) {
        super();
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_designation = employee_designation;
        this.employee_joiningdate = employee_joiningdate;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_designation() {
        return employee_designation;
    }

    public void setEmployee_designation(String employee_designation) {
        this.employee_designation = employee_designation;
    }

    public Date getEmployee_joiningdate() {
        return employee_joiningdate;
    }

    public void setEmployee_joiningdate(Date employee_joiningdate) {
        this.employee_joiningdate = employee_joiningdate;
    }

    @Override
    public String toString() {
        return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_salary="
                + employee_salary + ", employee_designation=" + employee_designation + ", employee_joiningdate="
                + employee_joiningdate + "]";
    }
}
