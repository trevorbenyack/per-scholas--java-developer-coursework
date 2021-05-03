package com.perscholas.service;

import com.perscholas.MainRunner;
import com.perscholas.dao.IEmployee;
import com.perscholas.models.Employee;
import lombok.extern.log4j.Log4j;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.TransactionRequiredException;
@Log4j
public class EmployeeServices implements IEmployee {

    @Override
    public void createEmployee(Employee employee) {

        // session
        EntityManager em = MainRunner.emf.createEntityManager();

        try {
            // transaction
            em.getTransaction().begin();
            em.persist(employee);


            // commit
            em.getTransaction().commit();
            log.info(employee);
        } catch (IllegalStateException |
                EntityExistsException |
                IllegalArgumentException |
                TransactionRequiredException e ) {
            log.error("Error persisting employee: " + employee);
            e.printStackTrace();
        } finally {
            em.close();
            log.info("EntityManager is closed");
        }

    }
}
