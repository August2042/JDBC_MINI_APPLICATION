/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anudipcoding;

import java.util.Scanner;
import java.sql.Date;

/**
 * A simple console application that allows performing CRUD operations on
 * employee data.
 *
 * @author DELL
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("WELCOME TO CRUD OPERATION IN JAVA");
            System.out.println("1.ADD EMPLOYEE ");
            System.out.println("2.VIEW EMPLOYEE ");
            System.out.println("3.UPDATE EMPLOYEE ");
            System.out.println("4.DELETE EMPLOYEE ");

            System.out.println("Enter your choice for performing CRUD operation : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // For adding an employee

                    EmployeeDao employeeDao = new EmployeeDaoImpl();
                    System.out.println("Enter the employee Id : ");
                    int employeeId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the employee name : ");
                    String employeeName = sc.nextLine();

                    System.out.println("Enter the employee salary : ");
                    Double employeeSalary = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Enter the employee designation : ");
                    String employeeDesignation = sc.nextLine();

                    System.out.println("Enter the employee joining date : ");
                    String joiningDateStr = sc.nextLine();
                    Date employeeJoiningDate = Date.valueOf(joiningDateStr);
                    Employee emp = new Employee(employeeId, employeeName, employeeSalary, employeeDesignation, employeeJoiningDate);
                    employeeDao.addEmployee(emp);

                    break;
                case 2: // For viewing employees

                    EmployeeDao employeeDao1 = new EmployeeDaoImpl();
                    for (Employee employee : employeeDao1.getEmployees()) {
                        System.out.println(employee);
                    }
                    break;
                case 3: // For updating an employee

                    EmployeeDao employeeDao3 = new EmployeeDaoImpl();
                    System.out.println("Enter the employee Id : ");
                    int employeeId3 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the employee name : ");
                    String employeeName3 = sc.nextLine();

                    System.out.println("Enter the employee salary : ");
                    Double employeeSalary3 = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Enter the employee designation : ");
                    String employeeDesignation3 = sc.nextLine();

                    System.out.println("Enter the employee joining date : ");
                    String joiningDateStr3 = sc.nextLine();
                    Date employeeJoiningDate3 = Date.valueOf(joiningDateStr3);

                    Employee emp3 = new Employee(employeeId3, employeeName3, employeeSalary3, employeeDesignation3, employeeJoiningDate3);
                    employeeDao3.updateEmployee(emp3);

                    break;
                case 4: // For deleting an employee

                    System.out.print("Enter employee ID: ");
                    int employeeId1 = sc.nextInt();
                    EmployeeDao employeeDao4 = new EmployeeDaoImpl();
                    Employee emp4 = new Employee();
                    employeeDao4.deleteEmployee(employeeId1);

                    break;
                default:
                    System.out.println("Wrong choice....");
            }
            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
            num = sc.nextInt();
            System.out.println("*****THANK YOU FOR USING THIS MINI APPLICATION*****");

        } while (num == 1);
    }
}
