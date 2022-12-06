package com.example.gumsansa.ordering.dto.res;

import lombok.Data;

import java.util.List;

@Data
public class OrderReadResDto {

    private String company;

    private List<ProductResDto> productResDtoList;
}
