package com.test.model;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Table(name = "Staff")
@Entity

// Instead of using linking tables, this will put all records
// of the children of class Staff in one table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

// In order to differentiate which child class an entry belongs to
// a new column is created that contains each entry's type.
// That type is a text description specified by the programmer
// This is referred to as discrimination.
// The following annotation provides the name of the Discriminator column
@DiscriminatorColumn(name = "type")
@Getter @Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Staff {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int sid;

    String sname;

    public Staff(String sname) {
        this.sname = sname;
    }
}