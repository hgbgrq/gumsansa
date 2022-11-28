package com.example.gumsansa.ordering.dto.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="order")
public class OrderVo {

    @Id
    private Long orderId;

}
