package com.Ecommerce.controller;

import com.Ecommerce.model.Order;
import com.Ecommerce.repository.OrderRepository;
import com.Ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderController {

    @Autowired
    private CartService cartService;

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/checkout")
    public String checkoutForm(Model model) {
        model.addAttribute("total", cartService.getTotal());
        return "checkout";
    }

    @PostMapping("/order/place")
    public String placeOrder(@RequestParam String customerName,
                             @RequestParam String address,
                             @RequestParam String phone) {

        Order order = new Order();
        order.setCustomerName(customerName);
        order.setAddress(address);
        order.setPhone(phone);
        order.setTotalAmount(cartService.getTotal());

        orderRepository.save(order);
        cartService.clearCart();

        return "redirect:/order/success";
    }

    @GetMapping("/order/success")
    public String successPage() {
        return "success";
    }
}
