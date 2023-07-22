package com.example.khongthithuong_eadexam.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product_details")
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "productDetails", cascade = CascadeType.ALL)
    private List<SalesDetails> salesDetails;

    // constructors, getters and setters
}
