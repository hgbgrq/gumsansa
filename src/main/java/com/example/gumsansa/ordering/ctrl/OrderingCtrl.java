package com.example.gumsansa.ordering.ctrl;

import com.example.gumsansa.common.FileDto;
import com.example.gumsansa.ordering.dto.req.OrderReadReqDto;
import com.example.gumsansa.ordering.dto.req.OrderUpdateReqDto;
import com.example.gumsansa.ordering.dto.res.OrderReadListDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderingCtrl {

    @GetMapping
    public ResponseEntity<OrderReadListDto> getOrderList(OrderReadReqDto orderReadReqDto){
        OrderReadListDto result = null;
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/upload")
    public ResponseEntity<String> getFile(FileDto fileDto){
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<String> modifyOrder(OrderUpdateReqDto orderUpdateReqDto){
        return new ResponseEntity<>("ok",HttpStatus.OK);
    }


}
