package com.perscholas.service;

import com.perscholas.MainRunner;
import com.perscholas.dao.IDepartment;
import com.perscholas.models.Department;
import com.perscholas.models.Employee;
import lombok.extern.log4j.Log4j;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.TransactionRequiredException;
import java.util.List;

@Log4j
public class DepartmentService implements IDepartment {

    @Override
    public void createDepartment(Department department) {

        // session
        EntityManager em = MainRunner.emf.createEntityManager();

        try {
            // transaction
            em.getTransaction().begin();
            em.persist(department);


            // commit
            em.getTransaction().commit();
            log.info(department);
        } catch (IllegalStateException |
                EntityExistsException |
                IllegalArgumentException |
                TransactionRequiredException e ) {
            log.error("Error persisting department: " + department);
            e.printStackTrace();
        } finally {
            em.close();
            log.info("EntityManager is closed");
        }

    } // end createDepartment method

    @Override
    public void addEmployeeToDepartment(Employee employee, int deptId) {

        // steps:
        // 1. session
        // 2. transaction
        // 2. logic
        // 4. commit or rollback
        // 5. handle exceptions
        // 6. end session

        EntityManager em = MainRunner.emf.createEntityManager();
        Department tempDepartment = null;
        try {
            em.getTransaction().begin();

            tempDepartment = em.find(Department.class, deptId);

            List<Employee> employeeList = tempDepartment.getEmpList();

            // using em.find() ensures that the object is not in detached or transit mode.
            employeeList.add(em.find(Employee.class, employee.getEId()));

            em.getTransaction().commit();
            log.info("department: " + tempDepartment + " employee: " + employee );
        } catch (IllegalStateException |
                EntityExistsException |
                IllegalArgumentException |
                TransactionRequiredException e ) {
            log.error("Error persisting department add employee: " + tempDepartment);
            e.printStackTrace();
        } finally {
            em.close();
            log.info("Session ended");
        }




    }
}
