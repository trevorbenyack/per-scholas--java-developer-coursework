package org.perscholas.services;

import lombok.extern.java.Log;
import org.perscholas.dao.AbstractDAO;
import org.perscholas.dao.IemployeeMethods;
import org.perscholas.dao.IemployeesDAO;
import org.perscholas.models.Employee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Log
public class EmployeeService extends AbstractDAO implements IemployeeMethods {


    @Override
    public List<Employee> getAllEmployees() {

        // List
        List<Employee> employees = new ArrayList<Employee>(25);
        // connect
        this.connect();
        // prepared statement
        try {
            ps = conn.prepareStatement(IemployeesDAO.SQL.GET_ALL_EMPLOYEES.getQuery());

            // execution
            rs = ps.executeQuery();

            // result set

            while(rs.next()){

                employees.add(new Employee(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8)

                ));

            }

        } catch (SQLException e ){
            log.severe("Something bad happened! ");
        }

        // dispose
        this.dispose();

        return employees;
    }

    @Override
    public Employee getEmployeeById(int id) {

        Employee employee = null;
        this.connect();
        try {
            ps = conn.prepareStatement(IemployeesDAO.SQL.GET_EMPLOYEE_BY_ID.getQuery());
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()) {
                employee = new Employee();

                employee.setEmployeeNumber(rs.getInt(1));
                employee.setLastName(rs.getString(2));
                employee.setFirstName(rs.getString(3));
                employee.setEmail(rs.getString(5));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            this.dispose();
        }

        return employee;
    }
}
