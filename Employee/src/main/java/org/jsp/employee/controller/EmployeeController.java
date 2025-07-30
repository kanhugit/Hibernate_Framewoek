package org.jsp.employee.controller;

import org.jsp.employee.dao.EmployeeDao;

public class EmployeeController {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();

        // Save Employee
//        Employee employee = new Employee();
//        employee.setId(104);
//        employee.setName("Puja");
//        employee.setAddress("UP");
//        employee.setSalary(650000);
//        dao.saveEmployee(employee);

        // Update Employee
//        Employee updatedEmployee = new Employee();
//        updatedEmployee.setId(104);
//        updatedEmployee.setName("Swati");
//        updatedEmployee.setAddress("MP");
//        updatedEmployee.setSalary(500000);
//        dao.updateEmployee(updatedEmployee);

        // Find Employee by ID
        dao.findEmployeeById(104);

        // Delete Employee by ID
//        dao.deleteEmployeeById(104);
    }
}
