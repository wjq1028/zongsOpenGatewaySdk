package com.zongs365.open.api.request.order;

import com.zongs365.open.api.request.base.BaseRequest;
import com.zongs365.open.api.request.base.BaseRequestBody;
import com.zongs365.open.api.response.order.OrderCloseResponse;
import com.zongs365.open.api.response.order.OrderCreateResponse;
import lombok.Data;

import java.util.List;


public class OrderCloseRequest extends BaseRequest<OrderCloseRequest.OrderCloseRequestBody, OrderCloseResponse> {


    @Override
    public Class<OrderCloseResponse> getResponseClass() {
        return OrderCloseResponse.class;
    }

    @Override
    public void setBody(OrderCloseRequestBody body) {
        this.body = body;
    }

    @Override
    public String getMethod() {
        return "zs.order.close";
    }

    @Data
    public static class OrderCloseRequestBody extends BaseRequestBody {
        private String orderId;
        private String outTradeNo;
    }
}
