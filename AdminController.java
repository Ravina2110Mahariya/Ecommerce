package com.Ecommerce.controller;

import com.Ecommerce.model.Product;
import com.Ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "admin-products";
    }

    @GetMapping("/products/new")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "product-form";
    }

    @PostMapping("/products/save")
    public String saveProduct(@ModelAttribute Product product) {
        productRepository.save(product);
        return "redirect:/admin/products";
    }

    @GetMapping("/products/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Product product = productRepository.findById(id).orElse(null);
        model.addAttribute("product", product);
        return "product-form";
    }

    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
        return "redirect:/admin/products";
    }
}
