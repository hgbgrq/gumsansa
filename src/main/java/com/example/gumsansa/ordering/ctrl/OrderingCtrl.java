package com.example.gumsansa.ordering.ctrl;

import com.example.gumsansa.common.FileDto;
import com.example.gumsansa.ordering.dto.req.OrderReadReqDto;
import com.example.gumsansa.ordering.dto.req.OrderRegReqDto;
import com.example.gumsansa.ordering.dto.req.OrderUpdateReqDto;
import com.example.gumsansa.ordering.dto.res.OrderFileResDto;
import com.example.gumsansa.ordering.dto.res.OrderReadListDto;
import com.example.gumsansa.ordering.svc.OrderSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderingCtrl {

    @Autowired
    private OrderSvc orderSvc;

    @GetMapping
    public ResponseEntity<OrderReadListDto> getOrderList(OrderReadReqDto orderReadReqDto){
        OrderReadListDto result = orderSvc.selectOrderList(orderReadReqDto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/upload")
    public ResponseEntity<OrderFileResDto> getFile(FileDto fileDto){
    OrderFileResDto result = orderSvc.uploadOrderFile(fileDto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> regOrder(OrderRegReqDto orderRegReqDto){
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<String> modifyOrder(OrderUpdateReqDto orderUpdateReqDto){
        orderSvc.modifyOrder(orderUpdateReqDto);
        return new ResponseEntity<>("ok",HttpStatus.OK);
    }

}
