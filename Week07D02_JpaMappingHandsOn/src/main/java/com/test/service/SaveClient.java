package com.test.service;

import com.test.model.NonTeachingStaff;
import com.test.model.TeachingStaff;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class SaveClient {

    public static void main(String[] args) {

        EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Teaching staff entity
        TeachingStaff ts1 = new TeachingStaff("Alex", "MSc MEd", "Maths");
        TeachingStaff ts2 = new TeachingStaff("Peterson", "BSc BEd", "English");

        // Non-Teaching Staff entity
        NonTeachingStaff nts1 = new NonTeachingStaff("Ramon", "Accounts");
        NonTeachingStaff nts2 = new NonTeachingStaff("Ali", "Office Admin");

        // storing all entities
        em.persist(ts1);
        em.persist(ts2);
        em.persist(nts1);
        em.persist(nts2);

        em.getTransaction().commit();


    }



}
