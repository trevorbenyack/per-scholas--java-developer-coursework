package org.perscholas.dao;

import org.perscholas.models.Department;

public interface IDepartment {

    void getDepartment(Department department);
    void editDepartment(long id);
    void viewDepartment(long id);
    void deleteDepartment(long id);
    void viewAllDepartments();
}
