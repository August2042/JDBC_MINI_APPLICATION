# Employee Management System (Java CRUD Application)

## Overview

This Java application is a simple Employee Management System that allows you to perform CRUD (Create, Read, Update, Delete) operations on employee data. It includes the following components:

1. **App.java**: The main application that provides a command-line interface to interact with the Employee data.

2. **EmployeeDao.java**: An interface that defines the contract for data access operations related to employees. Any class that implements this interface should provide concrete implementations for these methods.

3. **EmployeeDaoImpl.java**: An implementation of the EmployeeDao interface that interacts with a MySQL database to perform CRUD operations on Employee objects.

4. **Employee.java**: A Java Bean class that represents an Employee entity. It contains properties and getter and setter methods for the employee's attributes.

5. **DatabaseConnection.java**: A singleton class responsible for establishing and managing the database connection. It ensures that only one database connection is established and reused throughout the application.

## How to Use

1. **Database Configuration**: Ensure that you have a MySQL database set up with the appropriate schema (in this case, "EmployeeDB"). Modify the connection details in the `DatabaseConnection` class if needed.

2. **Build and Run**: Compile and run the `App.java` class, which serves as the entry point for the application.

3. **CRUD Operations**:
   - **1. ADD EMPLOYEE**: Add a new employee to the database by providing their details.
   - **2. VIEW EMPLOYEE**: View a list of all employees stored in the database.
   - **3. UPDATE EMPLOYEE**: Update an existing employee's information by specifying their ID.
   - **4. DELETE EMPLOYEE**: Delete an employee by specifying their ID.

4. **Follow the Command-Line Prompts**: The application will guide you through the available options and prompt you for the necessary input.

## Dependencies

- Java SE Development Kit
- MySQL database (with JDBC driver)

## Contribution

Feel free to contribute to this project by submitting pull requests or reporting issues.

## License

This project is licensed under the [MIT License](LICENSE).

---

You can save this content in a file named `README.md` in your project directory, and it will serve as the documentation for your Java CRUD application. Make sure to customize it further with any additional details or specific instructions for your users.
