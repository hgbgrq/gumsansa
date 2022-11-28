package com.example.gumsansa.ordering.Repository;

import com.example.gumsansa.ordering.dto.vo.OrderVo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderVo, Long> {
}
