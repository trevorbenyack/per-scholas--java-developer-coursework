package com.perscholas;

import com.perscholas.models.Department;
import com.perscholas.models.Employee;
import com.perscholas.models.EmployeeDetails;
import com.perscholas.service.DepartmentService;
import com.perscholas.service.EmployeeServices;
import com.perscholas.util.JpaUtil;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner {

    public static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        EmployeeServices empSrvs = new EmployeeServices();
        DepartmentService deptSrvs = new DepartmentService();
        Employee employee = new Employee();

        // Scanner input = new Scanner(System.in);

        employee.setEName("Konstantin");
        employee.setEEmail("kon@gmail.com");
        employee.setESalary(12000D);



        EmployeeDetails ed1 = new EmployeeDetails("Plano, Texas", "6563432323");
        EmployeeDetails ed2 = new EmployeeDetails("Dallas, Texas", "1234567890");

        List<EmployeeDetails> edList = new ArrayList<>();
        edList.add(ed1);
        edList.add(ed2);

        employee.setEmployeeDetails(edList);

        empSrvs.createEmployee(employee);



        deptSrvs.createDepartment(new Department("IT"));
        deptSrvs.addEmployeeToDepartment(emf.createEntityManager().find(Employee.class, employee.getEId()), emf.createEntityManager().find(Department.class, 1).getDId());
        em.close();

    }
}
