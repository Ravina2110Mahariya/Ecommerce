package com.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Ecommerce.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
