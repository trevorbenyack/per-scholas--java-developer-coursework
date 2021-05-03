package com.perscholas.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Log4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class EmployeeDetails {

    // fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "INT(11) UNSIGNED")
    int edId;

    @ManyToOne(cascade = {CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REFRESH})
    @JoinColumn(name = "eId")
    Employee employee;

    String edPhone;
    String edAddress;

    public EmployeeDetails(String edPhone, String edAddress) {
        this.edPhone = edPhone;
        this.edAddress = edAddress;
    }
}
