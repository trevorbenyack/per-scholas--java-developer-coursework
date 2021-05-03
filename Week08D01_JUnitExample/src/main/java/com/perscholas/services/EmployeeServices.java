package com.perscholas.services;

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
            // save
            em.persist(em.merge(employee));
            //commit
            em.getTransaction().commit();

            log.info(employee);
        } catch(IllegalStateException | EntityExistsException | IllegalArgumentException | TransactionRequiredException e ){
            em.getTransaction().rollback();
            log.error("Error persisting employee: " + employee);
            e.printStackTrace();

        } finally {
            //close em

            em.close();
            log.info("EntityManager is closed!");
        }


    }

    @Override
    public Employee findById(int id) {


        // session
        EntityManager em = MainRunner.emf.createEntityManager();
        Employee employee = null;
        try {
            // transaction

            em.getTransaction().begin();
            // save
             employee = em.find(Employee.class, id);
            //commit
            em.getTransaction().commit();

            log.info("employee with id " + id + "was found and returned ");
        } catch(IllegalStateException e){
            em.getTransaction().rollback();
            log.error("Error finding employee: " + id);
            e.printStackTrace();

        } finally {
            //close em

            em.close();
            log.info("EntityManager is closed!");
            return employee;
        }
    }
}
