package com.anilduyguc.orderservice.repository;

import com.anilduyguc.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
