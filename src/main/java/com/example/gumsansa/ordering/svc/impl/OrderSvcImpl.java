package com.example.gumsansa.ordering.svc.impl;

import com.example.gumsansa.common.FileDto;
import com.example.gumsansa.ordering.dto.req.OrderReadReqDto;
import com.example.gumsansa.ordering.dto.req.OrderUpdateReqDto;
import com.example.gumsansa.ordering.dto.res.OrderFileResDto;
import com.example.gumsansa.ordering.dto.res.OrderReadListDto;
import com.example.gumsansa.ordering.svc.OrderSvc;
import org.springframework.stereotype.Service;

@Service
public class OrderSvcImpl implements OrderSvc {
    @Override
    public OrderReadListDto selectOrderList(OrderReadReqDto orderReadReqDto) {
        return null;
    }

    @Override
    public OrderFileResDto uploadOrderFile(FileDto fileDto) {
        OrderFileResDto orderFileResDto = new OrderFileResDto();
        return orderFileResDto;
    }

    @Override
    public void modifyOrder(OrderUpdateReqDto orderUpdateReqDto) {

    }
}
