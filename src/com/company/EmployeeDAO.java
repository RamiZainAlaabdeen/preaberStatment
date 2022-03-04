package com.company;

import java.util.List;


// crud
// creat
// read
// update
// delete

public interface EmployeeDAO {

    public abstract void createEmployee(Employee employee);

    public abstract Employee getEmployeeById(Integer employeeId);

    public abstract void updateEmployeeEmailById(String newEmail, Integer employeeId);

    public abstract void deleteEmployeeById(Integer employeeId);

    public abstract List<Employee> getAllEmployeesInfo();

}



