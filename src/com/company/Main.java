package com.company;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        Employee employee = getEmployee();
        employeeDAO.createEmployee(employee);
       // getEmployeeById(employeeDAO);
      //  employeeDAO.updateEmployeeEmailById("jmfghfghngh4@gmail.com", 5);
      //  employeeDAO.deleteEmployeeById(7);
        getAllEmployeesInfo(employeeDAO);

    }


    private static void getAllEmployeesInfo(EmployeeDAO employeeDAO) {
        List<Employee> empList = employeeDAO.getAllEmployeesInfo();
        for (Employee employee : empList) {
            System.out.println(employee);
        }
    }

    private static void getEmployeeById(EmployeeDAO employeeDAO) {
        Employee employee2 = employeeDAO.getEmployeeById(5);
        if(employee2 != null){
            System.out.println(employee2);
        }else{
            System.out.println("Employee does not exist..");
        }
    }

    private static Employee getEmployee() {
        Employee employee1 = new Employee();
        employee1.setBonus(new BigDecimal(400));
        employee1.setEmployeeName("Zain");
        employee1.setEmail("hjgjgj@hotmail.com");
        employee1.setSalary(150000.00);
        return employee1;
    }
}


