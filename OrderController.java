package Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ecommerce.model.Order;
import Ecommerce.repository.OrderRepository;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    private OrderRepository repo;

    @PostMapping
    public Order place(@RequestBody Order order) {
        return repo.save(order);
    }

    @GetMapping
    public List<Order> getAll() {
        return repo.findAll();
    }
}
