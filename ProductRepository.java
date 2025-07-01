package Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}


