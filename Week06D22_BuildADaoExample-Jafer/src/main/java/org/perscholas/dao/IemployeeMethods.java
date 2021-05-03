package org.perscholas.dao;

import org.perscholas.models.Employee;

import java.util.List;

public interface IemployeeMethods {

    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(int id);
}
