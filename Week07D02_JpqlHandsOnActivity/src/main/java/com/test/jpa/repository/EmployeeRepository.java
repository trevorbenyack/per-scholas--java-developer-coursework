package com.test.jpa.repository;

import com.test.jpa.employee.OrderDetailsEntity;
import com.test.jpa.util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;

// Uses TypedQueries<T> to avoid compilation warnings and unnecessary casting
public class EmployeeRepository {

    public static void main(String[] args) {
        EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager entMgr = emf.createEntityManager();

         printFirstNames(entMgr);

         printOrderNumbersByProductCode(entMgr);

        printOrderNumbersBetween(entMgr);

        entMgr.close();
        JpaUtil.shutdown();

    } // end main method

    private static void printOrderNumbersBetween(EntityManager entMgr) {

        entMgr.getTransaction().begin();

        TypedQuery<OrderDetailsEntity> query = entMgr
                .createQuery("SELECT o FROM OrderDetailsEntity o " +
                        "WHERE o.orderNumber BETWEEN 10100 AND 10200", OrderDetailsEntity.class);
        List<OrderDetailsEntity> orderDetailsEntityList = query.getResultList();
        System.out.println("size of orderEntityList is " + orderDetailsEntityList.size());
        System.out.println("\nPrint Orders Numbers Between");
        orderDetailsEntityList.stream().forEach(e -> System.out.println("Order Name: " + e.getOrderNumber() +
                " Price: " + e.getPriceEach()));

        entMgr.getTransaction().commit();

    }

    private static void printOrderNumbersByProductCode(EntityManager entMgr) {

        entMgr.getTransaction().begin();

        TypedQuery<OrderDetailsEntity> query = entMgr
                .createQuery("SELECT o FROM OrderDetailsEntity o where o.productCode LIKE :givenId",
                        OrderDetailsEntity.class);
        query.setParameter("givenId", "S24_1937");
        List<OrderDetailsEntity> orderDetailsEntityList = query.getResultList();
        System.out.println("\nPrint Orders Numbers From Product Code");
        orderDetailsEntityList.stream().forEach(e -> System.out.println("Order Name: " + e.getOrderNumber() +
                " Price: " + e.getPriceEach()));

        entMgr.getTransaction().commit();

    }

    // This example shows the basic JPQL syntax
    private static void printFirstNames(EntityManager entMgr) {

        entMgr.getTransaction().begin();
        TypedQuery<String> query = entMgr.createQuery("SELECT e.firstName FROM EmployeeEntity e", String.class);
        List<String> resultList = query.getResultList();

        for(String e : resultList) {
            System.out.println("Employee First Name: " + e);
        }
        entMgr.getTransaction().commit();
    }
} // end class
