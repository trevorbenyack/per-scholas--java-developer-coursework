package org.perscholas.dao;

public interface IemployeesDAO {

    enum SQL {

        // VALUE(Argument)
        GET_ALL_EMPLOYEES("SELECT * FROM employees"),
        GET_EMPLOYEE_BY_ID("SELECT * FROM employees WHERE employeeNumber = ?");

        private final String query; // describes an enumerated value

        // Constructor -- is invoked when one of the enum values is accessed. The
        // currently-being-accessed value's argument is passed into the constructor,
        // which is then assigned to the query variable.
        private SQL(String s) {
            this.query = s;
        }

        public String getQuery() {
            return query;
        }

    }
}
