package org.perscholas.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
public class Employee {
    //fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(11) UNSIGNED")
    long empId;
    String empName;
    @Column(unique = true)
    String empEmail;

    public Employee(String empName, String empEmail){
        this.empName = empName;
        this.empEmail = empEmail;
    }


}
