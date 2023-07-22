package com.example.khongthithuong_eadexam.controller;

import com.example.khongthithuong_eadexam.entities.ProductDetails;
import com.example.khongthithuong_eadexam.entities.SalesDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.khongthithuong_eadexam.respository.ProductDetailsRepository;
import com.example.khongthithuong_eadexam.respository.SalesDetailsRepository;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductSalesController {

    @Autowired
    private ProductDetailsRepository productDetailsRepository;

    @Autowired
    private SalesDetailsRepository salesDetailsRepository;

    @GetMapping("/")
    public String index(Model model) {
        List<ProductDetails> productDetailsList = productDetailsRepository.findAll();
        model.addAttribute("productDetailsList", productDetailsList);
        return "index";
    }

    @GetMapping("/product/{id}")
    public String productDetail(@PathVariable Long id, Model model) {
        Optional<ProductDetails> productDetailsOptional = productDetailsRepository.findById(id);
        if (!productDetailsOptional.isPresent()) {
            return "redirect:/";
        }
        ProductDetails productDetails = productDetailsOptional.get();
        List<SalesDetails> salesDetailsList = salesDetailsRepository.findByProductDetails(productDetails);
        model.addAttribute("productDetails", productDetails);
        model.addAttribute("salesDetailsList", salesDetailsList);
        return "product_detail";
    }
}
