package com.beans;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {
    String firstName;
    String lastName;
    String userName;
    String password;
    String[] hobbies;
    String designation;
    String gender;

}
