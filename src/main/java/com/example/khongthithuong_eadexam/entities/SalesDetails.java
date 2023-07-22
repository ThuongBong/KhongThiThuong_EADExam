package com.example.khongthithuong_eadexam.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "sales_details")
public class SalesDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate salesDate;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductDetails productDetails;

    // constructors, getters and setters
}
