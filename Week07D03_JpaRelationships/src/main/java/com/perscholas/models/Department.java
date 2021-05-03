package com.perscholas.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j;

import javax.persistence.*;
import java.util.List;

@Getter @Setter
@Entity
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Log4j
public class Department {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "INT(11) UNSIGNED")
    int dId;
    String dName;

    @OneToMany(cascade = CascadeType.ALL) @JoinColumn(name = "dId") @ToString.Exclude
    List<Employee> empList;

    public Department(String dName) {
        this.dName = dName;
    }
}
