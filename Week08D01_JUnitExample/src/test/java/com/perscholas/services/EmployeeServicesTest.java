package com.perscholas.services;

import com.perscholas.MainRunner;
import com.perscholas.models.Employee;
import org.jboss.jandex.Main;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class EmployeeServicesTest {
    EmployeeServices es;


    @BeforeEach
    void setUp() {
         es = new EmployeeServices();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createEmployee() {
        assertTrue(MainRunner.emf.isOpen());
        Employee expected = new Employee(1,"jafer","habboubi@gmail.com",1000.0D);
        es.createEmployee(expected);
        Employee actual = es.findById(1);
        assertEquals(expected,actual);


    }
}