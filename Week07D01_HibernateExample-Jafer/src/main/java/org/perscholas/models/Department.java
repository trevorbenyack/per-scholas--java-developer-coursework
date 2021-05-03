package org.perscholas.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Department {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "dept_name")
    String deptName;

    @Column
    String location;

    public Department(String deptName, String location) {
        this.deptName = deptName;
        this.location = location;
    }





}
