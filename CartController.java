package com.Ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Ecommerce.service.CartService;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    // Add product to cart by ID
    @GetMapping("/cart/add/{id}")
    public String addToCart(@PathVariable Long id) {
        cartService.addToCart(id);
        return "redirect:/cart";
    }

    // View cart page
    @GetMapping("/cart")
    public String viewCart(Model model) {
        model.addAttribute("cartItems", cartService.getCartItems());
        model.addAttribute("total", cartService.getTotal());
        return "cart";
    }
}
