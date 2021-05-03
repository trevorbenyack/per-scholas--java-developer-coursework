package org.perscholas;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.perscholas.models.Employee;
import org.perscholas.services.EmployeeServices;
import org.perscholas.util.HibernateUtil;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class MainRunner {
    public static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);
        Session session = sessionFactory.openSession();
        EmployeeServices es = new EmployeeServices();
        // create Employee
        int userInput = 0;
        do {

            System.out.printf("1. Create new Employee.%n2.Update Employee%n5. Print all employees");

            userInput = input.nextInt();
            input.nextLine();
            switch (userInput) {
                case 1:
                    //System.out.println("Enter Employee ID:");

                    //long id = input.nextInt();
                   // input.nextLine();
                    System.out.println("Enter Employee Name:");
                    String name = input.nextLine();
                    System.out.println("Enter Employee Email:");
                    String email = input.next();
                    Employee createEmp = new Employee(name, email);
                    es.createEmployee(createEmp);
                    break;

                case 2:
                    System.out.println("Enter Emp ID to Update: ");
                    es.updateEmployee(input.nextInt());
                    break;
                case 5:

                    List<Employee> printEmp = es.getAllEmployees();

                    for (Employee e : printEmp) {
                        System.out.println(e);
                    }
                    break;
            }
        } while(userInput != 0);

        System.out.println("Loop Ended!");

    }
}

