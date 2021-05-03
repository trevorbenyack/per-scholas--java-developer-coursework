package com.test.jpa.employee;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class OrderDetailsId implements Serializable {

    private int orderNumber;

    private String productCode;

}