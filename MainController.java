package com.Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Ecommerce.model.Order;
import com.Ecommerce.model.Product;
import com.Ecommerce.repository.OrderRepository;
import com.Ecommerce.repository.ProductRepository;
import com.Ecommerce.service.CartService;

@Controller
public class MainController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartService cartService;

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/")
    public String homePage(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "index";
    }

    @GetMapping("/products")
    public String productsPage(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }

    @PostMapping("/place-order")
    public String placeOrder(String name, String address, String phone) {
        double total = cartService.getTotal();
        Order order = new Order(name, address, phone, total);
        orderRepository.save(order);
        cartService.clearCart();
        return "redirect:/order-success";
    }

    @GetMapping("/order-success")
    public String orderSuccessPage() {
        return "order-success";
    }
}
