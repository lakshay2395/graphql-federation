package com.example.orderservice.repositories;

import com.example.orderservice.entities.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, String> {
}