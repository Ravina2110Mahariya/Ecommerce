package Ecommerce.repository;  // ensure this is the exact package where Spring scans

import org.springframework.data.jpa.repository.JpaRepository;

import Ecommerce.model.Cart;


public interface CartRepository extends JpaRepository<Cart, Long> {
    // Add custom queries if needed
}



