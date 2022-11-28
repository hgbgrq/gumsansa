package com.example.gumsansa.ordering.Repository;

import com.example.gumsansa.ordering.dto.vo.ProductVo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductVo, Long> {
}
