package org.perscholas.dao;

import org.perscholas.models.Employee;

import java.util.List;

public interface IEmployee {

    List<Employee> getAllEmployees();
    void createEmployee(Employee e);
    void updateEmployee(long id);
    void deleteEmployee(long id);

}
