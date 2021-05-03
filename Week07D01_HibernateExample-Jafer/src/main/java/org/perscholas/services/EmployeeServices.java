package org.perscholas.services;

import lombok.extern.java.Log;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.perscholas.MainRunner;
import org.perscholas.dao.IEmployee;
import org.perscholas.models.Employee;

import java.util.List;
import java.util.Scanner;

@Log
public class EmployeeServices implements IEmployee {
    @Override
    public List<Employee> getAllEmployees() {
        Session session = MainRunner.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        List<Employee> emp = session.createQuery("from Employee").list();

        tx.commit();

        session.close();
        return emp;
    }

    @Override
    public void createEmployee(Employee e) {
        Session session = MainRunner.sessionFactory.openSession();
        Transaction tx = null;
        // check if employee id exist
        if(session.get(Employee.class,e.getEmpId())!=null) {
            log.severe("ID " + e.getEmpId() + " Exists!");
            return;
        }

        try{
            tx = session.beginTransaction();
            session.save(e);
            tx.commit();

        }catch (HibernateException ex){
                ex.printStackTrace();
        }finally {
            session.close();
        }

    }

    @Override
    public void updateEmployee(long id) {
        Session session = MainRunner.sessionFactory.openSession();
        Scanner input = new Scanner(System.in);
        Transaction tx = null;
        // find the employee


        // save or update
        try {
            Employee e = session.get(Employee.class,id);
            tx = session.beginTransaction();
            System.out.println("Enter name:");
            String name = input.nextLine();
            System.out.println("Enter email:");
            String email = input.next();

            e.setEmpName(name);
            e.setEmpEmail(email);
            session.saveOrUpdate(e);

            tx.commit();
        } catch (HibernateException e){
            e.printStackTrace();
        }catch(NullPointerException e) {
            e.printStackTrace();
        }
        finally  {
            session.close();
        }

    }

    @Override
    public void deleteEmployee(long id) {

    }
}
