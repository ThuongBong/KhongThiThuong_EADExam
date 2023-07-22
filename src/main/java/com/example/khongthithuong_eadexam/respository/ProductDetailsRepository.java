package com.example.khongthithuong_eadexam.respository;

import com.example.khongthithuong_eadexam.entities.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Integer> {
}
