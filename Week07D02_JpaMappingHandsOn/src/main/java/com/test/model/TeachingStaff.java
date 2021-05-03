package com.test.model;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="sid")

// This is the "type" that will appear in the type column
@DiscriminatorValue( value = "TS")
@Getter @Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TeachingStaff extends Staff{

    String qualification;

    String subjectexpertise;

    public TeachingStaff() {
        super();
    }

    public TeachingStaff(String sname, String qualification, String subjectexpertise) {
        super(sname);
        this.qualification = qualification;
        this.subjectexpertise = subjectexpertise;
    }
}
