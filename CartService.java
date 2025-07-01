package com.Ecommerce.service;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.model.CartItem;
import com.Ecommerce.model.Product;
import com.Ecommerce.repository.ProductRepository;

@Service
public class CartService {

    private Map<Long, CartItem> cartItems = new LinkedHashMap<>();

    @Autowired
    private ProductRepository productRepository;

    // Add product to cart
    public void addToCart(Long productId) {
        Product product = productRepository.findById(productId).orElse(null);
        if (product != null) {
            if (cartItems.containsKey(productId)) {
                CartItem item = cartItems.get(productId);
                item.setQuantity(item.getQuantity() + 1);
            } else {
                cartItems.put(productId, new CartItem(product, 1));
            }
        }
    }

    // Get all cart items
    public Collection<CartItem> getCartItems() {
        return cartItems.values();
    }

    // Calculate total price
    public double getTotal() {
        return cartItems.values().stream()
                .mapToDouble(CartItem::getSubtotal)
                .sum();
    }

    // Clear the cart
    public void clearCart() {
        cartItems.clear();
    }
}
