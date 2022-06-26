package com.tamercankacak.interprobehomework.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(generator = "product")
    @SequenceGenerator(name = "product", sequenceName = "PRODUCT_ID_SEQ")
    private Long id;

    @Column(length = 50)
    private String name;

    @Column
    private double price;

    @Column
    @Temporal(TemporalType.DATE)
    private Date expirationDate;

}
