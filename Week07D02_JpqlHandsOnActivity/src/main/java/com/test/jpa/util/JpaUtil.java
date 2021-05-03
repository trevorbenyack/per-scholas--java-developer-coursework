package com.test.jpa.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

    private static String PERSISTENCE_UNIT_NAME = "jpql-hands-on";
    private static EntityManagerFactory emf;

    public static EntityManagerFactory getEntityManagerFactory() {

        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return emf;
    }

    public static void shutdown() {
        if (emf != null) {
            emf.close();
        }
    }

}
