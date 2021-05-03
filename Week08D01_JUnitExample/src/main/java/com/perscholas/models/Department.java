package com.perscholas.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Log4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Department {

    public Department(int dId, String dName) {
        this.dId = dId;
        this.dName = dName;
    }

    // fields
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "INT(11) UNSIGNED")
    int dId;
    String dName;

    @OneToMany(cascade = CascadeType.ALL) @JoinColumn(name = "dId")@ToString.Exclude
    List<Employee> employeeList;

    public Department(String dName) {
        this.dName = dName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (dId != that.dId) return false;
        return dName.equals(that.dName);
    }

    @Override
    public int hashCode() {
        int result = dId;
        result = 31 * result + dName.hashCode();
        return result;
    }
}
