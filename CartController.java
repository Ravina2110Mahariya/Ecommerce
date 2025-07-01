package Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ecommerce.model.Cart;
import Ecommerce.repository.CartRepository;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "*")
public class CartController {

    @Autowired
    private CartRepository cartRepo;

    @PostMapping
    public Cart add(@RequestBody Cart item) {
        return cartRepo.save(item);
    }

    @GetMapping
    public List<Cart> list() {
        return cartRepo.findAll();
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id) {
        cartRepo.deleteById(id);
    }
}
