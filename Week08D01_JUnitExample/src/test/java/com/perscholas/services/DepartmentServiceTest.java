package com.perscholas.services;

import com.perscholas.MainRunner;
import com.perscholas.models.Department;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentServiceTest {
    DepartmentService ds;

    @BeforeEach
    void setUp() {
        ds = new DepartmentService();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createDepartment() {
        assertTrue(MainRunner.emf.isOpen());
        EntityManager em = MainRunner.emf.createEntityManager();
        Department dExpected = new Department(10, "Accounting");
        ds.createDepartment(dExpected);
        Department dActual = em.find(Department.class, 10);
        assertEquals(dExpected, dActual);

    }
}