package org.perscholas.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal=false, level= AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    //fields
    int employeeNumber;
    String lastName;
    String firstName;
    String extension;
    String email;
    int officeCode;
    int reportsTo;
    String jobTitle;


}
