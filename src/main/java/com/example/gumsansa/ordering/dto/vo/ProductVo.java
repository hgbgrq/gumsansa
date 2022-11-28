package com.example.gumsansa.ordering.dto.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="product")
public class ProductVo {

    @Id
    private Long productId;
}
