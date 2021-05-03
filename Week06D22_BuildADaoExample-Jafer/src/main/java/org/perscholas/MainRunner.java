package org.perscholas;

import org.perscholas.models.Employee;
import org.perscholas.services.EmployeeService;

import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {
        EmployeeService e = new EmployeeService();
        var lEmp = e.getAllEmployees();

//        for(Employee emp: lEmp){
//            System.out.println(emp);
//        }

        System.out.print("Please enter an Employee ID: ==> ");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        var employee = e.getEmployeeById(id);
        if(employee != null) {
            System.out.println("\nHere are the details for employee " + id + ":");
            System.out.printf("%-15s%-15s%-15s%n",
                    "Last Name",
                    "First Name",
                    "Email");
            System.out.printf("%-15s%-15s%-15s%n",
                    employee.getLastName(),
                    employee.getFirstName(),
                    employee.getEmail());
        }
    }
}
