package com.test.service;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class JpaUtil {

    static EntityManagerFactory factory;
    static final String NAME = "jpa-mapping-hands-on";

    public static EntityManagerFactory getEntityManagerFactory() {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory(NAME);
        }

        return factory;
    }

    public static void shutdown() {
        if(factory != null) {
            factory.close();
        }
    }

}
