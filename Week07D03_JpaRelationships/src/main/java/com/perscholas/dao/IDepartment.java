package com.perscholas.dao;

import com.perscholas.models.Department;
import com.perscholas.models.Employee;

public interface IDepartment {

    void createDepartment(Department department);
    void addEmployeeToDepartment(Employee employee, int deptId);

}
