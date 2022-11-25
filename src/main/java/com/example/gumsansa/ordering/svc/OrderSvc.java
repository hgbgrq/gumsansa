package com.example.gumsansa.ordering.svc;

import com.example.gumsansa.common.FileDto;
import com.example.gumsansa.ordering.dto.req.OrderReadReqDto;
import com.example.gumsansa.ordering.dto.req.OrderUpdateReqDto;
import com.example.gumsansa.ordering.dto.res.OrderReadListDto;

public interface OrderSvc {

    OrderReadListDto selectOrderList(OrderReadReqDto orderReadReqDto);

    void uploadOrderFile(FileDto fileDto);

    void modifyOrder(OrderUpdateReqDto orderUpdateReqDto);


}
