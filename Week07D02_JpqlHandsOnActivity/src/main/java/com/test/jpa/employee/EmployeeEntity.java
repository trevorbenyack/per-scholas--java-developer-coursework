package com.test.jpa.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString
@Table(name = "employees")
public class EmployeeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int employeeNumber;
    String firstName;
    String lastName;
    String email;
    int officeCode;

    public EmployeeEntity(String firstName, String lastName, String email, int officeCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.officeCode = officeCode;
    }
}
