package com.example.gumsansa.ordering.Repository;

import com.example.gumsansa.ordering.dto.vo.OrderFileVo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderFileRepository extends JpaRepository<OrderFileVo, Long> {
}
