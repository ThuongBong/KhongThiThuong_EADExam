package com.example.khongthithuong_eadexam.respository;

import com.example.khongthithuong_eadexam.entities.ProductDetails;
import com.example.khongthithuong_eadexam.entities.SalesDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesDetailsRepository extends JpaRepository<SalesDetails, Integer> {
    List<SalesDetails> findByProductDetails(ProductDetails productDetails);
}
