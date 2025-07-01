package Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Ecommerce.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
