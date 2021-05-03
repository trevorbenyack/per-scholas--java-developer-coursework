package com.test.model;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sid")

@DiscriminatorValue(value = "NS")
@Getter @Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NonTeachingStaff extends Staff {

    String areaExpertise;

    public NonTeachingStaff() {
        super();
    }

    public NonTeachingStaff(String sname, String areaExpertise) {
        super(sname);
        this.areaExpertise = areaExpertise;
    }
}
