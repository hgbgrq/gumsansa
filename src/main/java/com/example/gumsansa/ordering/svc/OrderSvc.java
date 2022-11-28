package com.example.gumsansa.ordering.svc;

import com.example.gumsansa.common.FileDto;
import com.example.gumsansa.ordering.dto.req.OrderReadReqDto;
import com.example.gumsansa.ordering.dto.req.OrderUpdateReqDto;
import com.example.gumsansa.ordering.dto.res.OrderFileResDto;
import com.example.gumsansa.ordering.dto.res.OrderReadListDto;

public interface OrderSvc {

    OrderReadListDto selectOrderList(OrderReadReqDto orderReadReqDto);

    OrderFileResDto uploadOrderFile(FileDto fileDto);

    void modifyOrder(OrderUpdateReqDto orderUpdateReqDto);


}
