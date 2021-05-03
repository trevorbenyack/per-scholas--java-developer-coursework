package com.test.jpa.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "orderdetails")
@Entity
@NoArgsConstructor
@Getter @Setter
@ToString
@IdClass(OrderDetailsId.class)
public class OrderDetailsEntity {

    @Id
    int orderNumber;

    @Id
    String productCode;

    int quantityOrdered;
    Double priceEach;
    int orderLineNumber;


    public OrderDetailsEntity(int orderLineNumber, String productCode, double priceEach) {
        this.orderLineNumber = orderLineNumber;
        this.productCode = productCode;
        this.priceEach = priceEach;
    }
}